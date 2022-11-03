package com.example.server.domain.user.domain.repository

import com.example.server.domain.user.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int> {

    fun existsByEmail(email: String): Boolean

    fun findUserByEmail(email:String): User?
}