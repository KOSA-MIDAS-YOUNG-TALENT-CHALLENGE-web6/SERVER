package com.example.server.domain.user.exception

import com.example.server.domain.user.exception.properties.UserErrorCode
import com.example.server.global.error.GlobalException

object PasswordMissMatchedException : GlobalException(UserErrorCode.PASSWORD_MISS_MATCHED) {
    val EXCEPTION = PasswordMissMatchedException
}