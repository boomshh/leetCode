class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        return word1.joinToString("") == word2.joinToString("")
    }
}

fun main() {
    val n = readln().split(" ").toTypedArray()
    val m = readln().split(" ").toTypedArray()
    val solution = Solution()
    
    println(solution.arrayStringsAreEqual(n, m))
}