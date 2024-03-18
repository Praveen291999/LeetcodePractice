package com.practice.problems;

/*
 * Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
*/

public class LinkedListCycle {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}

	}

	public static void main(String[] args) {
		
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		System.out.println(head);
	}

}
