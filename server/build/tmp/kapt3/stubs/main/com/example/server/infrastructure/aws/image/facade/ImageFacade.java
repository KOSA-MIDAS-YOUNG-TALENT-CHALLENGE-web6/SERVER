package com.example.server.infrastructure.aws.image.facade;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0012J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/server/infrastructure/aws/image/facade/ImageFacade;", "", "amazonS3Client", "Lcom/amazonaws/services/s3/AmazonS3Client;", "bucket", "", "(Lcom/amazonaws/services/s3/AmazonS3Client;Ljava/lang/String;)V", "getExtension", "multipartFile", "Lorg/springframework/web/multipart/MultipartFile;", "upload", "server"})
@org.springframework.stereotype.Component
public class ImageFacade {
    private final com.amazonaws.services.s3.AmazonS3Client amazonS3Client = null;
    private final java.lang.String bucket = null;
    
    public ImageFacade(@org.jetbrains.annotations.NotNull
    com.amazonaws.services.s3.AmazonS3Client amazonS3Client, @org.jetbrains.annotations.NotNull
    @org.springframework.beans.factory.annotation.Value(value = "${cloud.aws.s3.bucket}")
    java.lang.String bucket) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String upload(@org.jetbrains.annotations.NotNull
    org.springframework.web.multipart.MultipartFile multipartFile) {
        return null;
    }
    
    private java.lang.String getExtension(org.springframework.web.multipart.MultipartFile multipartFile) {
        return null;
    }
}