package com.example.server.global.security.jwt.exception

import com.example.server.global.error.GlobalException
import com.example.server.global.security.jwt.exception.properties.JwtErrorCode

object JwtValidateException : GlobalException(JwtErrorCode.JWT_VALIDATE_FAILED) {
    val EXCEPTION = JwtValidateException
}