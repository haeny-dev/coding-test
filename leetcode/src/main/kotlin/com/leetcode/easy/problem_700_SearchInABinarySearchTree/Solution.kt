package com.leetcode.easy.problem_700_SearchInABinarySearchTree

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? =
        if (root == null) {
    null
} else if (root.`val` == `val`) {
    root
} else if (root.`val` <= `val`) {
    searchBST(root.right, `val`)
} else {
    searchBST(root.left, `val`)
}
}