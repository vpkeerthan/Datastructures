//Maximum of all subarrays of size k
import java.util.*;
public class SlidingWindowMaximum {

	public static void main (String[] args) {
		//code
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int T = myObj.nextInt();
        while(T!=0){
            int N = myObj.nextInt();
            int K = myObj.nextInt();
            int [] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = myObj.nextInt();
            }
            for(int i=0;i<=N-K;i++){
                int val = ((arr[i]>arr[i+1])? (arr[i]>arr[i+2]?arr[i]:arr[i+2]):(arr[i+1]>arr[i+2]?arr[i+1]:arr[i+2]));
                System.out.println(" "+val);
            }
            
            T--;
        }
        myObj.close();
	}
}
