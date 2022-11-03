package com.example.server.domain.image.presentation

import com.example.server.domain.image.presentation.dto.ImageResponse
import com.example.server.domain.image.service.ImageService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@Tag(name = "이미지", description = "이미지 관련 API입니다.")
@RestController
class ImageController(
    private val imageService: ImageService
) {

    @Operation(summary = "이미지 업로드")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/images")
    fun imageUpload(@RequestParam image: MultipartFile): ImageResponse {
        return imageService.imageUpload(image)
    }
}