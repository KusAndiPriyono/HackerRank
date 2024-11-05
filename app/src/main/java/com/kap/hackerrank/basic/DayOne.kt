package com.kap.hackerrank.basic

/**Parameter n: Fungsi ini menerima satu parameter n yang merupakan bilangan bulat.
* Perulangan for(i in 1..n): Melakukan iterasi dari angka 1 hingga n.
* @return when Expression: Mengevaluasi kondisi berikut:
* i % 3 == 0 && i % 5 == 0: Jika angka i habis dibagi 3 dan 5, cetak "FizzBuzz".
* i % 3 == 0: Jika hanya habis dibagi 3, cetak "Fizz".
* i % 5 == 0: Jika hanya habis dibagi 5, cetak "Buzz".
* else: Jika tidak memenuhi kondisi di atas, cetak angka i.
 */

fun fizzBuzz(n: Int): Unit {
    // Write your code here

    for(i in 1 ..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}

/*while (true): Loop tanpa batas yang membuat program terus meminta input dari pengguna.
print("Masukan Angka: "): Menampilkan pesan untuk meminta pengguna memasukkan angka.
readln().trim().toInt(): Membaca input dari pengguna, menghapus spasi di awal/akhir, dan mengonversinya ke bilangan bulat.
fizzBuzz(n): Memanggil fungsi fizzBuzz dengan angka yang dimasukkan pengguna.*/

fun main(args: Array<String>) {
    if(args.isEmpty()) {
        while (true) {
            print("Masukan Angka: ")
            val n = readln().trim().toInt()
            fizzBuzz(n)
        }
    }
}