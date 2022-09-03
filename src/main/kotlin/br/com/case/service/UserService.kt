package br.com.case.service

import br.com.case.data.repository.UserRepository
import br.com.case.data.request.CreateUserRequest
import br.com.case.data.request.UpdateUserRequest
import br.com.case.data.response.UserResponse
import br.com.case.model.User
import br.com.case.modelmapper.UserMapper
import br.com.case.web.resource.exception.ObjectNotFoundException
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    val userMapper = UserMapper()

    // Recupera o usuário pelo id
    fun findById(id: Int): UserResponse {

        return userRepository
            .findById(id)
            .map { userMapper.convertUserToUserResponse(it) }
            .orElseThrow { ObjectNotFoundException("Identificador $id não encontrado") }
    }

    // Salvar o usuário
    fun save(userRequest: CreateUserRequest): UserResponse? {

        val user = userMapper.convertCreateUserRequestToUser(userRequest)

        return userMapper.convertUserToUserResponse(userRepository.save(user))
    }

    // Atualizar o usuário pelo id
    fun update(id: Int, userRequest: UpdateUserRequest): UserResponse {

        val userSaved = exist(id)
        val user = userMapper.convertUpdateUserRequestToUser(userRequest, userSaved)

        return userMapper.convertUserToUserResponse(userRepository.save(user))
    }

    private fun exist(id: Int): User {

        return userRepository
            .findById(id)
            .orElseThrow { ObjectNotFoundException("Identificador $id não encontrado") }
    }
}