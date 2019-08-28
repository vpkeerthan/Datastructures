/*Given an unsorted array A of size N of non-negative integers, find a continuous 
 *sub-array which adds to a given number S.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
public class SubArrayGivenSum {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T!=0){
		    int N = scanner.nextInt();
		    int sum = scanner.nextInt();
		    int [] arr = new int [N];
		    for(int i=0;i<N;i++){
		        arr[i] = scanner.nextInt();
		    }
		    int j = 0;
		    while(j<=N){
		        int tempSum = 0;
		        for(int i=j;i<N;i++){
		            if(tempSum==sum){
		                System.out.println("Element position:: "+(j+1)+" "+i);
		                break;
		            }else if(tempSum>sum){
		                break;
		            }else{
		                tempSum = tempSum + arr[i];
		            }
		        }
		        j++;
		    }
		    T--;
		}
	}
}
