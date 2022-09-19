// do while
fun main() {
    print("masukkan angka awal perulangan mundur : ")
    val awal : Int =  readLine()!!.toInt()

    print("masukkan angka akhir perulangan mundur : ")
    val akhir : Int =  readLine()!!.toInt()

    for (x in awal downTo akhir)
        print("$x ")
}