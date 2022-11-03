package com.example.server.global.security.jwt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0012J\u0014\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0012J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/server/global/security/jwt/JwtTokenParser;", "", "jwtProperties", "Lcom/example/server/global/security/jwt/properties/JwtProperties;", "authDetailsService", "Lcom/example/server/global/security/auth/AuthDetailsService;", "(Lcom/example/server/global/security/jwt/properties/JwtProperties;Lcom/example/server/global/security/auth/AuthDetailsService;)V", "getAuthentication", "Lorg/springframework/security/core/Authentication;", "token", "", "getTokenSubject", "subject", "parseToken", "parseTokenBody", "Lio/jsonwebtoken/Claims;", "resolveToken", "httpServletRequest", "Ljavax/servlet/http/HttpServletRequest;", "Companion", "server"})
@org.springframework.stereotype.Component
public class JwtTokenParser {
    private final com.example.server.global.security.jwt.properties.JwtProperties jwtProperties = null;
    private final com.example.server.global.security.auth.AuthDetailsService authDetailsService = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.server.global.security.jwt.JwtTokenParser.Companion Companion = null;
    private static final java.lang.String JWT_HEADER = "Authorization";
    private static final java.lang.String JWT_PREFIX = "Bearer ";
    
    public JwtTokenParser(@org.jetbrains.annotations.NotNull
    com.example.server.global.security.jwt.properties.JwtProperties jwtProperties, @org.jetbrains.annotations.NotNull
    com.example.server.global.security.auth.AuthDetailsService authDetailsService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public org.springframework.security.core.Authentication getAuthentication(@org.jetbrains.annotations.Nullable
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String resolveToken(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest httpServletRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String parseToken(@org.jetbrains.annotations.Nullable
    java.lang.String token) {
        return null;
    }
    
    private java.lang.String getTokenSubject(java.lang.String subject) {
        return null;
    }
    
    private io.jsonwebtoken.Claims parseTokenBody(java.lang.String token) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/server/global/security/jwt/JwtTokenParser$Companion;", "", "()V", "JWT_HEADER", "", "JWT_PREFIX", "server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}