package com.example.server.global.security.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/server/global/security/auth/AuthDetails;", "Lorg/springframework/security/core/userdetails/UserDetails;", "user", "Lcom/example/server/domain/user/domain/User;", "(Lcom/example/server/domain/user/domain/User;)V", "getAuthorities", "", "Lorg/springframework/security/core/GrantedAuthority;", "getPassword", "", "getUsername", "isAccountNonExpired", "", "isAccountNonLocked", "isCredentialsNonExpired", "isEnabled", "server"})
public final class AuthDetails implements org.springframework.security.core.userdetails.UserDetails {
    private final com.example.server.domain.user.domain.User user = null;
    
    public AuthDetails(@org.jetbrains.annotations.NotNull
    com.example.server.domain.user.domain.User user) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getUsername() {
        return null;
    }
    
    @java.lang.Override
    public boolean isAccountNonExpired() {
        return false;
    }
    
    @java.lang.Override
    public boolean isAccountNonLocked() {
        return false;
    }
    
    @java.lang.Override
    public boolean isCredentialsNonExpired() {
        return false;
    }
    
    @java.lang.Override
    public boolean isEnabled() {
        return false;
    }
}