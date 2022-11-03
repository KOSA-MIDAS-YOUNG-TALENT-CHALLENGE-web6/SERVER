package com.example.server.global.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0012J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\n\u001a\u00020\bH\u0017\u00a8\u0006\u000b"}, d2 = {"Lcom/example/server/global/error/GlobalExceptionHandler;", "", "()V", "handleException", "Lorg/springframework/http/ResponseEntity;", "Lcom/example/server/global/error/properties/ErrorResponse;", "", "e", "Lcom/example/server/global/error/GlobalException;", "handleGlobalException", "exception", "server"})
@org.springframework.web.bind.annotation.RestControllerAdvice
public class GlobalExceptionHandler {
    
    public GlobalExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {com.example.server.global.error.GlobalException.class})
    public org.springframework.http.ResponseEntity<com.example.server.global.error.properties.ErrorResponse<kotlin.Unit>> handleGlobalException(@org.jetbrains.annotations.NotNull
    com.example.server.global.error.GlobalException exception) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<com.example.server.global.error.properties.ErrorResponse<kotlin.Unit>> handleException(com.example.server.global.error.GlobalException e) {
        return null;
    }
}