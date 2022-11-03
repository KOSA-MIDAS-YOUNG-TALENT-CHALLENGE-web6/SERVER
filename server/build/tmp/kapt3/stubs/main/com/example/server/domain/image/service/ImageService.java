package com.example.server.domain.image.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/server/domain/image/service/ImageService;", "", "imageFacade", "Lcom/example/server/infrastructure/aws/image/facade/ImageFacade;", "(Lcom/example/server/infrastructure/aws/image/facade/ImageFacade;)V", "imageUpload", "Lcom/example/server/domain/image/presentation/dto/ImageListResponse;", "images", "", "Lorg/springframework/web/multipart/MultipartFile;", "server"})
@org.springframework.stereotype.Service
public class ImageService {
    private final com.example.server.infrastructure.aws.image.facade.ImageFacade imageFacade = null;
    
    public ImageService(@org.jetbrains.annotations.NotNull
    com.example.server.infrastructure.aws.image.facade.ImageFacade imageFacade) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.server.domain.image.presentation.dto.ImageListResponse imageUpload(@org.jetbrains.annotations.NotNull
    java.util.List<? extends org.springframework.web.multipart.MultipartFile> images) {
        return null;
    }
}