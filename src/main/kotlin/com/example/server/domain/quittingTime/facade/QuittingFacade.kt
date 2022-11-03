package com.example.server.domain.quittingTime.facade

import com.example.server.domain.quittingTime.domain.QuittingTime
import com.example.server.domain.quittingTime.domain.repository.QuittingRepository
import com.example.server.domain.quittingTime.exception.QuittingTimeNotFoundException
import com.example.server.domain.user.domain.User
import org.springframework.stereotype.Component

@Component
class QuittingFacade(
    private val quittingRepository: QuittingRepository
) {

    fun getQuittingTimeByUser(user: User): List<QuittingTime>? {
        return quittingRepository.findAllByUser(user) ?: throw QuittingTimeNotFoundException.EXCEPTION
    }

}