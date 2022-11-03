package com.example.server.global.security.jwt.exception

import com.example.server.global.error.GlobalException
import com.example.server.global.security.jwt.exception.properties.JwtErrorCode

object ExpiredTokenException : GlobalException(JwtErrorCode.JWT_EXPIRED) {
    val EXCEPTION = ExpiredTokenException
}