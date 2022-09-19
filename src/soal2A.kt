fun main() {

    print("Masukkan pilihan operasi : Persegi Panjang(1), Lingkaran(2), Segitigas(3): ")
    val pilih = readLine()!!.toInt()

    when (pilih) {
        1 -> {
            println("Masukkan panjang: ")
            val pjg = readLine()!!.toDouble()
            println("Masukkan lebar : ")
            val lbr = readLine()!!.toDouble()

            val luas: Double = pjg * lbr
            val kll: Double = 2 * (pjg + lbr)

            println("Keliling Persegi Panjang : $kll")
            println("Luas Persegi Panjang : $luas")
        }

        2 -> {
            println("diketahui phi = 3.14")
            println("")
            println("Masukkan jari - jari: ")
            val r = readLine()!!.toDouble()


            val luasling: Double = (3.14 * r * r)
            val kllling: Double = (2 * 3.14 * r)

            println("Keliling Lingkaran : $kllling")
            println("Luas Lingkaran : $luasling")
        }

        3 -> {
            print("Masukkan alas : ")
            val alas = readLine()!!.toDouble()
            print("Masukkan tinggi : ")
            val tinggi = readLine()!!.toDouble()
            print("Masukkan sisi 1 : ")
            val s1 = readLine()!!.toDouble()
            print("Masukkan sisi 2 : ")
            val s2 = readLine()!!.toDouble()
            print("Masukkan sisi 3 : ")
            val s3 = readLine()!!.toDouble()

            val luasseg: Double =0.5 *(alas*tinggi)
            val kllseg: Double = s1+s2+s3

            println("Keliling segitiga : $kllseg")
            println("Luas segitiga : $luasseg")
        }
        else -> {
            println ("nomer inputan tidak valid!!!!!")
        }
    }
}