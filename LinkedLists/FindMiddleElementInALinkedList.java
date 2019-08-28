/* Given a singly linked list of N nodes. The task is to find middle of the linked list. For example, 
 * if given linked list is 1->2->3->4->5 then output should be 3. If there are even nodes, then there would be 
 * two middle nodes, we need to print second middle element. For example, if given linked list is 
 * 1->2->3->4->5->6 then output should be 4.
 * */

import java.util.*;

public class FindMiddleElementInALinkedList {
	public static class LinkedList {
		Node head;
		
		static class Node{
			int data;
			Node next;
			Node(int d){
				data = d;
				next = null;
			}
		}
		public static void printList(LinkedList list){
			Node curNode = list.head;
			while(curNode!=null){
				System.out.println(" "+curNode.data);
				curNode = curNode.next;
			}
		}
		public static LinkedList insert(LinkedList list,int data){
			Node node = new Node(data);
			node.next = null;
			
			if(list.head==null){
				list.head = node;
			}else{
				Node lastNode = list.head;
				while(lastNode.next!=null){
					lastNode = lastNode.next;
				}
				lastNode.next = node;
			}
			
			return list;
			
		}
		public void findMiddleElement(LinkedList list){
			Node fast_node = head;
			Node slow_node = head;
			if(head!=null){
				while(fast_node!=null && fast_node.next!=null){
					fast_node = fast_node.next.next;
					slow_node = slow_node.next;
				}
				System.out.println("Middle Node ::"+slow_node.data);
			}
		} 
		public static void main(String[] args){
			LinkedList list = new LinkedList();
			list = insert(list,1);
			list = insert(list,2);
			list = insert(list,3);
			list = insert(list,4);
			list = insert(list,5);
			printList(list);
			list.findMiddleElement(list);
		}

	}
}
