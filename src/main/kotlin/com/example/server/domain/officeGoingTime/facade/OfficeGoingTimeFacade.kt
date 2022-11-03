package com.example.server.domain.officeGoingTime.facade

import com.example.server.domain.officeGoingTime.domain.OfficeGoingTime
import com.example.server.domain.officeGoingTime.domain.repository.OfficeGoingTimeRepository
import com.example.server.domain.officeGoingTime.exception.OfficeGoingTimeNotFoundException
import com.example.server.domain.user.domain.User
import org.springframework.stereotype.Component

@Component
class OfficeGoingTimeFacade(
    private val officeGoingTimeRepository: OfficeGoingTimeRepository
) {

    fun getOfficeGoingTimeByUser(user: User): List<OfficeGoingTime>? {
        return officeGoingTimeRepository.findAllByUser(user)
            ?: throw OfficeGoingTimeNotFoundException.EXCEPTION
    }
}