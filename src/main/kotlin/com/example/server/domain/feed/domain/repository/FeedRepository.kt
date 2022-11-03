package com.example.server.domain.feed.domain.repository

import com.example.server.domain.feed.domain.Feed
import org.springframework.data.repository.CrudRepository

interface FeedRepository : CrudRepository<Feed, Int> {
    fun findFeedById(feedId: Int): Feed?
}