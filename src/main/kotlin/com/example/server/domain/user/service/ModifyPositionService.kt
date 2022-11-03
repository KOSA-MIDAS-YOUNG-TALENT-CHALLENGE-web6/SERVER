package com.example.server.domain.user.service

import com.example.server.domain.user.domain.type.Role
import com.example.server.domain.user.exception.UserNotAdminException
import com.example.server.domain.user.facade.UserFacade
import com.example.server.domain.user.presentation.dto.request.ModifyPositionRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ModifyPositionService(
    private val userFacade: UserFacade
) {

    @Transactional
    fun execute(userId: Int, request: ModifyPositionRequest) {
        val user = userFacade.getUserById(userId)

        if (!user.userPosition.equals(Role.ADMIN)) {
            throw UserNotAdminException.EXCEPTION
        }

        user.modifyPosition(request.position)
    }
}