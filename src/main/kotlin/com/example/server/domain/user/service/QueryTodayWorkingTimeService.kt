package com.example.server.domain.user.service

import com.example.server.domain.user.facade.UserFacade
import com.example.server.domain.user.presentation.dto.response.TodayWorkingTimeResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class QueryTodayWorkingTimeService(
    private val userFacade: UserFacade
) {

    @Transactional(readOnly = true)
    fun execute(): TodayWorkingTimeResponse {
        val user = userFacade.getCurrentUser()

        return TodayWorkingTimeResponse(
            userId = user.id,
            todayOfficeGoingTime = user.todayOfficeGoingTime,
            todayQuittingTime = user.todayQuittingTime
        )
    }
}