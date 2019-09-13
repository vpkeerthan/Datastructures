package BillSharingApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DriverClass {
	ArrayList<User> usersList = new ArrayList<User>();
	ArrayList<Group> groupsList = new ArrayList<Group>();
	ArrayList<Bill> billsList = new ArrayList<Bill>();
	
	public void createUser(User user){
		usersList.add(user);
	}
	
	public void createGroup(Group group){
		groupsList.add(group);
	}
	
	public void addUserToGroup(String userName, String groupName){
		for(Group group : groupsList){
			if(group.groupName.equals(groupName)){
				group.users.add(new User(userName));
				group.groupSize++;
			}
		}
	}
	
	public void printUsersInGroup(String groupName){
		System.out.println("Users in group: "+groupName+" are: ");
		for(Group group : groupsList){
			if(group.groupName.equals(groupName)){
				for(User user : group.users){
					System.out.println("Username: "+user.userName);
				}
			}
		}
	}

	public void createBill(Bill bill,HashMap<String,Double> billsMap){
		Double totalBill = 0.00;
		int groupSize = 0;
		for(Map.Entry<String, Double> entry : billsMap.entrySet()){
			bill.billMap.put(entry.getKey(), entry.getValue());
			totalBill = totalBill + entry.getValue();
		}
		for(Group group : groupsList){
			if(group.groupName.equals(bill.groupName)){
				groupSize = group.groupSize;
			}
		}
		bill.billTotal = totalBill;
		bill.paymentAmount = (totalBill/Double.valueOf(groupSize));
		billsList.add(bill);
	}
	
	public void calculateBillByGroup(String groupName){
		for(Bill bill:billsList){
			if(bill.groupName.equals(groupName)){
				for(Map.Entry<String, Double> entry : bill.billMap.entrySet()){
					System.out.println(entry.getKey()+" has to pay: "+(bill.paymentAmount - entry.getValue()));
				}
			}
		}
	}
	
	public void calculateBillForUser(String userName){
		double totalBalance = 0.00;
		ArrayList<String> groups = new ArrayList<String>();		//To fetch all the groups for this user
		for(Group group : groupsList){
			for(User user : group.users){
				if(user.userName.equals(userName)){
					groups.add(group.groupName);
				}
			}
		}
		for(String groupName : groups){							//For every group user is in, calculate the bill for it
			for(Bill bill : billsList){
				if(bill.groupName.equals(groupName)){
					for(Map.Entry<String, Double> entry : bill.billMap.entrySet()){
						if(entry.getKey().equals(userName)){
							totalBalance = totalBalance + (bill.paymentAmount-entry.getValue());	//totalBalance + (Need to pay amount - Amount payed)
						}
					}
				}
			}
		}
		System.out.println("Amount to be paid by user: "+userName+" is: "+totalBalance);
	}
	
	
}
