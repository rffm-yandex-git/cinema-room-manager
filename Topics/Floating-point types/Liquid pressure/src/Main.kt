const val G = 9.8

fun main() {
    // write your code here
    val (rho, h) = List(2) { readln().toDouble() }
    println(rho * G * h)
}