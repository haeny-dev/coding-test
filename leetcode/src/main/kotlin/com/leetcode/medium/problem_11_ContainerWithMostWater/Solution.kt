package com.leetcode.medium.problem_11_ContainerWithMostWater

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var container = 0

        while (left != right) {
            container = max(container, min(height[left], height[right]) * (right - left))

            if (height[left] > height[right]) {
                right -= 1
            } else {
                left += 1
            }
        }

        return container
    }
}