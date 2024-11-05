package com.kap.hackerrank.day2

fun countingSort(arr: Array<Int>): Array<Int> {
    // Write your code here

    val count = Array(100) { 0 }

    for (num in arr) {
        count[num]++
    }
    return count
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = countingSort(arr)

    println(result.joinToString(" "))
}