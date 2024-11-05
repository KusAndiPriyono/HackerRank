package com.kap.hackerrank.day1

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    arr.sort()

    val minSum = arr.take(4).sumOf { it.toLong() }
    val maxSum = arr.takeLast(4).sumOf { it.toLong() }

    println("$minSum $maxSum")
}

fun main(args: Array<String>) {
    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    miniMaxSum(arr)
}