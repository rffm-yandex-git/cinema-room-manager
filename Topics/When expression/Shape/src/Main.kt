const val SQUARE = 1
const val CIRCLE = 2
const val TRIANGLE = 3
const val RHOMBUS = 4

fun main() {
    // write your code here
    val shape = readln().toInt()
    val confirm = "You have chosen a "
    println(
        when (shape) {
            SQUARE -> confirm + "square"
            CIRCLE -> confirm + "circle"
            TRIANGLE -> confirm + "triangle"
            RHOMBUS -> confirm + "rhombus"
            else -> "There is no such shape!"
        }
    )
}