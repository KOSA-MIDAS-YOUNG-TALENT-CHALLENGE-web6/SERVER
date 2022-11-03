package com.example.server.global.security.jwt

import com.example.server.global.security.auth.AuthDetailsService
import com.example.server.global.security.jwt.exception.ExpiredTokenException
import com.example.server.global.security.jwt.exception.JwtValidateException
import com.example.server.global.security.jwt.exception.SignatureTokenException
import com.example.server.global.security.jwt.exception.UnexpectedTokenException
import com.example.server.global.security.jwt.properties.JwtProperties
import io.jsonwebtoken.Claims
import io.jsonwebtoken.ExpiredJwtException
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.MalformedJwtException
import io.jsonwebtoken.SignatureException
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Component
import javax.servlet.http.HttpServletRequest

@Component
class JwtTokenParser(
    private val jwtProperties: JwtProperties,
    private val authDetailsService: AuthDetailsService
) {
    companion object {
        private const val JWT_HEADER = "Authorization"
        private const val JWT_PREFIX = "Bearer "
    }

    fun getAuthentication(token: String?): Authentication? {
        return token?.let {
            val userDetails: UserDetails = authDetailsService.loadUserByUsername(getTokenSubject(token))

            return UsernamePasswordAuthenticationToken(userDetails, "", userDetails.authorities)
        }
    }

    fun resolveToken(httpServletRequest: HttpServletRequest): String? {
        val bearerToken: String? = httpServletRequest.getHeader(JWT_HEADER)
        return parseToken(bearerToken)
    }

    fun parseToken(token: String?): String? {
        return if (token != null && token.startsWith(JWT_PREFIX)) {
            return token.replace(JWT_PREFIX, "")
        } else null
    }

    private fun getTokenSubject(subject: String): String {
        return parseTokenBody(subject).subject
    }

    private fun parseTokenBody(token: String): Claims {
        return try {
            Jwts.parser().setSigningKey(jwtProperties.secretKey)
                .parseClaimsJws(token).body
        } catch (e: Exception) {
            when (e) {
                is ExpiredJwtException -> throw ExpiredTokenException.EXCEPTION
                is SignatureException -> throw SignatureTokenException.EXCEPTION
                is MalformedJwtException -> throw JwtValidateException.EXCEPTION
                else -> throw UnexpectedTokenException.EXCEPTION
            }
        }
    }
}