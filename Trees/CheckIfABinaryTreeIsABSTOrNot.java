// A program to check if a binary tree is BST or not
// Time Complexity : O(n)
// Auxiliary Space : O(1) if Function Call Stack size is not considered, otherwise O(n)

public class CheckIfABinaryTreeIsBSTOrNot {
	public static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			left=right=null;
		}
	}
	public static Node root;
	public boolean checkBST(Node node, int min, int max){
		if(node==null){
			System.out.println("BST");
			return true;
		}
		if(node.data<min||node.data>max){
			return false;
		}
		return (checkBST(node.left,min,node.data-1)&&checkBST(node.right, node.data+1, max));
	}
	public static void main(String []args){
		CheckIfABinaryTreeIsBSTOrNot tree = new CheckIfABinaryTreeIsBSTOrNot();
		root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		boolean isBST = tree.checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		if(isBST){
			System.out.println("BST");
		}else{
			System.out.println("Not a BST");
		}
	}
}
