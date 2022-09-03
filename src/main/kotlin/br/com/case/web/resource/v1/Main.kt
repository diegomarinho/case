package br.com.case.web.resource.v1

import br.com.case.data.request.CreateUserRequest
import br.com.case.data.request.UpdateUserRequest
import br.com.case.data.response.UserResponse
import br.com.case.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
class Main (private val userService: UserService) {

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Int): ResponseEntity<UserResponse> {
        return ResponseEntity.ok(userService.findById(id))
    }

    @PostMapping
    fun save(@RequestBody user: CreateUserRequest): ResponseEntity<UserResponse> {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user))
    }

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: Int,
               @RequestBody user: UpdateUserRequest): ResponseEntity<UserResponse> {
        return ResponseEntity.ok(userService.update(id, user))
    }
}