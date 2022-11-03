package com.example.server.global.error.properties;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/example/server/global/error/properties/ErrorResponse;", "T", "", "errorStatus", "", "errorMessage", "", "(ILjava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getErrorStatus", "()I", "Companion", "server"})
public final class ErrorResponse<T extends java.lang.Object> {
    private final int errorStatus = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String errorMessage = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.server.global.error.properties.ErrorResponse.Companion Companion = null;
    
    public ErrorResponse(int errorStatus, @org.jetbrains.annotations.NotNull
    java.lang.String errorMessage) {
        super();
    }
    
    public final int getErrorStatus() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/server/global/error/properties/ErrorResponse$Companion;", "", "()V", "of", "Lcom/example/server/global/error/properties/ErrorResponse;", "", "exception", "Lcom/example/server/global/error/GlobalException;", "server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.server.global.error.properties.ErrorResponse<kotlin.Unit> of(@org.jetbrains.annotations.NotNull
        com.example.server.global.error.GlobalException exception) {
            return null;
        }
    }
}