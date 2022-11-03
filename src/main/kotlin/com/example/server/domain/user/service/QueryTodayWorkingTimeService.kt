package com.example.server.domain.user.service

import com.example.server.domain.officeGoingTime.domain.repository.OfficeGoingTimeRepository
import com.example.server.domain.quittingTime.domain.repository.QuittingRepository
import com.example.server.domain.user.facade.UserFacade
import com.example.server.domain.user.presentation.dto.response.TodayWorkingTimeResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Service
class QueryTodayWorkingTimeService(
    private val userFacade: UserFacade,
    private val officeGoingTimeRepository: OfficeGoingTimeRepository,
    private val quittingRepository: QuittingRepository
) {

    @Transactional(readOnly = true)
    fun execute(): TodayWorkingTimeResponse {
        val user = userFacade.getCurrentUser()

        val officeGoingTime = officeGoingTimeRepository.findAllByUser(user)
            ?.filter {
                isToday(it.time)
            }.toString()

        val quittingTIme = quittingRepository.findAllByUser(user)
            ?.filter {
                isToday(it.time)
            }.toString()

        return TodayWorkingTimeResponse(
            userId = user.id,
            todayOfficeGoingTime = officeGoingTime,
            todayQuittingTime = quittingTIme
        )
    }

    private fun isToday(today: LocalDateTime): Boolean {
        val month = LocalDateTime.now().month
        val day = LocalDateTime.now().dayOfMonth

        return month == today.month && day == today.dayOfMonth
    }
}