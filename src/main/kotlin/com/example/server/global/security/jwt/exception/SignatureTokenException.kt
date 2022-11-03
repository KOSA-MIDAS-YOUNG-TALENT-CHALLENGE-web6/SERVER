package com.example.server.global.security.jwt.exception

import com.example.server.global.error.GlobalException
import com.example.server.global.security.jwt.exception.properties.JwtErrorCode

object SignatureTokenException : GlobalException(JwtErrorCode.JWT_SIGNATURE) {
    val EXCEPTION = SignatureTokenException
}