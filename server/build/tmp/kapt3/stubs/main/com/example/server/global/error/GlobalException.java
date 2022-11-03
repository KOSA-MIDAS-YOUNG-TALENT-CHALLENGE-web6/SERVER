package com.example.server.global.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/example/server/global/error/GlobalException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errorProperty", "Lcom/example/server/global/error/properties/ErrorProperty;", "(Lcom/example/server/global/error/properties/ErrorProperty;)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "errorStatus", "", "getErrorStatus", "()I", "fillInStackTrace", "", "server"})
public class GlobalException extends java.lang.RuntimeException {
    private final com.example.server.global.error.properties.ErrorProperty errorProperty = null;
    
    public GlobalException(@org.jetbrains.annotations.NotNull
    com.example.server.global.error.properties.ErrorProperty errorProperty) {
        super();
    }
    
    public final int getErrorStatus() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.Throwable fillInStackTrace() {
        return null;
    }
}