package com.example.server.domain.user.service

import com.example.server.domain.user.facade.UserFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class VerifyUserService(
    private val userFacade: UserFacade
) {

    @Transactional
    fun execute(image: String) {
        val user = userFacade.getCurrentUser()

        user.verifyUser(true, image)
    }
}