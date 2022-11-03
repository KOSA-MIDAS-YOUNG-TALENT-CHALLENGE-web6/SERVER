package com.example.server.domain.quittingTime.domain

import com.example.server.domain.user.domain.User
import com.example.server.global.entity.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "tbl_quitting_time")
class QuittingTime(

    @field:NotNull
    val time: LocalDateTime,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User
) : BaseEntity()