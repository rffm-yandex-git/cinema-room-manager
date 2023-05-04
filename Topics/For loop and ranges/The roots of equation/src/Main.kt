
import kotlin.math.pow

fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (x in 0..1000) {
        if (a * x.toDouble().pow(3).toInt() +
            b * x.toDouble().pow(2).toInt() +
            c * x + d == 0
        ) {
            println(x)
        }
    }

}