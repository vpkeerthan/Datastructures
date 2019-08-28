import java.util.*;

public class SplitString {
	
	public static void stringSplit(String str){
		int n = str.length();
		String []arr = new String[10];
		int index =0;
		String s = "";
		boolean flag=true;
		int wordCount = 0;
		
		for(int i=0;i<n;i++){
			if(str.charAt(i)=='\"'){
				flag = !flag;
			}
			
			if(str.charAt(i)==' ' && flag){
				arr[index++] = s.trim();
				wordCount++;
				s="";
			}
			s = s+str.charAt(i);
		}
		arr[index++] = s.trim();
		wordCount++;
		
		System.out.println("Split 1: ");
		for(int i=0;i<wordCount;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void stringSplit2(String str){
		System.out.println("Split 2: ");
		String []arr = str.split("\\s|,");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String []args){
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		stringSplit(str);
		stringSplit2(str);
	}

}
