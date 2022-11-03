package com.example.server.domain.user.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010#\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010&\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R&\u0010\b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038\u0016@TX\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R&\u0010\t\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038\u0016@TX\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\r\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR&\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b8\u0016@TX\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\"\u00a8\u0006\'"}, d2 = {"Lcom/example/server/domain/user/domain/User;", "Lcom/example/server/global/entity/BaseEntity;", "email", "", "name", "password", "role", "Lcom/example/server/domain/user/domain/type/Role;", "application", "position", "todayOfficeGoingTime", "Ljava/time/LocalDateTime;", "todayQuittingTime", "todayTotalWorkingTime", "weekTotalWorkingTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/server/domain/user/domain/type/Role;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "<set-?>", "getApplication", "()Ljava/lang/String;", "setApplication", "(Ljava/lang/String;)V", "getEmail", "getName", "getPassword", "getPosition", "setPosition", "getRole", "()Lcom/example/server/domain/user/domain/type/Role;", "getTodayOfficeGoingTime", "()Ljava/time/LocalDateTime;", "getTodayQuittingTime", "getTodayTotalWorkingTime", "getWeekTotalWorkingTime", "setWeekTotalWorkingTime", "(Ljava/time/LocalDateTime;)V", "modifyApplication", "", "modifyPosition", "modifyWeekTotalWorkingTime", "server"})
@javax.persistence.Table(name = "tbl_user")
@javax.persistence.Entity
public class User extends com.example.server.global.entity.BaseEntity {
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    @javax.validation.constraints.NotNull
    private final com.example.server.domain.user.domain.type.Role role = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime todayOfficeGoingTime = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime todayQuittingTime = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime todayTotalWorkingTime = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    private java.lang.String application;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    private java.lang.String position;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    private java.time.LocalDateTime weekTotalWorkingTime;
    
    public User(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @org.hibernate.validator.constraints.Length(min = 8, max = 16)
    java.lang.String password, @org.jetbrains.annotations.NotNull
    com.example.server.domain.user.domain.type.Role role, @org.jetbrains.annotations.NotNull
    java.lang.String application, @org.jetbrains.annotations.NotNull
    java.lang.String position, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime todayOfficeGoingTime, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime todayQuittingTime, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime todayTotalWorkingTime, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime weekTotalWorkingTime) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.server.domain.user.domain.type.Role getRole() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getTodayOfficeGoingTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getTodayQuittingTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getTodayTotalWorkingTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getApplication() {
        return null;
    }
    
    protected void setApplication(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getPosition() {
        return null;
    }
    
    protected void setPosition(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getWeekTotalWorkingTime() {
        return null;
    }
    
    protected void setWeekTotalWorkingTime(@org.jetbrains.annotations.NotNull
    java.time.LocalDateTime p0) {
    }
    
    public void modifyApplication(@org.jetbrains.annotations.NotNull
    java.lang.String application) {
    }
    
    public void modifyPosition(@org.jetbrains.annotations.NotNull
    java.lang.String position) {
    }
    
    public void modifyWeekTotalWorkingTime(@org.jetbrains.annotations.NotNull
    java.time.LocalDateTime weekTotalWorkingTime) {
    }
}