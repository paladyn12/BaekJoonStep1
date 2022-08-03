package com.example.baekjoonstep1

import java.util.*

fun main(Args : Array<String>) = with (Scanner(System.`in`)) {
    var n1 = nextInt()
    var n2 = nextInt()
    var num1 = n2%10
    var num2 = (n2/10)%10
    var num3 = n2/100
    println(n1 * num1)
    println(n1 * num2)
    println(n1 * num3)
    println(n1 * n2)
}