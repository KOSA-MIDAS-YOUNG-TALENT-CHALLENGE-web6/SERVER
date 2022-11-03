package com.example.server.global.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/server/global/security/FilterConfig;", "Lorg/springframework/security/config/annotation/SecurityConfigurerAdapter;", "Lorg/springframework/security/web/DefaultSecurityFilterChain;", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "jwtTokenParser", "Lcom/example/server/global/security/jwt/JwtTokenParser;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/example/server/global/security/jwt/JwtTokenParser;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "configure", "", "builder", "server"})
public final class FilterConfig extends org.springframework.security.config.annotation.SecurityConfigurerAdapter<org.springframework.security.web.DefaultSecurityFilterChain, org.springframework.security.config.annotation.web.builders.HttpSecurity> {
    private final com.example.server.global.security.jwt.JwtTokenParser jwtTokenParser = null;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    public FilterConfig(@org.jetbrains.annotations.NotNull
    com.example.server.global.security.jwt.JwtTokenParser jwtTokenParser, @org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
    
    @java.lang.Override
    public void configure(@org.jetbrains.annotations.NotNull
    org.springframework.security.config.annotation.web.builders.HttpSecurity builder) {
    }
}