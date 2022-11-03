package com.example.server.domain.user.exception.properties

import com.example.server.global.error.properties.ErrorProperty

enum class UserErrorCode(
    override val errorStatus: Int,
    override val errorMessage: String
) : ErrorProperty {

    USER_NOT_ADMIN(401, "User Not Admin"),
    USER_NOT_FOUND(404, "User Not Found"),
    USER_ALREADY_EXISTS(409, "User Already Exists"),

    PASSWORD_MISS_MATCHED(409, "Password Miss Matched")
}