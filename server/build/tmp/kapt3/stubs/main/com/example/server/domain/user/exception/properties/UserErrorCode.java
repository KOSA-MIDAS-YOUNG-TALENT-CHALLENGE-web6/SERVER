package com.example.server.domain.user.exception.properties;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/server/domain/user/exception/properties/UserErrorCode;", "", "Lcom/example/server/global/error/properties/ErrorProperty;", "errorStatus", "", "errorMessage", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getErrorStatus", "()I", "USER_NOT_ADMIN", "USER_NOT_FOUND", "USER_ALREADY_EXISTS", "PASSWORD_MISS_MATCHED", "server"})
public enum UserErrorCode implements com.example.server.global.error.properties.ErrorProperty {
    /*public static final*/ USER_NOT_ADMIN /* = new USER_NOT_ADMIN(0, null) */,
    /*public static final*/ USER_NOT_FOUND /* = new USER_NOT_FOUND(0, null) */,
    /*public static final*/ USER_ALREADY_EXISTS /* = new USER_ALREADY_EXISTS(0, null) */,
    /*public static final*/ PASSWORD_MISS_MATCHED /* = new PASSWORD_MISS_MATCHED(0, null) */;
    private final int errorStatus = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String errorMessage = null;
    
    UserErrorCode(int errorStatus, java.lang.String errorMessage) {
    }
    
    @java.lang.Override
    public int getErrorStatus() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getErrorMessage() {
        return null;
    }
}