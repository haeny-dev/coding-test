package co.kr.programmers.level0.lessons120829

class Solution {
    fun solution(angle: Int): Int =
        when {
            angle < 90 -> 1
            angle == 90 -> 2
            angle in 91..179 -> 3
            angle == 180 -> 4
            else -> 0
        }
}

fun main() {
    val solution = Solution()
    println("angle: 70, result: ${solution.solution(70)}")
    println("angle: 91, result: ${solution.solution(91)}")
    println("angle: 180, result: ${solution.solution(180)}")
}