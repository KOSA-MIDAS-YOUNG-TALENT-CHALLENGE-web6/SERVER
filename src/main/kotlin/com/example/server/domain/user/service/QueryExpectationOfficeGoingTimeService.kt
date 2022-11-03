package com.example.server.domain.user.service

import com.example.server.domain.officeGoingTime.domain.repository.OfficeGoingTimeRepository
import com.example.server.domain.user.facade.UserFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class QueryExpectationOfficeGoingTimeService(
    private val userFacade: UserFacade,
    private val officeGoingTimeRepository: OfficeGoingTimeRepository
) {

    @Transactional(readOnly = true)
    fun execute(): Int {
        var average = 0
        var cnt = 0
        val user = userFacade.getCurrentUser()
        officeGoingTimeRepository.findAllByUser(user)
            ?.map {
                average += it.time.hour
                cnt += 1
            }

        return average / cnt
    }
}