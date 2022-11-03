package com.example.server.global.error.properties

enum class GlobalErrorCode(
    override val errorStatus: Int,
    override val errorMessage: String
) : ErrorProperty {

    IMAGE_NOT_FOUND(404, "Image Not Found"),
    INVALID_EXTENSION_FORMAT(401, "Invalid Extension Format"),

    INTERNAL_SERVER_ERROR(500, "Internal Server Error")
}