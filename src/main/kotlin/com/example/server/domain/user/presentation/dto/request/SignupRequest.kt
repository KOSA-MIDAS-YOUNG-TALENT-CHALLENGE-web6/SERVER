package com.example.server.domain.user.presentation.dto.request

import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Pattern

data class SignupRequest(

    @field: Email
    @field: NotBlank(message = "email은 필수 입력입니다.")
    val email: String,

    val name: String,

    @field:Pattern(
        regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}$",
        message = "password는 영문자와 숫자, 특수문자를 모두 포함해서 8~16자리 이내로 입력해주세요."
    )
    val password: String
)