class PersegiPanjang(val panjang: Double, val lebar: Double) {
    fun luas(): Int {
        return (panjang * lebar).toInt()
    }

    fun keliling(): Int {
        return (2 * (panjang + lebar)).toInt()
    }
}

fun main() {
    val panjang = 4.0
    val lebar = 2.0

    val persegiPanjang = PersegiPanjang(panjang, lebar)
    println("Panjang: ${persegiPanjang.panjang.toInt()}")
    println("Lebar: ${persegiPanjang.lebar.toInt()}")
    println("Luas: ${persegiPanjang.luas()}")
    println("Keliling: ${persegiPanjang.keliling()}")
}