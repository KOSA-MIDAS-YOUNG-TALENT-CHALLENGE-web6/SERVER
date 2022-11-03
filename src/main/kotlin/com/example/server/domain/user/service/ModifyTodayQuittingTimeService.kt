package com.example.server.domain.user.service

import com.example.server.domain.user.facade.UserFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Service
class ModifyTodayQuittingTimeService(
    private val userFacade: UserFacade
) {

    @Transactional
    fun execute() {
        val user = userFacade.getCurrentUser()

        user.modifyTodayQuittingTime(LocalDateTime.now())
    }
}