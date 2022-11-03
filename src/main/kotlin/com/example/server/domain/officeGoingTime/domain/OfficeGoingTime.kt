package com.example.server.domain.officeGoingTime.domain

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
@Table(name = "tbl_office_going_time")
class OfficeGoingTime(

    @field:NotNull
    val time: LocalDateTime,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, columnDefinition = "BINARY(16)")
    val user: User
) : BaseEntity()