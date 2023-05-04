fun main() {
    // write your code here
    val num = readln().toInt()
    println(
        when (num % 2) {
            0 -> "EVEN"
            1 -> "ODD"
            -1 -> "ODD"
            else -> "REALLY ODD ;-)"
        }
    )
}