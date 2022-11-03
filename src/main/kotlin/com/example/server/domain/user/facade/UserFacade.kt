package com.example.server.domain.user.facade

import com.example.server.domain.user.domain.User
import com.example.server.domain.user.domain.repository.UserRepository
import com.example.server.domain.user.exception.UserNotFoundException
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component

@Component
class UserFacade(
    private val userRepository: UserRepository
) {

    fun getCurrentUser(): User {
        val email = SecurityContextHolder.getContext().authentication.name
        return getUserByEmail(email)
    }

    fun getUserByEmail(email: String): User {
        return userRepository.findUserByEmail(email) ?: throw UserNotFoundException.EXCEPTION
    }
}