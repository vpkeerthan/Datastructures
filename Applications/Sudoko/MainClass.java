package SudokoisValid;

public class MainClass {
	
	public static void main(String args[]){
		
		Sudoko obj = new Sudoko();
		if(obj.checkRow()||obj.checkColumn()||obj.checkBox()){
			System.out.println("Sudoko is invalid");
		}else{
			System.out.println("Sudoko is valid");
		}
	}
}
