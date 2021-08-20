package com.jneuton.api_collections

fun main() {
    val salarios = doubleArrayOf(1550.0, 2450.0, 8700.0)
    for (salario in salarios){
        println(salarios)
    }
    println("---------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salario: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("---------------------")
    salariosMaiorQue2500.forEach{println(it)}

    println("---------------------")
    println(salarios.count{it in 2000.0.. 5000.0})

    println("---------------------")
    println(salarios.find { it == 2450.0 })
    println(salarios.find { it == 500.0 })

    println("---------------------")
    println(salarios.any {it == 1000.0})
    println(salarios.any {it == 500.0})

}