package com.example.server.domain.user.presentation

import com.example.server.domain.user.presentation.dto.request.LoginRequest
import com.example.server.domain.user.presentation.dto.request.ModifyApplicationRequest
import com.example.server.domain.user.presentation.dto.request.ModifyPositionRequest
import com.example.server.domain.user.presentation.dto.request.SignupRequest
import com.example.server.domain.user.presentation.dto.request.VerifyUserRequest
import com.example.server.domain.user.service.LoginService
import com.example.server.domain.user.service.ModifyApplicationService
import com.example.server.domain.user.service.ModifyPositionService
import com.example.server.domain.user.service.ModifyTodayOfficeGoingTimeService
import com.example.server.domain.user.service.ModifyTodayQuittingTimeService
import com.example.server.domain.user.service.QueryTodayWorkingTimeService
import com.example.server.domain.user.service.SignupService
import com.example.server.domain.user.service.VerifyUserService
import com.example.server.global.security.jwt.dto.TokenResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@Tag(name = "유저", description = "유저 관련 API입니다.")
@RequestMapping("/user")
@RestController
class UserController(
    private val signupService: SignupService,
    private val loginService: LoginService,
    private val modifyApplicationService: ModifyApplicationService,
    private val modifyPositionService: ModifyPositionService,
    private val verifyUserService: VerifyUserService,
    private val modifyTodayOfficeGoingTimeService: ModifyTodayOfficeGoingTimeService,
    private val modifyTodayQuittingTimeService: ModifyTodayQuittingTimeService,
    private val queryTodayWorkingTimeService: QueryTodayWorkingTimeService
) {

    @Operation(summary = "회원가입")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun signup(@Valid @RequestBody request: SignupRequest) {
        signupService.execute(request)
    }

    @Operation(summary = "로그인")
    @PostMapping("/login")
    fun login(@Valid @RequestBody request: LoginRequest): TokenResponse {
        return loginService.execute(request)
    }

    @Operation(summary = "소속 수정하기")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/application")
    fun modifyApplication(@Valid @RequestBody request: ModifyApplicationRequest) {
        modifyApplicationService.execute(request);
    }

    @Operation(summary = "직급 수정하기")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/position")
    fun modifyPosition(@Valid @RequestBody request: ModifyPositionRequest) {
        modifyPositionService.execute(request);
    }

    @Operation(summary = "사원증 등록하기")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/verify")
    fun verifyUser(@Valid @RequestBody request: VerifyUserRequest) {
        verifyUserService.execute(request);
    }

    @Operation(summary = "출근 시간 등록")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/officegoing")
    fun modifyTodayOfficeGoingTime() {
        modifyTodayOfficeGoingTimeService.execute();
    }

    @Operation(summary = "퇴근 시간 등록")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/quittingtime")
    fun modifyTodayQuittingTime() {
        modifyTodayQuittingTimeService.execute();
    }

    @Operation(summary = "오늘 총 근로 시간 조회")
    @GetMapping("/today")
    fun getTodayWorkingTime() {
        queryTodayWorkingTimeService.execute();
    }
}