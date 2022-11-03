package com.example.server.domain.user.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\u0011H\u0017J\u0012\u0010\u0012\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\u0013H\u0017J\u0012\u0010\u0014\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\u0015H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/server/domain/user/presentation/UserController;", "", "signupService", "Lcom/example/server/domain/user/service/SignupService;", "loginService", "Lcom/example/server/domain/user/service/LoginService;", "modifyApplicationService", "Lcom/example/server/domain/user/service/ModifyApplicationService;", "modifyPositionService", "Lcom/example/server/domain/user/service/ModifyPositionService;", "(Lcom/example/server/domain/user/service/SignupService;Lcom/example/server/domain/user/service/LoginService;Lcom/example/server/domain/user/service/ModifyApplicationService;Lcom/example/server/domain/user/service/ModifyPositionService;)V", "login", "Lcom/example/server/global/security/jwt/dto/TokenResponse;", "request", "Lcom/example/server/domain/user/presentation/dto/request/LoginRequest;", "modifyApplication", "", "Lcom/example/server/domain/user/presentation/dto/request/ModifyApplicationRequest;", "modifyPosition", "Lcom/example/server/domain/user/presentation/dto/request/ModifyPositionRequest;", "signup", "Lcom/example/server/domain/user/presentation/dto/request/SignupRequest;", "server"})
@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping(value = {"/user"})
@io.swagger.v3.oas.annotations.tags.Tag(name = "\uc720\uc800", description = "\uc720\uc800 \uad00\ub828 API\uc785\ub2c8\ub2e4.")
public class UserController {
    private final com.example.server.domain.user.service.SignupService signupService = null;
    private final com.example.server.domain.user.service.LoginService loginService = null;
    private final com.example.server.domain.user.service.ModifyApplicationService modifyApplicationService = null;
    private final com.example.server.domain.user.service.ModifyPositionService modifyPositionService = null;
    
    public UserController(@org.jetbrains.annotations.NotNull
    com.example.server.domain.user.service.SignupService signupService, @org.jetbrains.annotations.NotNull
    com.example.server.domain.user.service.LoginService loginService, @org.jetbrains.annotations.NotNull
    com.example.server.domain.user.service.ModifyApplicationService modifyApplicationService, @org.jetbrains.annotations.NotNull
    com.example.server.domain.user.service.ModifyPositionService modifyPositionService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
    @io.swagger.v3.oas.annotations.Operation(summary = "\ud68c\uc6d0\uac00\uc785")
    public void signup(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    @javax.validation.Valid
    com.example.server.domain.user.presentation.dto.request.SignupRequest request) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/login"})
    @io.swagger.v3.oas.annotations.Operation(summary = "\ub85c\uadf8\uc778")
    public com.example.server.global.security.jwt.dto.TokenResponse login(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    @javax.validation.Valid
    com.example.server.domain.user.presentation.dto.request.LoginRequest request) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/application"})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
    @io.swagger.v3.oas.annotations.Operation(summary = "\uc18c\uc18d \uc218\uc815\ud558\uae30")
    public void modifyApplication(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    @javax.validation.Valid
    com.example.server.domain.user.presentation.dto.request.ModifyApplicationRequest request) {
    }
    
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/birthday"})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
    @io.swagger.v3.oas.annotations.Operation(summary = "\uc9c1\uae09 \uc218\uc815\ud558\uae30")
    public void modifyPosition(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    @javax.validation.Valid
    com.example.server.domain.user.presentation.dto.request.ModifyPositionRequest request) {
    }
}