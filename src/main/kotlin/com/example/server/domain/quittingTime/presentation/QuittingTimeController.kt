package com.example.server.domain.quittingTime.presentation

import com.example.server.domain.quittingTime.service.RegisterQuittingService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@Tag(name = "퇴근", description = "퇴근 관련 API 입니다.")
@RequestMapping("/quitting")
@RestController
class QuittingTimeController(
    private val registerQuittingService: RegisterQuittingService
) {

    @Operation(summary = "퇴근 등록")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun registerOfficeGoingTime() {
        registerQuittingService.execute()
    }
}