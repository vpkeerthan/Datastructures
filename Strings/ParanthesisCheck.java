import java.util.*;
public class ParanthesisCheck {
	
	static boolean isMatchingPair(char character1, char character2) 
    { 
       if (character1 == '(' && character2 == ')') 
         return true; 
       else if (character1 == '{' && character2 == '}') 
         return true; 
       else if (character1 == '[' && character2 == ']') 
         return true; 
       else
         return false; 
    } 
	
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T!=0){
		    String exp = scanner.nextLine();
		    Stack<String> stack = new Stack<String>();
		    for(int i=0;i<exp.length();i++){
		    	char ch = exp.charAt(i);
		    	if(ch=='{' || ch=='[' || ch=='(' ){
		    		stack.push(Character.toString(ch));
		    	}
		    	if(ch=='}' || ch==']' || ch==')' ){
		    		String popped = stack.pop();
		    		 
		    	}
		    }
		    T--;
		}    
	}
}
