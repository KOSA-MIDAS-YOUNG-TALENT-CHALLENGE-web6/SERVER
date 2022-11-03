package com.example.server.domain.user.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/server/domain/user/service/LoginService;", "", "userFacade", "Lcom/example/server/domain/user/facade/UserFacade;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "jwtTokenProvider", "Lcom/example/server/global/security/jwt/JwtTokenProvider;", "(Lcom/example/server/domain/user/facade/UserFacade;Lorg/springframework/security/crypto/password/PasswordEncoder;Lcom/example/server/global/security/jwt/JwtTokenProvider;)V", "execute", "Lcom/example/server/global/security/jwt/dto/TokenResponse;", "request", "Lcom/example/server/domain/user/presentation/dto/request/LoginRequest;", "server"})
@org.springframework.stereotype.Service
public class LoginService {
    private final com.example.server.domain.user.facade.UserFacade userFacade = null;
    private final org.springframework.security.crypto.password.PasswordEncoder passwordEncoder = null;
    private final com.example.server.global.security.jwt.JwtTokenProvider jwtTokenProvider = null;
    
    public LoginService(@org.jetbrains.annotations.NotNull
    com.example.server.domain.user.facade.UserFacade userFacade, @org.jetbrains.annotations.NotNull
    org.springframework.security.crypto.password.PasswordEncoder passwordEncoder, @org.jetbrains.annotations.NotNull
    com.example.server.global.security.jwt.JwtTokenProvider jwtTokenProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.transaction.annotation.Transactional
    public com.example.server.global.security.jwt.dto.TokenResponse execute(@org.jetbrains.annotations.NotNull
    com.example.server.domain.user.presentation.dto.request.LoginRequest request) {
        return null;
    }
}