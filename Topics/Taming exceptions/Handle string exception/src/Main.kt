fun main() {
    val index = readLine()!!.toInt()
    val word = readLine()!!
    if (index in 0 until word.length) {
        println(word[index])
    } else {
        println("There isn't such an element in the given string, please fix the index!")
    }
}