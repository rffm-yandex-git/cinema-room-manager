fun main() {
    // put your code here
    val n: UShort = readln().toUShort()
    var maxDivisibleByFour: UShort = 0u
    repeat(n.toInt()) {
        val i = readln().toUShort()
        if (i > maxDivisibleByFour && i % 4u == 0u) {
            maxDivisibleByFour = i
        }
    }
    println(maxDivisibleByFour)
}