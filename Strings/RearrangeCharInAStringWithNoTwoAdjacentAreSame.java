import java.util.Comparator;
import java.util.PriorityQueue;

/*Rearrange characters in a string such that no two adjacent are same
Given a string with repeated characters, task is rearrange characters in a string so that no two adjacent 
characters are same.
 */
public class RearrangeCharInAStringWithNoTwoAdjacentAreSame {
	public class keyComparator implements Comparator<key>{
		public int compare(key k1, key k2){
			if(k1.freq<k2.freq){
				return 1;
			}else{
				return -1;
			}
		}
	}
	public class key{
		int freq;
		char ch;
		key(int freq,char ch){
			this.freq = freq;
			this.ch = ch;
		}
	}
	public void rearrangeString(String str){
		//calculate frequency
		int count[] = new int[26];
		for(int i=0;i<str.length();i++){
			count[str.charAt(i)-'a']++;
		}
		//create a pq of type key
		PriorityQueue<key> pq = new PriorityQueue<>(new keyComparator());
		//insert or add all the characters in the string along with its frequency
		for(char ch='a';ch<='z';ch++){
			if(count[ch-'a']>0){
				pq.add(new key(count[ch-'a'],ch));
			}
		}
		int oldLength = str.length();
		str = "";	//to store the rearranged characters
		key prev = new key(-1, '#'); //prev to store the prev char stored, here we are storing random default value for the first insertion
		while(pq.size()!=0){
			key k = pq.peek();
			char c = k.ch;
			pq.poll();
			str = str+c;
			if(prev.freq>0){
				pq.add(prev);
			}
			k.freq--;
			prev = k;
		}
		if(oldLength!=str.length()){
			System.out.println(" -1 "+str);
		}else{
			System.out.println(" 1 " + str);
		}
	}
	public static void main(String []args){
		String str = "bbbaa";
		RearrangeCharInAStringWithNoTwoAdjacentAreSame r = new RearrangeCharInAStringWithNoTwoAdjacentAreSame();
		r.rearrangeString(str);
	}
}
