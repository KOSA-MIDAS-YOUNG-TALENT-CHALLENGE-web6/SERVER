package com.example.server.global.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/server/global/filter/ExceptionFilter;", "Lorg/springframework/web/filter/OncePerRequestFilter;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "doFilterInternal", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "filterChain", "Ljavax/servlet/FilterChain;", "writeErrorCode", "exception", "Lcom/example/server/global/error/GlobalException;", "server"})
public final class ExceptionFilter extends org.springframework.web.filter.OncePerRequestFilter {
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    public ExceptionFilter(@org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
    
    @java.lang.Override
    protected void doFilterInternal(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull
    javax.servlet.FilterChain filterChain) {
    }
    
    private final void writeErrorCode(com.example.server.global.error.GlobalException exception, javax.servlet.http.HttpServletResponse response) {
    }
}