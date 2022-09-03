package br.com.case.data.response

import java.time.LocalDate

data class UserResponse(
        val id: Int,
        val nome: String,
        val documento: String,
        val dataCriacao: LocalDate,
        val dataAtualizacao: LocalDate
)