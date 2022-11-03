package com.example.server.domain.user.service

import com.example.server.domain.user.exception.PasswordMissMatchedException
import com.example.server.domain.user.facade.UserFacade
import com.example.server.domain.user.presentation.dto.request.LoginRequest
import com.example.server.global.security.jwt.JwtTokenProvider
import com.example.server.global.security.jwt.dto.TokenResponse
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class LoginService(
    private val userFacade: UserFacade,
    private val passwordEncoder: PasswordEncoder,
    private val jwtTokenProvider: JwtTokenProvider
) {

    @Transactional
    fun execute(request: LoginRequest): TokenResponse {
        val user = userFacade.getUserByEmail(request.email)

        if (!passwordEncoder.matches(request.password, user.password)) {
            throw PasswordMissMatchedException.EXCEPTION
        }

        val token = jwtTokenProvider.getToken(request.email, user.role)

        return TokenResponse(token.accessToken)
    }
}