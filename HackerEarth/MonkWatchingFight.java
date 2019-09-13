/* Quest 15) Monk watching fight
 * Finding the height of a BST
 * */

package HackerEarthDS;
import java.util.*;

public class MonkWatchingFight {
	public static class Node{
        int data;
        Node left,right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static Node constructTree(int data,Node node){
        if(node==null){
            return new Node(data);
        }else if(data<node.data){
            node.left = constructTree(data,node.left);
        }else if(data>node.data){
            node.right = constructTree(data,node.right);
        }
        return node;
    }
    
    public static int findDepth(Node node){
        if(node==null){
            return 0;
        }
        
        int ldepth = findDepth(node.left);
        int rdepth = findDepth(node.right);
        
        if(ldepth>rdepth)
            return ldepth+1;
        else
            return rdepth+1;
    }
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node root=null;
        for(int i=0;i<N;i++){
            root = constructTree(sc.nextInt(),root);
        }
        
        System.out.println(findDepth(root));
        
    }
}
