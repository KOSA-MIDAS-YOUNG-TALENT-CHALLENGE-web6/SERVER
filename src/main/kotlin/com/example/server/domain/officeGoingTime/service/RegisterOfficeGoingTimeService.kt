package com.example.server.domain.officeGoingTime.service

import com.example.server.domain.officeGoingTime.domain.OfficeGoingTime
import com.example.server.domain.officeGoingTime.domain.repository.OfficeGoingTimeRepository
import com.example.server.domain.user.facade.UserFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Service
class RegisterOfficeGoingTimeService(
    private val userFacade: UserFacade,
    private val officeGoingTimeRepository: OfficeGoingTimeRepository
) {

    @Transactional
    fun execute() {
        val user = userFacade.getCurrentUser()

        val officeGoingTime = OfficeGoingTime(
            time = LocalDateTime.now(),
            user = user
        )

        user.setOfficeGoingTrue()
        user.setQuittingFalse()

        officeGoingTimeRepository.save(officeGoingTime)
    }
}