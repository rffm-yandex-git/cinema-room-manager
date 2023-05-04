fun main() {
    // write your code here
    val house = readln()
    println(
        when (house) {
            "gryffindor" -> "bravery"
            "hufflepuff" -> "loyalty"
            "slytherin" -> "cunning"
            "ravenclaw" -> "intellect"
            else -> "not a valid house"
        }
    )
}