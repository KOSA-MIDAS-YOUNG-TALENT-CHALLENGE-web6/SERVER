package com.example.server.domain.user.facade;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/server/domain/user/facade/UserFacade;", "", "userRepository", "Lcom/example/server/domain/user/domain/repository/UserRepository;", "(Lcom/example/server/domain/user/domain/repository/UserRepository;)V", "getCurrentUser", "Lcom/example/server/domain/user/domain/User;", "getUserByEmail", "email", "", "server"})
@org.springframework.stereotype.Component
public class UserFacade {
    private final com.example.server.domain.user.domain.repository.UserRepository userRepository = null;
    
    public UserFacade(@org.jetbrains.annotations.NotNull
    com.example.server.domain.user.domain.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.server.domain.user.domain.User getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.server.domain.user.domain.User getUserByEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        return null;
    }
}