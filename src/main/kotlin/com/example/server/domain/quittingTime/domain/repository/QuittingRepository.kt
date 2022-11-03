package com.example.server.domain.quittingTime.domain.repository

import com.example.server.domain.officeGoingTime.domain.OfficeGoingTime
import com.example.server.domain.quittingTime.domain.QuittingTime
import com.example.server.domain.user.domain.User
import org.springframework.data.repository.CrudRepository

interface QuittingRepository : CrudRepository<QuittingTime, Int> {
    fun findAllByUser(user: User): List<QuittingTime>?
}