package com.example.server.domain.feed.service

import com.example.server.domain.feed.domain.Feed
import com.example.server.domain.feed.domain.repository.FeedRepository
import com.example.server.domain.feed.presentation.dto.request.CreateFeedRequest
import com.example.server.domain.user.domain.type.Role
import com.example.server.domain.user.facade.UserFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CreateFeedService(
    private val feedRepository: FeedRepository,
    private val userFacade: UserFacade
) {

    @Transactional
    fun execute(request: CreateFeedRequest) {
        val user = userFacade.getCurrentUser()

        var admin = false

        if (user.userRole == Role.ADMIN) {
            admin = true
        }

        val feed = Feed(
            content = request.content,
            isDoneFeed= false,
            user = user,
            isAdminUser = admin
        )

        feedRepository.save(feed)
    }
}