package com.example.server.global.error

import com.example.server.global.error.properties.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(GlobalException::class)
    fun handleGlobalException(exception: GlobalException): ResponseEntity<ErrorResponse<Unit>> {
        return handleException(exception)
    }

    private fun handleException(e: GlobalException): ResponseEntity<ErrorResponse<Unit>> {
        val status = HttpStatus.valueOf(e.errorStatus)
        val body = ErrorResponse.of(e)
        return ResponseEntity(body, status)
    }
}
