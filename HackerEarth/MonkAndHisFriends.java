/*Quest 13) Monk and his friends
 * Monk is standing at the door of his classroom. There are currently N students in the class, i'th student 
 * got Ai candies.
 *There are still M more students to come. At every instant, a student enters the class and wishes to be seated 
 *with a student who has exactly the same number of candies. For each student, Monk shouts YES if such a student 
 *is found, NO otherwise.
*/
package HackerEarthDS;
import java.util.*;

public class MonkAndHisFriends {
	public static void main(String []args) {
		System.out.println("");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            
            int N = sc.nextInt();
            int M = sc.nextInt();
            HashSet<Long> hset = new HashSet<Long>();
            
            for(int i=0;i<N;i++){
                long num = sc.nextLong();
                hset.add(num);
            }
        
            for(int i=0;i<M;i++){
                long num = sc.nextLong();
                if(hset.add(num)){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
            
            T--;
        }
    
	}
}
