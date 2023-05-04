fun main() {
    // write your code here
    val n = readln().toInt()
    val myInts: MutableList<Int> = ArrayList(n)

    for (i in 0 until n) {
        myInts.add(i, readln().toInt())
    }

    val (p, m) = readln().split(" ").map { it.toInt() }

    var yesOrNo = "YES"

    for (i in 0 until myInts.lastIndex) {
        if (myInts[i] == p && myInts[i + 1] == m || myInts[i] == m && myInts[i + 1] == p) {

            yesOrNo = "NO"
            break
        }
    }

    println(yesOrNo)
}