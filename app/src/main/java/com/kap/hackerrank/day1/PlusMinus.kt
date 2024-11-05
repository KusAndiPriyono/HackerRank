package com.kap.hackerrank.day1

import android.annotation.SuppressLint


@SuppressLint("DefaultLocale")
fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    val total = arr.size
    var positiveCount = 0
    var negativeCount = 0
    var zeroCount = 0

    // Count positive, negative, and zero values
    for (num in arr) {
        when {
            num > 0 -> positiveCount++
            num < 0 -> negativeCount++
            else -> zeroCount++
        }
    }

    // Calculate and print proportions
    val positiveRatio = positiveCount.toDouble() / total
    val negativeRatio = negativeCount.toDouble() / total
    val zeroRatio = zeroCount.toDouble() / total

    println(String.format("%.6f", positiveRatio))
    println(String.format("%.6f", negativeRatio))
    println(String.format("%.6f", zeroRatio))

}

fun main(args: Array<String>) {
    if(args.isEmpty()) {
        while (true) {
            println("Masukkan jumlah elemen array: ")
            val n = readln().trim().toInt()
            val inputArray = Array(n) { 0 }
            println("Masukkan elemen array: ")
            for (i in 0 until n) {
                val arr = readln().trimEnd().toInt()
                inputArray[i] = arr
            }

            plusMinus(inputArray)
        }
    }
}