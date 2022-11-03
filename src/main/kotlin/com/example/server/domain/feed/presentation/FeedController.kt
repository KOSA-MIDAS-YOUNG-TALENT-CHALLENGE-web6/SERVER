package com.example.server.domain.feed.presentation

import com.example.server.domain.feed.presentation.dto.request.CreateFeedRequest
import com.example.server.domain.feed.presentation.dto.response.FeedListResponse
import com.example.server.domain.feed.service.CreateFeedService
import com.example.server.domain.feed.service.DeleteFeedService
import com.example.server.domain.feed.service.ModifyDoneService
import com.example.server.domain.feed.service.QueryAdminFeedListService
import com.example.server.domain.feed.service.QueryFeedListService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@Tag(name = "할 일", description = "할 일 관련 API 입니다.")
@RequestMapping("/feed")
@RestController
class FeedController(
    private val createFeedService: CreateFeedService,
    private val modifyDoneService: ModifyDoneService,
    private val deleteFeedService: DeleteFeedService,
    private val queryAdminFeedListService: QueryAdminFeedListService,
    private val queryFeedListService: QueryFeedListService
) {

    @Operation(summary = "할 일 생성")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun createFeed(@RequestBody @Valid request: CreateFeedRequest) {
        createFeedService.execute(request);
    }

    @Operation(summary = "한 일 체크")
    @PatchMapping("/{feed-id}")
    fun modifyDone(@PathVariable("feed-id") feedId: Int) {
        modifyDoneService.execute(feedId)
    }

    @Operation(summary = "할 일 삭제")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{feed-id}")
    fun deleteFeed(@PathVariable("feed-id") feedId: Int) {
        deleteFeedService.execute(feedId);
    }

    @Operation(summary = "관리자가 작성한 할 일 조회")
    @GetMapping("/admin")
    fun queryAdminFeed(): FeedListResponse {
        return queryAdminFeedListService.execute();
    }


    @Operation(summary = "할 일 조회")
    @GetMapping
    fun queryFeed(): FeedListResponse {
        return queryFeedListService.execute();
    }
}