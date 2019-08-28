import java.util.TreeMap;

//Print a Binary Tree in Vertical Order
/* Testcase1:
         1
       /     \
    2         3
              /
         5
As it is evident from the above diagram that during vertical traversal 2 will come first, then 1 and  5, 
and then 3. So output is 2 1 5 3
 */
public class VerticalOrderOfATree {
	
	public static class Node{
		int data;
		Node left,right;
		Node(int data){
			left=right=null;
		}
	}
	
	public static int hd = 0; //hd : Horizontal Distance
	public static TreeMap<Integer, Integer> tm;
	
	public static void verticalOrder(Node node,int hd,TreeMap<Integer, Integer> tm){
		if(node == null){
			return;
		}
		tm.put(hd, node.data);
		verticalOrder(node.left, hd-1, tm);
		verticalOrder(node.right, hd+1, tm);
	}
	
	public static void print(){
		System.out.println(" "+tm);
	}
	
	public static void main(String args[]){
//		VerticalOrderOfATree vt = new VerticalOrderOfATree();
//		VerticalOrderOfATree.Node node = vt.new Node(1);
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.right.left = new Node(5);
		
		verticalOrder(node, 0, tm);
		print();
	}
}
