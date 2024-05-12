package co.kr.programmers.level0.lessons120839

class Solution {
    fun solution(rsp: String): String = rsp.map {
        when(it) {
            '2' -> '0'
            '0' -> '5'
            '5' -> '2'
            else -> ""
        }
    }.joinToString("")
}

fun main() {
    val solution = Solution()
    println("rsp: 2, result: ${solution.solution("2")}")
    println("rsp: 205, result: ${solution.solution("205")}")
}