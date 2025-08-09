package com.leetcode.easy.problem_872_LeafSimilarTrees

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val leaves1 = mutableListOf<Int>()
        val leaves2 = mutableListOf<Int>()

        leafNodes(root1, leaves1)
        leafNodes(root2, leaves2)

        return leaves1 == leaves2
    }

    fun leafNodes(root: TreeNode?, leaves: MutableList<Int>) {
        if (root == null) return

        if (root.left == null && root.right == null) {
            leaves.add(root.`val`)
        }

        leafNodes(root.left, leaves)
        leafNodes(root.right, leaves)
    }
}