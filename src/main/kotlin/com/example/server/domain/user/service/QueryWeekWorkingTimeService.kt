package com.example.server.domain.user.service

import com.example.server.domain.officeGoingTime.domain.repository.OfficeGoingTimeRepository
import com.example.server.domain.quittingTime.domain.repository.QuittingRepository
import com.example.server.domain.user.facade.UserFacade
import com.example.server.domain.user.presentation.dto.response.OfficeGoingTimeElement
import com.example.server.domain.user.presentation.dto.response.QuittingTimeElement
import com.example.server.domain.user.presentation.dto.response.WeekWorkingTimeListResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Service
class QueryWeekWorkingTimeService(
    private val userFacade: UserFacade,
    private val officeGoingTimeRepository: OfficeGoingTimeRepository,
    private val quittingRepository: QuittingRepository
) {

    @Transactional(readOnly = true)
    fun execute(monday: LocalDateTime): WeekWorkingTimeListResponse {
        val user = userFacade.getCurrentUser()

        val officeGoingTimeList = officeGoingTimeRepository.findAllByUser(user)
            ?.filter {
                isWeek(monday)
            }?.map {
                OfficeGoingTimeElement(
                    officeGoingTime = it.time
                )
            }

        val quittingTimeList = quittingRepository.findAllByUser(user)
            ?.filter {
                isWeek(monday)
            }?.map {
                QuittingTimeElement(
                    quittingTime = it.time
                )
            }

        return WeekWorkingTimeListResponse(
            userId = user.id,
            officeGoingTimeList = officeGoingTimeList,
            quittingTimeList = quittingTimeList
        )
    }

    private fun isWeek(monday: LocalDateTime): Boolean {
        val week = LocalDateTime.now().plusWeeks(1)

        return monday.month <= week.month && monday.dayOfMonth <= week.dayOfMonth
    }
}