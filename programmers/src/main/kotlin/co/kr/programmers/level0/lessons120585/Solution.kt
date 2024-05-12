package co.kr.programmers.level0.lessons120585

class Solution {
    fun solution(array: IntArray, height: Int): Int = array.filter { it > height }.size
}