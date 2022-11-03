package com.example.server.domain.user.presentation.dto.response

data class TodayWorkingTimeResponse(
    val userId: Int,
    val todayOfficeGoingTime: String,
    val todayQuittingTime: String
)