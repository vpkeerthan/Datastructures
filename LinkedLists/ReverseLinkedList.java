//Given a linked list of length N. The task is to reverse the list.
import java.util.*;
public class ReverseLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next =null;
		}
	}
	public static ReverseLinkedList insert(ReverseLinkedList list,int data){
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
	public static void printList(ReverseLinkedList list){
		Node node = list.head;
		while(node!=null){
			System.out.println(" "+node.data);
			node = node.next;
		}
	}
	public static ReverseLinkedList reverseList(ReverseLinkedList list){
		Node currNode = list.head;
		Node prevNode = null, nextNode = null;
		while(currNode!=null){
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		list.head = prevNode;
		return list;
	}
	public static void main(String []args){
		ReverseLinkedList list = new ReverseLinkedList();
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T!=0){
			int N = scanner.nextInt();
			for(int i=0;i<N;i++){
				list = insert(list,scanner.nextInt());
			}
			printList(list);
			reverseList(list);
			System.out.println("Reversing the List:: ");
			printList(list);
			T--;
		}
	}
}
