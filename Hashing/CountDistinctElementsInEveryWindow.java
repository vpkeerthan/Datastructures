/*Count distinct elements in every window of size k
Given an array of size n and an integer k, return the of count of distinct numbers in all windows of size k.
*/

package HashingPrograms;

import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {
	
	public static void findDistinctCount(int arr[],int k){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int distinctCount=0;
		
		for(int i=0;i<k;i++){
			if(hm.get(arr[i])== null){
				hm.put(arr[i], 1);
				distinctCount++;
			}else{
				int count = hm.get(arr[i]);
				hm.put(arr[i], count+1);
			}
		}
		System.out.println("Distinct elements count ::"+distinctCount);
		
		for(int i=k;i<arr.length;i++){
			if(hm.get(arr[i-k])==1){
				hm.remove(arr[i-k]);
				distinctCount --;
			}else{
				int count = hm.get(arr[i-k]);
				hm.put(arr[i-k], count-1);
			}
			
			if(hm.get(arr[i])==null){
				hm.put(arr[i], 1);
				distinctCount++;
			}else{
				int count = hm.get(arr[i]);
				hm.put(arr[i], count+1);
			}
			System.out.println("Distinct elements count ::"+distinctCount);
		}
	}
	
	public static void main(String[] args){
		int arr[]={1,2,1,3,4,2,3};
		int k =4;
		findDistinctCount(arr,k);
	}
}
