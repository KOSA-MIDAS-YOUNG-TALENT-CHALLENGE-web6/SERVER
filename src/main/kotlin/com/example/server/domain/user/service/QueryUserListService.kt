package com.example.server.domain.user.service

import com.example.server.domain.user.domain.repository.UserRepository
import com.example.server.domain.user.domain.type.Role
import com.example.server.domain.user.presentation.dto.response.UserElement
import com.example.server.domain.user.presentation.dto.response.UserResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class QueryUserListService(
    private val userRepository: UserRepository
) {

    @Transactional(readOnly = true)
    fun execute(): UserResponse {
        val user = userRepository.findAll()
            .filter { it.userRole != Role.ADMIN }
            .map {
                UserElement(
                    id = it.id,
                    email = it.email,
                    name = it.name,
                    userApplication = it.userApplication,
                    userPosition = it.userPosition,
                    employeeId = it.employeeId,
                    isOfficeGoing = it.isOfficeGoing
                )
            }
        return UserResponse(user)
    }
}