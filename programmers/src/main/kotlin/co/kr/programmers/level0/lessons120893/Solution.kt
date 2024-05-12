package co.kr.programmers.level0.lessons120893

class Solution {
    fun solution(my_string: String): String = my_string.map {
        when(it.code) {
            in 65..90 -> it.code + 32
            else -> it.code - 32
        }.toChar()
    }.joinToString("")
}

fun main() {
    val solution = Solution()
    println("my_string: cccCCC, result: ${solution.solution("cccCCC")}")
}