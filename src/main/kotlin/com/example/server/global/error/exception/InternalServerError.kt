package com.example.server.global.error.exception

import com.example.server.global.error.GlobalException
import com.example.server.global.error.properties.GlobalErrorCode

object InternalServerError : GlobalException(GlobalErrorCode.INTERNAL_SERVER_ERROR) {
    val EXCEPTION = InternalServerError
}