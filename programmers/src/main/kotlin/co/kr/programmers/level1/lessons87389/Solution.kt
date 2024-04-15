package co.kr.programmers.level1.lessons87389

class Solution {
    fun solution(n: Int): Int {
        var answer = 2
        while (n % answer != 1) {
            answer++
        }

        return answer
    }

    fun otherSolution(n: Int) = (1..n).first { n % it == 1 }
}

fun main() {
    assert(Solution().solution(10) == 3)
    assert(Solution().solution(12) == 11)

    assert(Solution().otherSolution(10) == 3)
    assert(Solution().otherSolution(12) == 11)
}