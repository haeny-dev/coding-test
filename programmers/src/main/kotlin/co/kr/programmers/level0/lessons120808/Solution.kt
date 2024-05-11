package co.kr.programmers.level0.lessons120808

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val max = max(denom1, denom2)
        val min = min(denom1, denom2)

        val denom = this.lcm(max, min)
        val numer = numer1 * (denom/denom1) + numer2 * (denom/denom2)
        val gcd = this.gcd(max(denom, numer), min(denom, numer))
        return intArrayOf(numer/gcd, denom/gcd)
    }

    fun otherSolution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val answer: IntArray = intArrayOf(numer1 * denom2 + numer2 * denom1, denom1 * denom2)
        val gcd = gcd(max(answer[0], answer[1]), min(answer[0], answer[1]))

        answer[0] /= gcd
        answer[1] /= gcd
        return answer
    }

    fun gcd(a: Int, b: Int): Int =
        if (b == 0) {
            a
        } else {
            gcd(b, a % b)
        }


    fun lcm(a: Int, b: Int): Int = a * b / gcd(a, b)
}

fun main() {
    val solution = Solution()
    println("a: 2, b: 3, gcd: ${solution.gcd(2, 3)}, lcm: ${solution.lcm(2, 3)}")

    println("1 / 2 + 3 / 4 = ${solution.solution(1, 2, 3, 4).joinToString(" / ")}")
    println("9 / 2 + 1 / 3 = ${solution.solution(9, 2, 1, 3).joinToString(" / ")}")
    println("9 / 2 + 1 / 3 = ${solution.otherSolution(9, 2, 1, 3).joinToString(" / ")}")
}