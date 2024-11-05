package com.kap.hackerrank.day1

fun findMedian(arr: Array<Int>): Int {
    // Write your code here
    arr.sort()
    val mid = arr.size / 2
    return arr[mid]
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = findMedian(arr)

    println(result)
}