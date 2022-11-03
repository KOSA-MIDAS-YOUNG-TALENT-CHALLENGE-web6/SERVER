package com.example.server.domain.user.service

import com.example.server.domain.user.domain.repository.UserRepository
import com.example.server.domain.user.presentation.dto.response.UserElement
import com.example.server.domain.user.presentation.dto.response.UserListResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class QueryUserOfficeGoingService(
    private val userRepository: UserRepository
) {
    @Transactional(readOnly = true)
    fun execute(): UserListResponse {
        val list = userRepository.findAll()
            .filter {
                it.isOfficeGoing
            }.map {
                UserElement(
                    id = it.id,
                    email = it.email,
                    name = it.name,
                    userApplication = it.userApplication,
                    userPosition = it.userPosition,
                    employeeId = it.employeeId
                )
            }

        return UserListResponse(list)
    }
}