fun main() {
    val s = Array(readLine()!!.toInt()) { readLine()!! }.joinToString(" ")
    val (p, m) = readLine()!!.split(' ')
    println(if (".*\\b($p $m|$m $p)\\b.*".toRegex().matches(s)) "NO" else "YES")
}

/*
Look at other solutions to this problem
Sort by:
avatar
blabaster blabaster
over 1 year ago
1
2
3
4
5
6
fun main() {
    val s = Array(readLine()!!.toInt()) { readLine()!! }.joinToString(" ")
    val (p, m) = readLine()!!.split(' ')
    println(if (".*\\b($p $m|$m $p)\\b.*".toRegex().matches(s)) "NO" else "YES")
}

Correct.
avatar
Gerald Schlüter
over 1 year ago
Nice solution again. I think regular expressions are so aesthetic, they look a little nicer like this:
""".*\b($p $m|$m $p)\b.*"""   but of course it is a matter of taste.

 */