package com.jneuton.api_collections

fun main(){
    val joao = Funcionario("Joao", 2000.0,"CLT")
    val pedro = Funcionario("Pedro", 8000.0, "PJ")
    val maria = Funcionario("Maria", 5000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach {println(it)}

    println("------------------------------")

    println(funcionarios.find { it.nome == "Maria" })

    println("------------------------------")

    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it)}

    println("------------------------------")

    funcionarios
        .groupBy { it.tipoContracacao }
        .forEach{ println(it)}

    funcionarios

}

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