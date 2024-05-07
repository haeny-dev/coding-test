package co.kr.programmers.level0.lessons120820

class Solution {
    fun solution(age: Int) = 2023 - age
}

fun main() {
    val solution = Solution()
    println("age: 40, result: ${solution.solution(40)}")
    println("age: 23, result: ${solution.solution(23)}")
}