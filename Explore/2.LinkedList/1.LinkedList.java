//------------------------------------------ 基本操作 ------------------------------------------
//1.Definition for singly-linked list.
public class SinglyListNode {
    int val;
    SinglyListNode next;
    SinglyListNode(int x) { val = x; }
}
// 1.1添加
ListNode toAdd = new ListNode(val);
toAdd.next = pred.next;
pred.next = toAdd;

// 1.2删除 O(N)
pred.next = pred.next.next;

//------------------------------------------ 注意事项 ------------------------------------------
//链表最后一个点，还需要处理
while(headB != null)

//链表最后一个点，不需要处理
while(headB.next != null)

//------------------------------------------ Two Pointer ------------------------------------------ 
//模板
// Initialize slow & fast pointers
ListNode slow = head;
ListNode fast = head;
/**
 * Change this condition to fit specific problem.
 * Attention: remember to avoid null-pointer error
 **/
while (slow != null && fast != null && fast.next != null) {
    slow = slow.next;           // move slow pointer one step each time
    fast = fast.next.next;      // move fast pointer two steps each time
    if (slow == fast) {         // change this condition to fit specific problem
        return true;
    }
}
return false;   // change return value to fit specific problem