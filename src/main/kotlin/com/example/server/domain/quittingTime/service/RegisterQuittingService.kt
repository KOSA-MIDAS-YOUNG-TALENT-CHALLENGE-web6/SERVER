package com.example.server.domain.quittingTime.service

import com.example.server.domain.quittingTime.domain.QuittingTime
import com.example.server.domain.quittingTime.domain.repository.QuittingRepository
import com.example.server.domain.user.facade.UserFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Service
class RegisterQuittingService(
    private val userFacade: UserFacade,
    private val quittingRepository: QuittingRepository
) {

    @Transactional
    fun execute() {
        val user = userFacade.getCurrentUser()

        val quittingTime = QuittingTime(
            time = LocalDateTime.now(),
            user = user
        )

        user.setOfficeGoingFalse()
        user.setQuittingTrue()

        quittingRepository.save(quittingTime)
    }
}