fun main() {
    // put your code here
    val endLetter = readln()
    var letter = 'a'
    while (true) {
        print(letter++)
        if (letter.toString() == endLetter) { break }
    }
}