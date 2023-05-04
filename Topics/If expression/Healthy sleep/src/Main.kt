fun main() {    
    // write your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()

    println(if (a <= h && h <= b) "Normal" else if (h > b) "Excess" else "Deficiency")
}