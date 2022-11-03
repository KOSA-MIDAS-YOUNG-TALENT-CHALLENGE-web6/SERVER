package com.example.server.domain.feed.service

import com.example.server.domain.feed.domain.repository.FeedRepository
import com.example.server.domain.feed.facade.FeedFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class DeleteFeedService(
    private val feedRepository: FeedRepository,
    private val feedFacade: FeedFacade
) {

    @Transactional
    fun execute(feedId: Int) {
        val feed = feedFacade.getFeedById(feedId)

        feedRepository.delete(feed)
    }
}