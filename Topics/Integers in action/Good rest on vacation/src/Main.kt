fun main() {
    // put your code here
    val d: UInt = readln().toUInt()
    val food: UInt = readln().toUInt()
    val flight: UInt = readln().toUInt()
    val hotel: UInt = readln().toUInt()

    println(food * d + 2u * flight + hotel * (d - 1u))
}