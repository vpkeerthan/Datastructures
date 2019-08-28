/*Median in a stream of integers (running integers)
Given that integers are read from a data stream. Find median of elements read so for in efficient way
 */
import java.util.*;
public class MedianInAStreamOfIntegers {
	
	public static void getMedians(int integers[]){
		PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer a1,Integer a2){
				return -1 * a1.compareTo(a2); //Sorts it in descending order, as we need to get the highest element at the top
			}
		});
		PriorityQueue<Integer> highers = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer a1,Integer a2){
				return a1.compareTo(a2); //Ascending order
			}
		});
		double median;
		for(int i=0;i<integers.length;i++){
			addNumber(integers[i], lowers, highers);
			rebalance(lowers, highers);
			median = getMedian(lowers, highers);
			System.out.println("Median :: "+median);
		}
	}
	
	public static void addNumber(int number,PriorityQueue<Integer> lowers,PriorityQueue<Integer> highers){
		if(lowers.size()==0 ||number<lowers.peek()){
			lowers.add(number);
		}else{
			highers.add(number);
		}
	}
	
	public static void rebalance(PriorityQueue<Integer> lowers,PriorityQueue<Integer> highers){
		PriorityQueue<Integer> biggerHeap = lowers.size()>highers.size()?lowers:highers;
		PriorityQueue<Integer> smallerHeap = lowers.size()>highers.size()?highers:lowers;
		if(biggerHeap.size() - smallerHeap.size()>=2){
			smallerHeap.add(biggerHeap.poll());
		}
		System.out.println(" Lowers::  "+lowers + " Highers:: "+highers);
	}
	public static double getMedian(PriorityQueue<Integer> lowers,PriorityQueue<Integer> highers){
		PriorityQueue<Integer> biggerHeap = lowers.size()>highers.size()?lowers:highers;
		PriorityQueue<Integer> smallerHeap = highers.size()>lowers.size()?highers:lowers;
		if(biggerHeap.size() == smallerHeap.size()){
			return (double) (biggerHeap.peek() + smallerHeap.peek())/2;
		}else{
			return smallerHeap.peek();
		}
	}
	public static void main(String args[]){
		int [] integers = {6,3,8,10};
		getMedians(integers);
	}
}
