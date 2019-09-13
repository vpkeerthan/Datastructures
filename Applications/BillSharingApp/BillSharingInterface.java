package BillSharingApp;

import java.util.HashMap;

public interface BillSharingInterface {
	public void createUser(User user);
	public void createGroup(Group group);
	public void addUserToGroup(String userName, String groupName);
	public void printUsersInGroup(String groupName);
	public void createBill(Bill bill,HashMap<String,Double> billsMap);
	public void calculateBillByGroup(String groupName);
	public void calculateBillForUser(String userName);
}
