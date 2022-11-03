package com.example.server.global.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/server/global/entity/BaseEntity;", "", "()V", "createdTime", "Ljava/time/LocalDateTime;", "getCreatedTime", "()Ljava/time/LocalDateTime;", "id", "", "getId", "()I", "server"})
@javax.persistence.MappedSuperclass
public abstract class BaseEntity {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime createdTime = null;
    
    public BaseEntity() {
        super();
    }
    
    public int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getCreatedTime() {
        return null;
    }
}