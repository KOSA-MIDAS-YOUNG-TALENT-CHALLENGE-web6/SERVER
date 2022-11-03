package com.example.server.global.security.jwt

import com.example.server.domain.user.domain.type.Role
import com.example.server.global.security.jwt.dto.TokenResponse
import com.example.server.global.security.jwt.properties.JwtProperties
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.stereotype.Component
import java.util.*

@Component
class JwtTokenProvider(
    private val jwtProperties: JwtProperties,
) {
    companion object {
        private const val ACCESS_KEY = "access"
    }

    fun getToken(email: String, role: Role): TokenResponse {
        val accessToken: String = generateToken(email, role, jwtProperties.accessExp, ACCESS_KEY)

        return TokenResponse(accessToken = accessToken)
    }

    private fun generateToken(email: String, role: Role, expiration: Long, type: String): String {
        return Jwts.builder()
            .signWith(SignatureAlgorithm.HS256, jwtProperties.secretKey)
            .setSubject(email)
            .setHeaderParam("type", type)
            .claim("role", role)
            .setIssuedAt(Date())
            .setExpiration(Date(System.currentTimeMillis() + expiration * 1000))
            .compact()
    }
}