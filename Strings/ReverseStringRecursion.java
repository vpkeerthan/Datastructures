//Print reverse of a string using recursion
public class ReverseStringRecursion {
	    public static void reverse(String str){
	        if(str==null||str.length()<=1){
	         System.out.println(""+str);   
	        }else{
	            System.out.println(""+str.charAt(str.length()-1));
	            str = str.substring(0,str.length()-1);
	            reverse(str);
	        }
	    }

	     public static void main(String []args){
	         String a = "Hello";
	         System.out.println("String ::"+a);
	         reverse(a);
	     }
}

