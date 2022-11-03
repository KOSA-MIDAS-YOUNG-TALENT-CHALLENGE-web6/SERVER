package com.example.server.domain.feed.exception

import com.example.server.domain.feed.exception.properties.FeedErrorCode
import com.example.server.global.error.GlobalException

object FeedNotFoundException : GlobalException(FeedErrorCode.FEED_NOT_FOUND) {
    val EXCEPTION = FeedNotFoundException
}