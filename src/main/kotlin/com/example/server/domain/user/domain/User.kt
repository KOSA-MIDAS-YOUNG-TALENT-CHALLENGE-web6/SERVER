package com.example.server.domain.user.domain

import com.example.server.domain.user.domain.type.Role
import com.example.server.global.entity.BaseEntity
import org.hibernate.validator.constraints.Length
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "tbl_user")
class User(

    @field:NotNull
    val email: String,

    @field:NotNull
    val name: String,

    //주일 총 근로시간, 하루 총 근로시간,
    @field:NotNull
    @Length(min = 8, max = 16)
    val password: String,

    @field:NotNull
    @field:Enumerated(EnumType.STRING)
    val role: Role,

    application: String = "",

    position: String = "",

    val todayOfficeGoingTime: LocalDateTime = LocalDateTime.now(),

    val todayQuittingTime: LocalDateTime = LocalDateTime.now(),

    val todayTotalWorkingTime: LocalDateTime = LocalDateTime.now(),

    weekTotalWorkingTime: LocalDateTime = LocalDateTime.now()

) : BaseEntity() {

    @field:NotNull
    var application = application
        protected set

    @field:NotNull
    var position = position
        protected set

    @field:NotNull
    var weekTotalWorkingTime = weekTotalWorkingTime
        protected set

    fun modifyApplication(application: String) {
        this.application = application
    }

    fun modifyPosition(position: String) {
        this.position = position
    }

    fun modifyWeekTotalWorkingTime(weekTotalWorkingTime: LocalDateTime) {
        this.weekTotalWorkingTime = weekTotalWorkingTime
    }
}