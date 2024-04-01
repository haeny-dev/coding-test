package com.leetcode.easy.problem_1_two_sum

object Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        return intArrayOf()
    }
}

fun main() {
    example1()
    example2()
    example3()
}

fun example1() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val output = intArrayOf(0, 1)
    val result = Solution.twoSum(nums, target)

    assert(result.contentEquals(output))
    println("${result[0]}, ${result[1]}")
}

fun example2() {
    val nums = intArrayOf(3, 2, 4)
    val target = 6

    val output = intArrayOf(1, 2)
    val result = Solution.twoSum(nums, target)

    assert(result.contentEquals(output))
    println("${result[0]}, ${result[1]}")
}

fun example3() {
    val nums = intArrayOf(3, 3)
    val target = 6

    val output = intArrayOf(0, 1)
    val result = Solution.twoSum(nums, target)

    assert(result.contentEquals(output))
    println("${result[0]}, ${result[1]}")
}