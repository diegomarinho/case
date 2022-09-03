package br.com.case.modelmapper

import br.com.case.data.request.CreateUserRequest
import br.com.case.data.request.UpdateUserRequest
import br.com.case.data.response.UserResponse
import br.com.case.model.User

class UserMapper {

    fun convertCreateUserRequestToUser(createUserRequest: CreateUserRequest): User {
        return User(
                id = null,
                nome = createUserRequest.nome,
                documento = createUserRequest.documento,
                dataCriacao = createUserRequest.dataCriacao,
                dataAtualizacao = createUserRequest.dataAtualizacao
        )
    }

    fun convertUpdateUserRequestToUser(updateUserRequest: UpdateUserRequest, user: User): User {
        return user.copy(
                nome = updateUserRequest.nome,
                documento = updateUserRequest.documento,
                dataCriacao = updateUserRequest.dataCriacao,
                dataAtualizacao = updateUserRequest.dataAtualizacao
        )
    }

    fun convertUserToUserResponse(user: User): UserResponse {
        return UserResponse(
                id = user.id!!,
                nome = user.nome,
                documento = user.documento,
                dataCriacao = user.dataCriacao,
                dataAtualizacao = user.dataAtualizacao
        )
    }
}