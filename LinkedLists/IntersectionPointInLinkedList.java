/*
 */
import java.util.*;
public class IntersectionPointInLinkedList {
	Node head=null;
	Node tail=null;
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next =null;
		}
	}
	public void printList(){
		Node node = head;
		while(node!=null){
			System.out.println(" "+node.data);
			node = node.next;
		}
	}
	public void addToLast(Node node,Node tail){
		if(head==null){
			head = node;
			tail=head;
		}else{
			tail.next = node;
			tail = node;
		}
	}
	public static int intersectionPoint(int N1, int N2, Node head1,Node head2){
		Node currNode1 = head1;
		Node currNode2 = head2;
		if(N1>N2){
			int N = N1-N2;
			while(N!=1){
				currNode1 = currNode1.next;
				N--;
			}
		}else if(N2>N1){
			int N = N2-N1;
			while(N!=1){
				currNode2 = currNode2.next;
				N--;
			}
		}
		while(currNode1.next!=null && currNode2.next!=null){
			if(currNode1==currNode2){
				return currNode1.data;
			}
			currNode1 = currNode1.next;
			currNode2 = currNode2.next;
		}
		return -1;
	}
	public static void main(String []args){

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T!=0){
			int N1 = scanner.nextInt();
			int N2 = scanner.nextInt();
			int N3 = scanner.nextInt();
			IntersectionPointInLinkedList list1 = new IntersectionPointInLinkedList();
			IntersectionPointInLinkedList list2 = new IntersectionPointInLinkedList();
			IntersectionPointInLinkedList list3 = new IntersectionPointInLinkedList();
			int a = scanner.nextInt();
			Node head1 = new Node(a);
			Node tail1 = head1;
			list1.addToLast(head1,tail1);
			for(int i=1;i<N1;i++){
				int a1 = scanner.nextInt();
				list1.addToLast(new Node(a1),tail1);
			}
			a = scanner.nextInt();
			Node head2 = new Node(a);
			Node tail2 = head2;
			list1.addToLast(head2,tail2);
			for(int i=1;i<N2;i++){
				int a1 = scanner.nextInt();
				list2.addToLast(new Node(a1),tail2);
			}
			a = scanner.nextInt();
			Node head3 = new Node(a);
			Node tail3 = head3;
			list1.addToLast(head3,tail3);
			for(int i=1;i<N3;i++){
				int a1 = scanner.nextInt();
				list3.addToLast(new Node(a1),tail3);
			}
			System.out.println("head1::"+head1.data);
			System.out.println("head2::"+head2.data);
			System.out.println("head3::"+head3.data);
			
			System.out.println("tail1::"+tail1.data);
			System.out.println("tail2::"+tail2.data);
			if(tail1!=null){
				tail1.next = head3;
			}
			if(tail2!=null){
				tail2.next = head3;
			}
			System.out.println("tail1::"+tail1.data);
			System.out.println("tail2::"+tail2.data);
			list1.printList();
			list2.printList();
			list3.printList();
			int intersection_point = intersectionPoint(N1,N2,head1,head2);
			System.out.println("Intersection point::"+intersection_point);
			T--;
		}
	
	}
}
//IntersectionPointInLinkedList list,Node head
