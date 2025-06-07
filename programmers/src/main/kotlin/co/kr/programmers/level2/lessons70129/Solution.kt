package co.kr.programmers.level2.lessons70129

class Solution {
    fun solution(s: String): IntArray {
        var inputString = s
        var convertCount = 0
        var removeZeroCount = 0

        while(inputString != "1") {
            val zeroCount = inputString.count { it == '0'}
            val newString = inputString.replace("0", "").length.toString(2)

            println(zeroCount)
            println(newString)

            inputString = newString

            convertCount++
            removeZeroCount += zeroCount
        }

        return intArrayOf(convertCount, removeZeroCount)
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution("110010101001").forEach { println(it) })

//    println("110010101001".replace("0", "").length.toString(2))
//    println("110".replace("0", "").length.toString(2))
//    println("10".replace("0", "").length.toString(2))
}