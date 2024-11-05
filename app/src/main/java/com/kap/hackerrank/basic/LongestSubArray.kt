package com.kap.hackerrank.basic

fun longestSubarray(arr: Array<Int>): Int {
    var maxLength = 0  // Variabel untuk menyimpan panjang subarray terpanjang
    var start = 0      // Pointer untuk awal dari jendela sliding
    val freqMap = mutableMapOf<Int, Int>()  // Map untuk melacak frekuensi elemen dalam jendela saat ini

    for (end in arr.indices) {  // Iterasi melalui indeks array
        freqMap[arr[end]] = freqMap.getOrDefault(arr[end], 0) + 1  // Tambahkan elemen ke freqMap atau tingkatkan frekuensinya

        // Validasi jika terdapat lebih dari 2 elemen unik atau selisih elemen unik lebih dari 1
        while (freqMap.size > 2 || (freqMap.keys.maxOrNull()!! - freqMap.keys.minOrNull()!! > 1)) {
            freqMap[arr[start]] = freqMap[arr[start]]!! - 1  // Kurangi frekuensi elemen di posisi start
            if (freqMap[arr[start]] == 0) {  // Jika frekuensi elemen menjadi 0, hapus dari map
                freqMap.remove(arr[start])
            }
            start++  // Geser pointer start ke kanan
        }
        maxLength = maxOf(maxLength, end - start + 1)  // Perbarui panjang maksimum subarray valid
    }
    return maxLength  // Kembalikan panjang subarray terpanjang
}

fun main(args: Array<String>) {
    val arrCount = readln().trim().toInt()  // Baca jumlah elemen dalam array

    val arr = Array<Int>(arrCount) { 0 }  // Inisialisasi array dengan panjang `arrCount`
    for (i in 0 until arrCount) {  // Baca elemen array satu per satu
        val arrItem = readln().trim().toInt()
        arr[i] = arrItem
    }

    val result = longestSubarray(arr)  // Panggil fungsi `longestSubarray`

    println(result)  // Cetak hasil
}