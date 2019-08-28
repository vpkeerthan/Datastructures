import java.util.*;
public class ReverseWordsInAString {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T!=0){
		    String str = scanner.nextLine();
		    System.out.println("String:: "+str);
		    String arr[] = str.split("\\.");
		    String reverse="";
		    for(int i=arr.length-1;i>=0;i--){
		        reverse += arr[i]+".";
		    }
		    System.out.println("Reverse:: "+reverse);
		    T--;
		}
		scanner.close();
	}
}
