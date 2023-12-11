/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        if(head?.next != null) {
            val p = head.next
            head.next = swapPairs(head.next.next)
            p.next = head
            return p
        }
        return head
    }
}