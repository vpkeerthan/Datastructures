/*Print Right and Left View of a Binary Tree
Given a Binary Tree, print Right view and Left of it. Right view of a Binary Tree is set of nodes visible when tree is 
visited from Right side. Similarly left view.
 */

//Time Complexity: The function does a simple traversal of the tree, so the complexity is O(n).

public class RightViewOfATree {
	public static class Node{
		int data;
		Node left,right;
		public Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	Node root;
	public static int cur_level = 0;
	public static int cur_level2 = 0;
	public void rightView(Node node,int level){
		if(node==null){
			return;
		}
		if(cur_level < level){
			System.out.println(" "+node.data);
			cur_level = level;
		}
		rightView(node.right, level+1);
		rightView(node.left, level+1);
	}
	public void leftView(Node node,int level){
		if(node==null){
			return;
		}
		if(cur_level2 < level){
			System.out.println(" "+node.data);
			cur_level2 = level;
		}
		leftView(node.left, level+1);
		leftView(node.right, level+1);
	}
	public static void main(String[] args){
		RightViewOfATree tree = new RightViewOfATree();
		tree.root = new Node(12);
		tree.root.left = new Node(10);
		tree.root.left.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.right.left = new Node(25);
		tree.root.right.right = new Node(40);
		tree.root.right.right.left = new Node(50);
		
		System.out.println("Right view of the tree :: ");
		tree.rightView(tree.root, 1);
		System.out.println("Left view of the tree :: ");
		tree.leftView(tree.root, 1);
	}
}
