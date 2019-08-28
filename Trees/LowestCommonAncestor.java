//Given values of two values n1 and n2 in a Binary Search Tree, find the Lowest Common Ancestor (LCA)
public class LowestCommonAncestor {
	public static class Node{
		int data;
		Node right,left;
		Node(int data){
			this.data = data;
			right = null;
			left = null;
		}
	}
	
	public Node findLCA(Node node,int n1,int n2){
		if(node==null){
			return null;
		}
		if(n1<node.data && n2<node.data){
			return findLCA(node.left, n1, n2);
		}
		if(n1>node.data && n2>node.data){
			return findLCA(node.right, n1, n2);
		}
		return node;
	}
	
	public static void main(String args[]){
		Node node = new Node(20);
		node.left = new Node(8);
		node.right = new Node(22);
		node.left.left = new Node(4);
		node.left.right = new Node(12);
		node.left.left.left = new Node(10);
		node.left.left.right = new Node(14);
		
		LowestCommonAncestor lca = new LowestCommonAncestor();
		System.out.println("LCA of 14 and 22: "+lca.findLCA(node, 14, 22).data);
		System.out.println("LCA of 14 and 8: "+lca.findLCA(node, 14, 8).data);
		System.out.println("LCA of 14 and 10: "+lca.findLCA(node, 14, 10).data);
		
	}
}
