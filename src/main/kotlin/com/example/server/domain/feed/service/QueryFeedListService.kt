package com.example.server.domain.feed.service

import com.example.server.domain.feed.domain.repository.FeedRepository
import com.example.server.domain.feed.presentation.dto.response.FeedElement
import com.example.server.domain.feed.presentation.dto.response.FeedListResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class QueryFeedListService(
    private val feedRepository: FeedRepository
) {

    @Transactional(readOnly = true)
    fun execute(): FeedListResponse {
        val list = feedRepository.findAll()
            .map {
                FeedElement(
                    id = it.id,
                    content = it.content,
                    isDone = it.isDoneFeed
                )
            }

        return FeedListResponse(list)
    }
}