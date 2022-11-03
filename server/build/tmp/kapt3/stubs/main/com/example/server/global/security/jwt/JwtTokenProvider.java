package com.example.server.global.security.jwt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0012J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/server/global/security/jwt/JwtTokenProvider;", "", "jwtProperties", "Lcom/example/server/global/security/jwt/properties/JwtProperties;", "(Lcom/example/server/global/security/jwt/properties/JwtProperties;)V", "generateToken", "", "email", "role", "Lcom/example/server/domain/user/domain/type/Role;", "expiration", "", "type", "getToken", "Lcom/example/server/global/security/jwt/dto/TokenResponse;", "Companion", "server"})
@org.springframework.stereotype.Component
public class JwtTokenProvider {
    private final com.example.server.global.security.jwt.properties.JwtProperties jwtProperties = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.server.global.security.jwt.JwtTokenProvider.Companion Companion = null;
    private static final java.lang.String ACCESS_KEY = "access";
    
    public JwtTokenProvider(@org.jetbrains.annotations.NotNull
    com.example.server.global.security.jwt.properties.JwtProperties jwtProperties) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.server.global.security.jwt.dto.TokenResponse getToken(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    com.example.server.domain.user.domain.type.Role role) {
        return null;
    }
    
    private java.lang.String generateToken(java.lang.String email, com.example.server.domain.user.domain.type.Role role, long expiration, java.lang.String type) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/server/global/security/jwt/JwtTokenProvider$Companion;", "", "()V", "ACCESS_KEY", "", "server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}