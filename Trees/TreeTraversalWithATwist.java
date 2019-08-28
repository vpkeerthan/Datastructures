//Given a post order traversal of a BST, transform the tree such that each node now represents sum of its
//parent node and itself. If a node has no parent node, its value need not change
public class TreeTraversalWithATwist {
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			left = null;
			right =null;
		}
	}
	
	public static Node createInorderTreeFromPostOrder(int postOrder[],int start,int end){
		
		if(start>end){
			return null;
		}
		
		Node node = new Node(postOrder[end]);
		int i;
		for(i=end;i>=start;i--){
			if(postOrder[i]<node.data){
				break;
			}
		}
		
		node.right = createInorderTreeFromPostOrder(postOrder, i+1, end-1);
		node.left = createInorderTreeFromPostOrder(postOrder, start, i);
		
		return node;
	}
	
	public static Node createInorderTreeFromInorder(int inorder[],int start,int end){
		if(start>end){
			return null;
		}
		
		int mid = (start+end)/2;
		Node node = new Node(inorder[mid]);
		
		node.left = createInorderTreeFromInorder(inorder, start, mid-1);
		node.right = createInorderTreeFromInorder(inorder, mid+1, end);
		
		return node;
	}
	
	public static Node createInorderTreeFromPreOrder(int preOrder[],int start,int end){
		if(start>end){
			return null;
		}
		
		Node node = new Node(preOrder[start]);
		int i;
		for(i=end;i>start;i--){
			if(preOrder[i]<node.data){
				break;
			}
		}
		
		
		return node;
	}
	
	public static void inorderTree(Node node){
		if(node==null){
			return;
		}
		inorderTree(node.left);
		System.out.println(" "+node.data);
		inorderTree(node.right);
	}
	
	public static void inorderSumTree(Node node,Node parent){
		if(node==null){
			return;
		}
		if(parent==null){								//To print the root
			System.out.println(" "+node.data);
			return;
		}
		inorderSumTree(node.left,node);
		System.out.println(" "+(node.data+parent.data));
		inorderSumTree(node.right,node);
	}
	
	public static void main(String args[]){
		int postOrder[] = {8,12,10,16,25,20,15};
		int preOrder[]={};
		int inorder[]={8,10,12,15,16,20,25};
		
		Node node = createInorderTreeFromPostOrder(postOrder, 0, postOrder.length-1);
		System.out.println("Inorder traversal of given Post Order::");
		inorderTree(node);
		
		System.out.println("Inorder Sum Tree ::");
		inorderSumTree(node.left,node);
		inorderSumTree(node, null);
		inorderSumTree(node.right,node);
		
		Node in_node = createInorderTreeFromInorder(inorder, 0, inorder.length-1);
		System.out.println("Inorder traversal of given Inorder::");
		inorderTree(in_node);
	}
}
