package com.jneuton.api_collections


fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 8000.0, "PJ")
    val maria = Funcionario("Maria", 5000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach {println(it)}

println("---------------------------------")


    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach {println(it)}

    println("---------------------------------")

    val resultInterSect = funcionarios3.intersect(funcionarios2)
    resultInterSect.forEach {println(it)}
}