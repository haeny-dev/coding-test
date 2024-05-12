package co.kr.programmers.level0.lessons120889

class Solution {
    fun solution(sides: IntArray): Int {
        var max = 0
        var nmg = 0
        for (side in sides) {
            if (side > max) {
                nmg += max
                max = side
            } else {
                nmg += side
            }
        }

        return if (max < nmg) 1 else 2
    }

    fun otherSolution(sides: IntArray): Int =
        sides.sorted().let { (a, b, c) -> if (a + b > c) 1 else 2 }
}

fun main() {
    val solution = Solution()
    println("sides: [1, 2, 3], result: ${solution.solution(intArrayOf(1, 2, 3))}")
}