/*Given an array C of size N-1 and given that there are numbers from 1 to N 
 * with one element missing, the missing number is to be found.
 */
import java.util.Scanner;
public class MissingNumberInArray {

	public static void main (String[] args) {
		//code
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    int T = myObj.nextInt();
    while(T!=0){
        int N = myObj.nextInt();
        int [] arr = new int[N];
        for(int i=0;i<N-1;i++){
         arr[i] = myObj.nextInt();
            if(arr[i]!=i+1){
                System.out.println("Missing number is ::"+(i+1));
            }
        }
        T--;
    }
    myObj.close();
	}
	
}
