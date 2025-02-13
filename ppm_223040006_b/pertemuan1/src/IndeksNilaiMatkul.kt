class IndeksNilaiMatkul(val nilaiAkhir: Int?) {
    fun hitungIndeks(): String {
        return when {
            nilaiAkhir == null -> "Nilai harus diisi"
            nilaiAkhir in 80..100 -> "A"
            nilaiAkhir in 70..79 -> "AB"
            nilaiAkhir in 60..69 -> "B"
            nilaiAkhir in 50..59 -> "BC"
            nilaiAkhir in 40..49 -> "C"
            nilaiAkhir in 30..39 -> "D"
            nilaiAkhir in 0..29 -> "E"
            else -> "Nilai diluar jangkauan"
        }=--
    }
}

fun main() {
    val nilaiAkhirList = listOf(77, 110, null, 25)

    for ((index, nilaiAkhir) in nilaiAkhirList.withIndex()) {
        val indeksNilai = IndeksNilaiMatkul(nilaiAkhir)
        val nilaiTeks = nilaiAkhir?.toString() ?: "{kosong}"
        println("${index + 1}. $nilaiTeks : ${indeksNilai.hitungIndeks()}")
    }
}-