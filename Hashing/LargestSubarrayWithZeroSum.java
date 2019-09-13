package HashingPrograms;

import java.util.HashMap;

public class LargestSubarrayWithZeroSum {
	public static void findLargestSubArray(int arr[]){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sum = 0,max_length=0;
		
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			if(sum==0){
				max_length = i+1;	//For case where the sum becomes 0 in the end, but we don't have 0 in the hashmap ex: arr3
			}
			if(hm.get(sum)==null){
				hm.put(sum, i);
			}else{
				int pos = hm.get(sum);
				max_length = i - pos;
			}
		}
		System.out.println("Max Length SubArray::"+max_length);
	}
	
	public static void main(String []args){
		
		int arr[]={15,-2,2,-8,1,7,10,23};
		findLargestSubArray(arr);
		
		int arr2[]={10,20,30};
		findLargestSubArray(arr2);
		
		int arr3[]={10,-20,-30,40};
		findLargestSubArray(arr3);
		
		int arr4[]={30,20,10,-10,-30};
		findLargestSubArray(arr4);
	}
}
