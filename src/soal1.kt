fun main(args: Array<String>) {
    //N-dimensional arrays
    var movie = arrayOf<Array<Array<Int>>>()
    for (i in 0..6) {
        var halaman = arrayOf<Array<Int>>()
        for (j in 0..4) {
            var array = arrayOf<Int>()
            for (k in 0..4) {
                array += 2
            }
            halaman += array
        }
        movie += halaman
    }

    movie[1][2][3]= 1 // the second-floor cinema, the third row, the fourth seat

    var floor = 1
    for (cinema in movie) {
        println("Floor: $floor")
        floor += 1
        for (array in cinema) {
            for (value in array) {
                print("$value ")
            }
            println()
        }
        println("-----------------")
    } }