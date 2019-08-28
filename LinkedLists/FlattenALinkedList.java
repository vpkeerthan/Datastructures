
public class FlattenALinkedList {
	public class Node{
		int data;
		Node right, down;
		Node(int data){
			this.data = data;
			this.right = null;
			this.down = null;
		}
	}
	
	public Node merge(Node node1,Node node2){
		if(node1==null){			//if node1 is empty then return node2
			return node2;
		}
		if(node2==null){			//if node2 is empty then return node1
			return node1;
		}
		
		Node result;
		if(node1.data<node2.data){				//find the smaller node
			result = node1;
			result = merge(node1.down,node2);	//move down in the same list and compare it with the higher node
		}else{
			result = node2;
			result = merge(node1,node2.down);
		}
		return result;
	}
	
	public Node flatten(Node root){
		if(root==null || root.right==null){		//Base case
			return root;
		}
		return merge(root,flatten(root.right));	//recursively merge the root and all the other roots with it's sub list
	}
}
