fun main() {
    val dividend: Int = readLine()!!.toInt()
    val divisor: Int = readLine()!!.toInt()

    val quotient: Int = dividend.floorDiv(divisor)
    val remainder: Int = dividend.mod(divisor)

    print("The quotient is: $quotient and the remainder is: $remainder")
}
