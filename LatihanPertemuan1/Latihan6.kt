package LatihanPertemuan1

fun main(){
    val greet = { name: String -> greetings(name) }
    greet("Gina Meirina")
}

fun greetings(name: String) {
    println("Hallo $name!")
}
