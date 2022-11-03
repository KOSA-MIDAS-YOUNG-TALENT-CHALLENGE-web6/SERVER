package com.example.server.domain.user.exception

import com.example.server.domain.user.exception.properties.UserErrorCode
import com.example.server.global.error.GlobalException

object UserNotFoundException : GlobalException(UserErrorCode.USER_NOT_FOUND) {
    val EXCEPTION = UserNotFoundException
}