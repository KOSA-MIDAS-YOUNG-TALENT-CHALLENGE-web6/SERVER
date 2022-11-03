package com.example.server.domain.user.domain

import com.example.server.domain.user.domain.type.Role
import com.example.server.global.entity.BaseEntity
import com.example.server.infrastructure.aws.image.defaultImage.DefaultImage
import org.hibernate.annotations.ColumnDefault
import org.hibernate.validator.constraints.Length
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

    name: String,

    @field:NotNull
    @Length(min = 8, max = 16)
    val password: String,

    @field:NotNull
    @field:Enumerated(EnumType.STRING)
    val userRole: Role,

    userApplication: String = "",

    userPosition: String,

    isOfficeGoing: Boolean,

    isQuitting: Boolean,

    employeeId: String = DefaultImage.EMPLOYEE_ID_IMAGE,

    isVerifyUser: Boolean

) : BaseEntity() {

    var userApplication = userApplication
        protected set

    var userPosition = userPosition
        protected set

    var name = name
        protected set

    var isOfficeGoing = isOfficeGoing
        protected set

    var isQuitting = isQuitting
        protected set

    @ColumnDefault(DefaultImage.EMPLOYEE_ID_IMAGE)
    var employeeId = employeeId
        protected set

    var isVerifyUser = isVerifyUser
        protected set

    fun modifyApplication(application: String) {
        this.userApplication = application
    }

    fun modifyPosition(position: String) {
        this.userApplication = position
    }

    fun modifyName(name: String) {
        this.name = name
    }

    fun verifyUser(isVerify: Boolean, employeeId: String) {
        this.isVerifyUser = isVerify
        this.employeeId = employeeId
    }

    fun setOfficeGoingTrue() {
        this.isOfficeGoing = true
    }

    fun setOfficeGoingFalse() {
        this.isOfficeGoing = false
    }

    fun setQuittingTrue() {
        this.isQuitting = true
    }

    fun setQuittingFalse() {
        this.isQuitting = false
    }
}