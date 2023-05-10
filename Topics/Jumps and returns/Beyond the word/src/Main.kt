fun main() {
    val word = readln().toCharArray()
    for (char in 'a'..'z') {
        if (char !in word) print(char)
    }
}