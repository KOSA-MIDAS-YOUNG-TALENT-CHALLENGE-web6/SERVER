package com.example.server.domain.user.exception

import com.example.server.domain.user.exception.properties.UserErrorCode
import com.example.server.global.error.GlobalException

object UserNotAdminException : GlobalException(UserErrorCode.USER_NOT_ADMIN) {
    val EXCEPTION = UserNotAdminException
}