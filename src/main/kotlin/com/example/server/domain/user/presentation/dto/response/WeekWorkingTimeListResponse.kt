package com.example.server.domain.user.presentation.dto.response

data class WeekWorkingTimeListResponse(
    val userId: Int,
    val officeGoingTimeList: List<OfficeGoingTimeElement>?,
    val quittingTimeList: List<QuittingTimeElement>?
)