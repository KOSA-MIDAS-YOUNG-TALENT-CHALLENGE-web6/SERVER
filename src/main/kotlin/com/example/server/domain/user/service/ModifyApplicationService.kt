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
    fun execute(request: ModifyApplicationRequest) {
        val user = userFacade.getCurrentUser()

        if (!user.application.equals(Role.ADMIN)) {
            throw UserNotAdminException.EXCEPTION
        }

        user.modifyPosition(request.application)
    }
}