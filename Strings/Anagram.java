import java.util.HashMap;
import java.util.Scanner;


public class Anagram {
	
	public static void checkForAnagram(String str1,String str2){
		System.out.println("Checking for Anagram");
		
		if(str1.length()!=str2.length()){
			System.out.println("Strings are not Anagrams");
			return;
		}
		
		HashMap<Character,Integer> hmap = new HashMap<Character, Integer>();
		for(int i=0;i<str1.length();i++){
			if(hmap.get(str1.charAt(i)) == null){			//Checking if the character already exists in the hashmap
				hmap.put(str1.charAt(i), 1);				//Inserting count 1 for new character
			}else{
				int count = hmap.get(str1.charAt(i));		//Incrementing count for already present character
				hmap.put(str1.charAt(i), ++count);
			}
		}
		
		for(int i=0;i<str2.length();i++){
			if(hmap.get(str2.charAt(i))== null){
				System.out.println("Strings are not Anagrams");
				return;
			}else{
				int count = hmap.get(str2.charAt(i));
				hmap.put(str2.charAt(i), --count);			//Decrementing the count
			}
		}
		System.out.println("Strings are Anagrams");
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1 = sc.nextLine();
		
		System.out.println("Enter String 2");
		String str2 = sc.nextLine();
		checkForAnagram(str1,str2);
	}
}
