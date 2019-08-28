import java.util.*;

/*Given a linked list of N nodes. The task is to check if the the linked list has a loop. Linked list can 
 * contain self loop.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains length of 
linked list and next line contains the data of linked list.

Output:
For each testcase, print "True", if linked list contains loop, else print "False".
*/
public class DetectLoopInLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next =null;
		}
	}
	public static DetectLoopInLinkedList insert(DetectLoopInLinkedList list,int data){
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
	public static void printList(DetectLoopInLinkedList list){
		Node node = list.head;
		while(node!=null){
			System.out.println(" "+node.data);
			node = node.next;
		}
	}
	public static DetectLoopInLinkedList insertK(DetectLoopInLinkedList list, int k){
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
	public static boolean detectLoop(DetectLoopInLinkedList list){
		Node slowNode = list.head;
		Node fastNode = list.head;
		while(fastNode!=null && fastNode.next!=null){
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			if(slowNode==fastNode){
				return true;
			}
		}
		return false;
	}
	public static void main(String []args){

		DetectLoopInLinkedList list = new DetectLoopInLinkedList();
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T!=0){
			int N = scanner.nextInt();
			for(int i=0;i<N;i++){
				list = insert(list,scanner.nextInt());
			}
			int k = scanner.nextInt();
			list = insertK(list,k);
			if(detectLoop(list)){
				System.out.println("True");
			}else{
				System.out.println("False");
			}
			T--;
		}
	
	}
}
