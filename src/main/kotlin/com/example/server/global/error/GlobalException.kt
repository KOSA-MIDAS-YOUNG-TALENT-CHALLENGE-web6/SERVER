package com.example.server.global.error

import com.example.server.global.error.properties.ErrorProperty

open class GlobalException(
    private val errorProperty: ErrorProperty
) : RuntimeException() {

    val errorStatus: Int
        get() = errorProperty.errorStatus

    val errorMessage
        get() = errorProperty.errorMessage

    override fun fillInStackTrace(): Throwable {
        return this
    }
}