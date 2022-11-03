package com.example.server.domain.feed.service

import com.example.server.domain.feed.domain.repository.FeedRepository
import com.example.server.domain.feed.presentation.dto.response.FeedElement
import com.example.server.domain.feed.presentation.dto.response.FeedListResponse
import com.example.server.domain.user.facade.UserFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class QueryAdminFeedListService(
    private val feedRepository: FeedRepository,
    private val userFacade: UserFacade
) {

    @Transactional(readOnly = true)
    fun execute(): FeedListResponse {
        val user = userFacade.getCurrentUser()
        val list = feedRepository.findAllByUser(user)
            ?.filter { it.getIsAdmin() }
            ?.map {
                FeedElement(
                    id = it.id,
                    content = it.content,
                    isDone = it.isDoneFeed
                )
            }

        return FeedListResponse(list)
    }
}