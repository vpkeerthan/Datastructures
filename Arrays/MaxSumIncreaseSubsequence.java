
import java.util.*;

public class MaxSumIncreaseSubsequence {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T!=0){
		    int N = scanner.nextInt();
		    int [] arr = new int [N];
		    int []maxValArr = new int[N];
		    int []indexArr = new int[N];
		    for(int i=0;i<N;i++){
		        arr[i] = scanner.nextInt();
		        maxValArr[i]=arr[i];
		        indexArr[i]=i;
		    }
            
            int maxVal=0,maxIndex=0;
		    for(int i=1;i<N;i++){
		        for(int j=0;j<i;j++){
		            if(arr[j]<arr[i]){
		                maxValArr[i]=arr[i]+maxValArr[j];
		                indexArr[i]=j;
		                System.out.println("maxValArr["+i+"] ::"+maxValArr[i]);
		                if(maxValArr[i]>maxVal){
		                    maxVal=maxValArr[i];
		                    maxIndex=i;
		                }
		            }
		        }
		    }
		    System.out.println("MaxValue ::"+maxVal+" MaxIndex ::"+maxIndex);
		    //try to print the value sequence
		}
		scanner.close();
	}
}
