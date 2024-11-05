package com.kap.hackerrank.day1

import android.annotation.SuppressLint

@SuppressLint("DefaultLocale")
fun timeConversion(s: String): String {
    // Write your code here
    val hour = s.substring(0, 2).toInt()
    val amPm = s.substring(8, 10)

    val convertedHour = when {
        amPm == "PM" && hour < 12 -> hour + 12
        amPm == "AM" && hour == 12 -> 0
        else -> hour
    }

    return String.format("%02d", convertedHour) + s.substring(2, 8)
}

fun main(args: Array<String>) {
    val s = readln()

    val result = timeConversion(s)

    println(result)
}