package com.example.server.infrastructure.aws.image.exception

import com.example.server.global.error.GlobalException
import com.example.server.global.error.properties.GlobalErrorCode

object InvalidImageExtensionFormatException : GlobalException(GlobalErrorCode.INVALID_EXTENSION_FORMAT) {
    val EXCEPTION = InvalidImageExtensionFormatException
}