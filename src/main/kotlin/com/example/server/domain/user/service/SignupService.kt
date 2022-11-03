package com.example.server.domain.user.service

import com.example.server.domain.user.domain.User
import com.example.server.domain.user.domain.repository.UserRepository
import com.example.server.domain.user.domain.type.Role
import com.example.server.domain.user.exception.PasswordMissMatchedException
import com.example.server.domain.user.exception.UserAlreadyExistsException
import com.example.server.domain.user.presentation.dto.request.SignupRequest
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SignupService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {
    @Transactional
    fun execute(request: SignupRequest) {

        if (request.password != request.rePassword) {
            throw PasswordMissMatchedException.EXCEPTION
        }

        if (userRepository.existsByEmail(request.email)) {
            throw UserAlreadyExistsException.EXCEPTION
        }

        userRepository.save(
            User(
                email = request.email,
                name = request.name,
                role = Role.WORKER,
                password = passwordEncoder.encode(request.password)
            )
        )
    }
}