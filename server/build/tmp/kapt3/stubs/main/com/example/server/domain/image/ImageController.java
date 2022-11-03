package com.example.server.domain.image;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/server/domain/image/ImageController;", "", "imageService", "Lcom/example/server/domain/image/service/ImageService;", "(Lcom/example/server/domain/image/service/ImageService;)V", "imageUpload", "Lcom/example/server/domain/image/presentation/dto/ImageListResponse;", "image", "", "Lorg/springframework/web/multipart/MultipartFile;", "server"})
@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping(value = {"/image"})
@io.swagger.v3.oas.annotations.tags.Tag(name = "\uc774\ubbf8\uc9c0", description = "\uc774\ubbf8\uc9c0 \uad00\ub828 API\uc785\ub2c8\ub2e4.")
public class ImageController {
    private final com.example.server.domain.image.service.ImageService imageService = null;
    
    public ImageController(@org.jetbrains.annotations.NotNull
    com.example.server.domain.image.service.ImageService imageService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/images"})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
    @io.swagger.v3.oas.annotations.Operation(summary = "\uc774\ubbf8\uc9c0 \uc5c5\ub85c\ub4dc")
    public com.example.server.domain.image.presentation.dto.ImageListResponse imageUpload(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam
    java.util.List<? extends org.springframework.web.multipart.MultipartFile> image) {
        return null;
    }
}