package com.example.server.domain.officeGoingTime.domain.repository

import com.example.server.domain.officeGoingTime.domain.OfficeGoingTime
import com.example.server.domain.user.domain.User
import org.springframework.data.repository.CrudRepository

interface OfficeGoingTimeRepository : CrudRepository<OfficeGoingTime, Int> {
    fun findAllByUser(user: User): List<OfficeGoingTime>?
}