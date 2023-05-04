fun main() {
    val str1 = MutableList(readLine()!!.toInt()) { readLine()!! }.joinToString(" ")
    val str2 = readLine()!!
    val res = str1.contains(str2) || str1.contains(str2.reversed())
    println(if (res) "NO" else "YES")
}


/* avatar
User 42606240
about 1 year ago
1
2
3
4
5
6
7
8
9
fun main() {
    val str1 = MutableList(readLine()!!.toInt()) { readLine()!! }.joinToString(" ")

    val str2 = readLine()!!

    val res = str1.contains(str2) || str1.contains(str2.reversed())

    println(if (res) "NO" else "YES")
}
Correct.
avatar
jeff park
21 days ago
Does this source works on this input too?
5
1
12
34
5
6
2 3
Obviously, the answer should be YES.
*/
