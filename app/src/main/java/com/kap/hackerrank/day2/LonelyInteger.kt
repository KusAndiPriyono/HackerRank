package com.kap.hackerrank.day2

fun lonelyinteger(a: Array<Int>): Int {
    // Write your code here
    var result = 0
    for (num in a) {
        result = result xor num
    }
    return result
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val a = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = lonelyinteger(a)

    println(result)
}