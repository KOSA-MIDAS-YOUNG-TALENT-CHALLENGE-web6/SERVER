package com.example.server.domain.feed.facade

import com.example.server.domain.feed.domain.Feed
import com.example.server.domain.feed.domain.repository.FeedRepository
import com.example.server.domain.feed.exception.FeedNotFoundException
import com.example.server.domain.user.domain.User
import org.springframework.stereotype.Component

@Component
class FeedFacade(
    private val feedRepository: FeedRepository
) {

    fun getFeedById(feedId: Int): Feed {
        return feedRepository.findFeedById(feedId) ?: throw FeedNotFoundException.EXCEPTION
    }
}