package co.kr.programmers.level0.lessons120815

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(n: Int): Int = (1..n).first { (it * 6)%n == 0 }
    fun otherSolution(n: Int): Int {
        val max = max(n, 6)
        val min = min(n, 6)
        return lcm(max, min) / 6
    }

    fun gcd(a: Int, b: Int): Int = if (b == 0) a else this.gcd(b, a % b)
    fun lcm(a: Int, b: Int): Int = a * b / gcd(a, b)
}

fun main() {
    val solution = Solution()
    println("n: 6, result: ${solution.solution(6)}")
    println("n: 10, result: ${solution.solution(10)}")
    println("n: 4, result: ${solution.solution(4)}")
}