package com.example.server.infrastructure.aws.image.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/server/infrastructure/aws/image/config/S3Config;", "", "accessKey", "", "secretKey", "region", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "amazonS3Client", "Lcom/amazonaws/services/s3/AmazonS3Client;", "server"})
@org.springframework.context.annotation.Configuration
public class S3Config {
    private java.lang.String accessKey;
    private final java.lang.String secretKey = null;
    private final java.lang.String region = null;
    
    public S3Config(@org.jetbrains.annotations.NotNull
    @org.springframework.beans.factory.annotation.Value(value = "${cloud.aws.credentials.access-key}")
    java.lang.String accessKey, @org.jetbrains.annotations.NotNull
    @org.springframework.beans.factory.annotation.Value(value = "${cloud.aws.credentials.secret-key}")
    java.lang.String secretKey, @org.jetbrains.annotations.NotNull
    @org.springframework.beans.factory.annotation.Value(value = "${cloud.aws.region.static}")
    java.lang.String region) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public com.amazonaws.services.s3.AmazonS3Client amazonS3Client() {
        return null;
    }
}