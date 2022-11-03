package com.example.server.domain.user.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/server/domain/user/service/ModifyApplicationService;", "", "userFacade", "Lcom/example/server/domain/user/facade/UserFacade;", "(Lcom/example/server/domain/user/facade/UserFacade;)V", "execute", "", "request", "Lcom/example/server/domain/user/presentation/dto/request/ModifyApplicationRequest;", "server"})
@org.springframework.stereotype.Service
public class ModifyApplicationService {
    private final com.example.server.domain.user.facade.UserFacade userFacade = null;
    
    public ModifyApplicationService(@org.jetbrains.annotations.NotNull
    com.example.server.domain.user.facade.UserFacade userFacade) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional
    public void execute(@org.jetbrains.annotations.NotNull
    com.example.server.domain.user.presentation.dto.request.ModifyApplicationRequest request) {
    }
}