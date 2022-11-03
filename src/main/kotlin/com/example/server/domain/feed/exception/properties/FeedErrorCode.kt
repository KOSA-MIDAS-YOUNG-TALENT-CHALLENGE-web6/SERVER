package com.example.server.domain.feed.exception.properties

import com.example.server.global.error.properties.ErrorProperty

enum class FeedErrorCode(
    override val errorStatus: Int,
    override val errorMessage: String
) : ErrorProperty {

    FEED_NOT_FOUND(404, "Feed Not Found")
}