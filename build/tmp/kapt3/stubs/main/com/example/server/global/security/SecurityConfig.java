package com.example.server.global.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0015J\b\u0010\u000b\u001a\u00020\fH\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/server/global/security/SecurityConfig;", "", "jwtTokenParser", "Lcom/example/server/global/security/jwt/JwtTokenParser;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/example/server/global/security/jwt/JwtTokenParser;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "filterChain", "Lorg/springframework/security/web/SecurityFilterChain;", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "passwordEncoder", "Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "server"})
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
public class SecurityConfig {
    private final com.example.server.global.security.jwt.JwtTokenParser jwtTokenParser = null;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    public SecurityConfig(@org.jetbrains.annotations.NotNull
    com.example.server.global.security.jwt.JwtTokenParser jwtTokenParser, @org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.springframework.context.annotation.Bean
    protected org.springframework.security.web.SecurityFilterChain filterChain(@org.jetbrains.annotations.NotNull
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    protected org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder passwordEncoder() {
        return null;
    }
}