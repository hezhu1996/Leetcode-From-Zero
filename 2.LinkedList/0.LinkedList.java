// 1.基本操作
// Definition for singly-linked list.
public class SinglyListNode {
    int val;
    SinglyListNode next;
    SinglyListNode(int x) { val = x; }
}
// 1.1添加

// 1.2删除 O(N)
// 1.Find cur's previous node prev and its next node next;
// 2.Link prev to cur's next node next.