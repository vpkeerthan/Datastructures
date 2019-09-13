package BillSharingApp;

import java.util.HashMap;

public class MainClass {
	public static void main(String []args){
		DriverClass obj = new DriverClass();
		obj.createUser(new User("Virgil Van Dijk"));
		obj.createUser(new User("Andy Robertson"));
		obj.createUser(new User("Trent Alexander Arnold"));
		obj.createUser(new User("Roberto Firmino"));
		obj.createUser(new User("Sadio Mane"));
		
		obj.createGroup(new Group("Defenders"));
		obj.createGroup(new Group("Midfielders"));
		
		obj.addUserToGroup("Virgil Van Dijk", "Defenders");
		obj.addUserToGroup("Andy Robertson", "Defenders");
		obj.addUserToGroup("Trent Alexander Arnold", "Defenders");
		obj.addUserToGroup("Trent Alexander Arnold", "Midfielders");
		obj.addUserToGroup("Roberto Firmino", "Midfielders");
		obj.addUserToGroup("Sadio Mane", "Midfielders");
		
		obj.printUsersInGroup("Defenders");
		obj.printUsersInGroup("Midfielders");
		
		HashMap<String, Double> bMap = new HashMap<String, Double>();
		bMap.put("Virgil Van Dijk", 100.00);
		bMap.put("Andy Robertson", 90.00);
		bMap.put("Trent Alexander Arnold", 80.00);
		obj.createBill(new Bill("Defenders"), bMap);
		
		HashMap<String, Double> bMap2 = new HashMap<String, Double>();
		bMap2.put("Trent Alexander Arnold", 180.00);
		bMap2.put("Roberto Firmino", 20.00);
		bMap2.put("Sadio Mane", 100.00);
		obj.createBill(new Bill("Midfielders"), bMap2);
		
		obj.calculateBillByGroup("Defenders");
		obj.calculateBillByGroup("Midfielders");
		
		obj.calculateBillForUser("Trent Alexander Arnold");
	}
}
