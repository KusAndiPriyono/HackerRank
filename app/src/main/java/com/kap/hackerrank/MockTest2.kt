package com.kap.hackerrank

fun flippingMatrix(matrix: Array<Array<Int>>): Int {
    // Write your code here
    val halfSize = matrix.size / 2
    var totalMaxSum = 0

    for (row in 0 until halfSize) {
        for (col in 0 until halfSize) {
            val topLeft = matrix[row][col]
            val topRight = matrix[row][matrix.size - 1 - col]
            val bottomLeft = matrix[matrix.size - 1 - row][col]
            val bottomRight = matrix[matrix.size - 1 - row][matrix.size - 1 - col]

            totalMaxSum += maxOf(topLeft, topRight, bottomLeft, bottomRight)
        }
    }

    return totalMaxSum
}

fun main(args: Array<String>) {
    val q = readln().trim().toInt()

    for (qItr in 1..q) {
        val n = readln().trim().toInt()

        val matrix = Array<Array<Int>>(2 * n) { Array<Int>(2 * n) { 0 } }

        for (i in 0 until 2 * n) {
            matrix[i] = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
        }

        val result = flippingMatrix(matrix)

        println(result)
    }
}