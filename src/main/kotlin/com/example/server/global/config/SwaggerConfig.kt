package com.example.server.global.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {
    @Bean
    fun openAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info().title("MIDAS Server API")
                    .description("MIDAS Server Api 명세서입니다.")
                    .version("v1")
            )
    }
}