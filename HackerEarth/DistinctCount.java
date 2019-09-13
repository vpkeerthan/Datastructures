/*Given an array A of N integers, classify it as being Good Bad or Average. It is called Good, if it contains 
 * exactly X distinct integers, Bad if it contains less than X distinct integers and Average if it contains 
 * more than X distinct integers.
 */

package HackerEarthDS;
import java.util.*;

public class DistinctCount {
	
	public static void main(String []args){
        System.out.println("hiii");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            long num[];
            
            HashSet<Long> hset = new HashSet<Long>();
            
            for(int i=0;i<N;i++){
                hset.add(sc.nextLong());
            }
            
            if(hset.size()<X){
                System.out.println("Bad");
            }else if(hset.size()>X){
                System.out.println("Average");
            }else{
                System.out.println("Good");
            }
            
            T--;
        }
        
        
    }
}
