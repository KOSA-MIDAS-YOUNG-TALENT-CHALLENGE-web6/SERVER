package com.example.server.domain.user.service

import com.example.server.domain.user.facade.UserFacade
import com.example.server.domain.user.presentation.dto.response.AdminUserElement
import com.example.server.domain.user.presentation.dto.response.UserElement
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class QueryUserService(
    private val userFacade: UserFacade
) {

    @Transactional(readOnly = true)
    fun execute(): UserElement {
        val user = userFacade.getCurrentUser()

        return UserElement(
            id = user.id,
            email = user.email,
            name = user.name,
            userApplication = user.userApplication,
            userPosition = user.password,
            employeeId = user.employeeId,
            isOfficeGoing = user.isOfficeGoing
        )
    }
}