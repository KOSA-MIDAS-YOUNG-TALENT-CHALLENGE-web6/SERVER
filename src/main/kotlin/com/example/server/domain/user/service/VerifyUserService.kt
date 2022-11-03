package com.example.server.domain.user.service

import com.example.server.domain.user.facade.UserFacade
import com.example.server.domain.user.presentation.dto.request.VerifyUserRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class VerifyUserService(
    private val userFacade: UserFacade
) {

    @Transactional
    fun execute(request: VerifyUserRequest) {
        val user = userFacade.getCurrentUser()

        user.verifyUser(true, request.image)
    }
}