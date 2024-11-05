package com.kap.hackerrank.day2

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var leftToRight = 0
    var rightToLeft = 0

    for (i in arr.indices ) {
        leftToRight += arr[i][i]
        rightToLeft += arr[i][arr.size - 1 - i]
    }
    return abs(leftToRight - rightToLeft)

}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = Array<Array<Int>>(n) { Array<Int>(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}