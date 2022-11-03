package com.example.server.domain.user.exception

import com.example.server.domain.user.exception.properties.UserErrorCode
import com.example.server.global.error.GlobalException

object UserAlreadyExistsException : GlobalException(UserErrorCode.USER_ALREADY_EXISTS) {
    val EXCEPTION = UserAlreadyExistsException
}