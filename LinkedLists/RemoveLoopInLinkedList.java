/* Remove loop in Linked List
 * First line of input contains number of testcases T. T testcases follow. For each testcase, first line 
 * of input contains length N of the linked list and next line contains N data of the linked list.  
 * The third line contains the position of the node(from head) to which the last node will get connected. 
 * If it is 0 then there is no loop.
 */
import java.util.*;
public class RemoveLoopInLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next =null;
		}
	}
	public static void printList(RemoveLoopInLinkedList list){
		Node node = list.head;
		while(node!=null){
			System.out.println(" "+node.data);
			node = node.next;
		}
	}
	public static RemoveLoopInLinkedList insert(RemoveLoopInLinkedList list,int data){
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
	public static RemoveLoopInLinkedList insertK(RemoveLoopInLinkedList list, int k){
		Node nodek = list.head;
		if(k==0){
			return list;
		}
		while(k!=1){
			nodek = nodek.next;
			k--;
		}
		Node lastNode = list.head;
		while(lastNode.next!=null){
			lastNode = lastNode.next;
		}
		lastNode.next = nodek;
		return list;
	}
	public static RemoveLoopInLinkedList removeLoop(RemoveLoopInLinkedList list, int k){
		
		return list;
	}
	public static void main(String []args){

		RemoveLoopInLinkedList list = new RemoveLoopInLinkedList();
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T!=0){
			int N = scanner.nextInt();
			for(int i=0;i<N;i++){
				list = insert(list,scanner.nextInt());
			}
			int k = scanner.nextInt();
			list = insertK(list,k);
			list = removeLoop(list,k);
			T--;
		}
	
	}
}
