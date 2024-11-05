package com.kap.hackerrank.basic

fun filledOrders(order: Array<Int>, k: Int): Int {
    order.sort()
    var count = 0
    var sum = k

    for (orders in order) {
        if (sum >= orders) {
            sum -= orders
            count++
        } else {
            break
        }
    }
    return count
}

fun main(args: Array<String>) {
    if(args.isEmpty()) {
        while (true) {
            println("Masukkan jumlah pesanan: ")
            val orderCount = readln().trim().toInt()

            val order = Array(orderCount) { 0 }
            println("Masukkan pesanan satu per satu:")
            for (i in 0 until orderCount) {
                val orderItem = readln().trim().toInt()
                order[i] = orderItem
            }

            println("Masukkan jumlah maksimum yang dapat dipenuhi (k):")
            val k = readln().trim().toInt()

            val result = filledOrders(order, k)

            println("Jumlah pesanan yang dapat dipenuhi: $result")
        }
    }
}