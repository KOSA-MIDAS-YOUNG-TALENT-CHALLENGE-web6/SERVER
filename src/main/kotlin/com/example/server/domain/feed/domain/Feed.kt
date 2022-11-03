package com.example.server.domain.feed.domain

import com.example.server.domain.user.domain.User
import com.example.server.global.entity.BaseEntity
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "tbl_feed")
class Feed(

    @field:NotNull
    val content: String,

    isDone: Boolean,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    val isAdmin: Boolean

) : BaseEntity() {
    var isDone = isDone
        protected set

    fun modifyIsDone(isDone: Boolean) {
        this.isDone = isDone
    }

    fun getIsAdmin(): Boolean {
        return this.isAdmin
    }
}