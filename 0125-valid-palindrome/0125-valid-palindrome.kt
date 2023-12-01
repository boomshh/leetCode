class Solution {
    fun isPalindrome(s: String): Boolean {
        val s = s.replace("[^A-Za-z0-9]".toRegex(), "").toLowerCase()
        val b = StringBuilder(s).reverse().toString()
        
        return s == b
        
    }
}

fun main() {
    val n = readln()
    val solution = Solution()
    
    println(solution.isPalindrome(n))
}