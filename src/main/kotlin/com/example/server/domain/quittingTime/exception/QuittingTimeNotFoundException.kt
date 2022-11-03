package com.example.server.domain.quittingTime.exception

import com.example.server.domain.user.exception.properties.UserErrorCode
import com.example.server.global.error.GlobalException

object QuittingTimeNotFoundException : GlobalException(UserErrorCode.QUITTING_TIME_NOT_FOUND) {
    val EXCEPTION = QuittingTimeNotFoundException
}