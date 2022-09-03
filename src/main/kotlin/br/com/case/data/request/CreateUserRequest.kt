package br.com.case.data.request

import java.time.LocalDate

data class CreateUserRequest (
        val nome: String,
        val documento: String,
        val dataCriacao: LocalDate,
        val dataAtualizacao: LocalDate
)