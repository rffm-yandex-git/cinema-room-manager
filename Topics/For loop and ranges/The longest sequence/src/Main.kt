fun main() {
    // write your code here
    val n = readln().toInt()
    val nums = MutableList(n) { 0 }
    var longestLength = 1
    var currentLength = 1

    for (i in 0 until n) {
        nums[i] = readln().toInt()
        if (i > 0 && nums[i] >= nums[i - 1]) {
            currentLength += 1
            if (currentLength > longestLength) {
                longestLength += 1
            }
        } else {
            currentLength = 1
        }
    }

    println(longestLength)
}