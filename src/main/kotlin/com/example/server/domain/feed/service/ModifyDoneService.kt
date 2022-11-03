package com.example.server.domain.feed.service

import com.example.server.domain.feed.facade.FeedFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ModifyDoneService(
    private val feedFacade: FeedFacade
) {

    @Transactional
    fun execute(feedId: Int) {
        val feed = feedFacade.getFeedById(feedId)

        if (feed.isDone) {
            feed.modifyIsDone(false)
        } else {
            feed.modifyIsDone(true)
        }
    }
}