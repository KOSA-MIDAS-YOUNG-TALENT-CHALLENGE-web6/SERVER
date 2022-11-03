package com.example.server.global.security.jwt.exception

import com.example.server.global.error.GlobalException
import com.example.server.global.security.jwt.exception.properties.JwtErrorCode

object UnexpectedTokenException : GlobalException(JwtErrorCode.UNEXPECTED_TOKEN) {
    val EXCEPTION = UnexpectedTokenException
}