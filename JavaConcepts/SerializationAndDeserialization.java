package JavaConcepts;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationAndDeserialization implements Serializable {
	String username;
	transient String password;
	
	public SerializationAndDeserialization(String username,String password) {
		this.username = username;
		this.password = password;
	}
	
	public static void main(String []args){
		
		try {
			FileOutputStream file = new FileOutputStream("FileName.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(out);
			
			out.close();
			file.close();
			
			System.out.println("Data Before Serialization");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
