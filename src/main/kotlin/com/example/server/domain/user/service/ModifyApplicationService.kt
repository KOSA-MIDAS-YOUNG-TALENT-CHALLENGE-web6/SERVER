package com.example.server.domain.user.service

import com.example.server.domain.user.domain.type.Role
import com.example.server.domain.user.exception.UserNotAdminException
import com.example.server.domain.user.facade.UserFacade
import com.example.server.domain.user.presentation.dto.request.ModifyApplicationRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ModifyApplicationService(
    private val userFacade: UserFacade
) {

    @Transactional
    fun execute(userId: Int, request: ModifyApplicationRequest) {
        val user = userFacade.getUserById(userId)

        if (user.userRole != Role.ADMIN) {
            throw UserNotAdminException.EXCEPTION
        }

        user.modifyApplication(request.application)
    }
}