package com.example.server.domain.feed.domain.repository

import com.example.server.domain.feed.domain.Feed
import com.example.server.domain.user.domain.User
import org.springframework.data.repository.CrudRepository

interface FeedRepository : CrudRepository<Feed, Int> {
    fun findFeedById(feedId: Int): Feed?
    fun findAllByUser(user: User): List<Feed>?
}