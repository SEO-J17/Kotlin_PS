package 프로그래머스_level_2

class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var limit = 0
        tangerine.groupBy { it }.toList().sortedByDescending { it.second.size }.forEach {
            if (limit >= k) {
                return answer
            }
            limit += it.second.size
            answer++
        }

        return answer
    }
}