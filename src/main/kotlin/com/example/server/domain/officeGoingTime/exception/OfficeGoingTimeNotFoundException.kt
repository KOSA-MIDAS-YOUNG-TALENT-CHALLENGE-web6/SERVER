package com.example.server.domain.officeGoingTime.exception

import com.example.server.domain.user.exception.properties.UserErrorCode
import com.example.server.global.error.GlobalException

object OfficeGoingTimeNotFoundException : GlobalException(UserErrorCode.OFFICE_GOING_TIME_NOT_FOUND) {
    val EXCEPTION = OfficeGoingTimeNotFoundException
}