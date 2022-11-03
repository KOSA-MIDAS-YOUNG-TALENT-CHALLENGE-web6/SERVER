package com.example.server.global.security.jwt.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import java.util.*

@ConstructorBinding
@ConfigurationProperties(prefix = "jwt")
data class JwtProperties(
    var secretKey: String,
    val accessExp: Long,
) {
    init {
        this.secretKey = Base64.getEncoder().encodeToString(secretKey.toByteArray())
    }
}