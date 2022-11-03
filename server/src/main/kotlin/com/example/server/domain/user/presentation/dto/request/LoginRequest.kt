package com.example.server.domain.user.presentation.dto.request

data class LoginRequest(
    val email: String,
    val password: String
)