package com.example.server.domain.user.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/server/domain/user/service/SignupService;", "", "userRepository", "Lcom/example/server/domain/user/domain/repository/UserRepository;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "(Lcom/example/server/domain/user/domain/repository/UserRepository;Lorg/springframework/security/crypto/password/PasswordEncoder;)V", "execute", "", "request", "Lcom/example/server/domain/user/presentation/dto/request/SignupRequest;", "server"})
@org.springframework.stereotype.Service
public class SignupService {
    private final com.example.server.domain.user.domain.repository.UserRepository userRepository = null;
    private final org.springframework.security.crypto.password.PasswordEncoder passwordEncoder = null;
    
    public SignupService(@org.jetbrains.annotations.NotNull
    com.example.server.domain.user.domain.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional
    public void execute(@org.jetbrains.annotations.NotNull
    com.example.server.domain.user.presentation.dto.request.SignupRequest request) {
    }
}