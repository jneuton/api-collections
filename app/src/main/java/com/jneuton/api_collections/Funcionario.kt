package com.jneuton.api_collections


data class Funcionario (
    val nome: String,
    val salario: Double,
    val tipoContracacao: String
){
    override fun toString(): String =
        """
            Nome: $nome,
            Salário: $salario
            
            """.trimIndent()
}