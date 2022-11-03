package com.example.server.domain.user.presentation.dto.response

data class UserElement(
    val id: Int,
    val email: String,
    val name: String,
    val userApplication: String,
    val userPosition: String,
    val employeeId: String
)