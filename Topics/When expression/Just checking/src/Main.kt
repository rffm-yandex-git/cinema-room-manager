const val JAVA = 1
const val KOTLIN = 2
const val SCALA = 3
const val PYTHON = 4

fun main() {
    // write your code here
    val lang = readln().toInt()
    println(
        when (lang) {
            JAVA -> "No!"
            KOTLIN -> "Yes!"
            SCALA -> "No!"
            PYTHON -> "No!"
            else -> "Unknown number"
        }
    )
}