package com.example.server.domain.image.service

import com.example.server.domain.image.presentation.dto.ImageListResponse
import com.example.server.infrastructure.aws.image.facade.ImageFacade
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class ImageService(
    private val imageFacade: ImageFacade
) {
    fun imageUpload(images: List<MultipartFile>): ImageListResponse {
        val imageList: MutableList<String> = mutableListOf()

        for (image: MultipartFile in images) {
            imageList.add(imageFacade.upload(image))
        }

        return ImageListResponse(imageList)
    }
}