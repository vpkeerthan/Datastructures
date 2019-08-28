/*Given a singly linked list of size N. The task is to rotate the linked list counter-clockwise by k nodes, 
 * where k is a given positive integer smaller than or equal to length of the linked list.
 * Input:
1
8
1 2 3 4 5 6 7 8
4

Output:
5 6 7 8 1 2 3 4
 */
import java.util.Scanner;
public class RotateLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next =null;
		}
	}
	public static RotateLinkedList insert(RotateLinkedList list,int data){
		Node node = new Node(data);
		node.next = null;
		
		if(list.head==null){
			list.head = node;
		}else{
			Node currNode = list.head;
			while(currNode.next!=null){
				currNode = currNode.next;
			}
			currNode.next = node;
		}
		return list;
	}
	public static void printList(RotateLinkedList list){
		Node node = list.head;
		while(node!=null){
			System.out.println(" "+node.data);
			node = node.next;
		}
	}
	public static RotateLinkedList rotateList(RotateLinkedList list,int k){
		Node currNode = list.head;
		int count=1;
		while(count !=k){
			currNode = currNode.next;
			count++;
		}
		Node lastNode = currNode; //starting from k position to avoid again starting from beginning
		while(lastNode.next!=null){
			lastNode = lastNode.next;
		}
		Node startNode = currNode.next;
		currNode.next = null;
		Node oldStartNode = list.head;
		lastNode.next = oldStartNode;
		list.head = startNode;
		return list;
	}
	public static void main(String []args){
		RotateLinkedList list = new RotateLinkedList();
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T!=0){
			int N = scanner.nextInt();
			for(int i=0;i<N;i++){
				list = insert(list,scanner.nextInt());
			}
			int k = scanner.nextInt();
			printList(list);
			rotateList(list,k);
			System.out.println("Rotating the List:: ");
			printList(list);
			T--;
		}
	}
}
