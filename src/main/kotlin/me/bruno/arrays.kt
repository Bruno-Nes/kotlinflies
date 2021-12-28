package me.bruno

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    val values1 = IntArray(5)
    values1[0] = 5
    values1[1] = 4
    values1[2] = 3
    values1[3] = 2
    values1[4] = 1
    values1.forEach {
        println(it)
    }
    println("---------------------------------")
    for (i in values.indices) {
        println(i)
    }
    println("---------------------------------")
    for (i in values.indices) {
        println(values[i])
    }
    println("---------------------------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }
    println("---------------------------------")
    values1.sort()
    for (valor in values1) {
        println(valor)
    }
}