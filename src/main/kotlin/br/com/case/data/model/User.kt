package br.com.case.model

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "Users")
data class User (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Int?,

    @Column(name = "nome")
    val nome: String,

    @Column(name = "documento")
    val documento: String,

    @Column(name = "data_criacao")
    val dataCriacao: LocalDate,

    @Column(name = "data_atualizacao")
    val dataAtualizacao: LocalDate
) {}