package com.example.server.infrastructure.aws.image.exception

import com.example.server.global.error.GlobalException
import com.example.server.global.error.properties.GlobalErrorCode

object ImageNotFoundException : GlobalException(GlobalErrorCode.IMAGE_NOT_FOUND) {
    val EXCEPTION = ImageNotFoundException
}