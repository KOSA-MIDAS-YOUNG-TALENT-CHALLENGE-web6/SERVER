package com.example.server.domain.image.service

import com.example.server.domain.image.presentation.dto.ImageResponse
import com.example.server.infrastructure.aws.image.facade.ImageFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.multipart.MultipartFile

@Service
class ImageService(
    private val imageFacade: ImageFacade
) {
    @Transactional
    fun imageUpload(image: MultipartFile): ImageResponse {
        val imageUrl = imageFacade.upload(image)

        return ImageResponse(imageUrl)
    }
}