package com.example.baekjoonstep1

import java.util.*

fun main(Args : Array<String>) = with (Scanner(System.`in`)){
    var n1 = nextInt()
    var n2 = nextInt()
    var n3 = nextInt()
    println((n1+n2)%n3)
    println(((n1%n3)+(n2%n3))%n3)
    println((n1*n2)%n3)
    println(((n1%n3)*(n2%n3))%n3)
}