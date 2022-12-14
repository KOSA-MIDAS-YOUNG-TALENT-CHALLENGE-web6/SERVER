package com.example.server.global.filter

import com.example.server.global.error.GlobalException
import com.example.server.global.error.exception.InternalServerError
import com.example.server.global.error.properties.ErrorResponse
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.http.MediaType
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class ExceptionFilter(
    private val objectMapper: ObjectMapper
) : OncePerRequestFilter() {
    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        try {
            filterChain.doFilter(request, response)
        } catch (exception: Exception) {
            exception.printStackTrace()
            when (exception) {
                is GlobalException -> writeErrorCode(exception, response)
                else -> writeErrorCode(InternalServerError, response)
            }
        }
    }

    private fun writeErrorCode(exception: GlobalException, response: HttpServletResponse) {
        val errorResponse = ErrorResponse.of(exception)

        response.contentType = MediaType.APPLICATION_JSON_VALUE
        response.status = errorResponse.errorStatus
        response.writer.write(objectMapper.writeValueAsString(errorResponse))
    }
}