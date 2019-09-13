//Trying to read an write a data from and to a file
package JavaConcepts;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFromAFile {
	public static void main(String []args){
		File file = new File("C:\\Users\\vpkeerthan\\Desktop\\Test.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}
