package com.example.server.domain.feed.presentation.dto.response

data class FeedElement(
    val id: Int,
    val content: String,
    val isDone: Boolean
)