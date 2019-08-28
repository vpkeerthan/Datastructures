//Basic Linked List implementation
import java.util.*;
public class LinkedList {
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
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		printList(list);
	}

}
