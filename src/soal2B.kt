fun main() {
    print("Masukkan Nilai: ")
    val nilai:Int? = readLine()?.toInt()
    var i = nilai
    if (i != null) {
        while (i >= 0) {
            print("$i ")
            i--
        }
    }
}