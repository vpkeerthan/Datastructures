import java.util.*;
public class BillSharingApp {
	public static class User{
		String name;
		int balance;
		public void registerUser(String name){
			this.name = name;
		}
		public int getbalance(String name){
			return balance;
		}
	}
	public static class Group{
		String groupName;
		List<User> users = new ArrayList<User>();
		HashMap<String, List<User>> hmap = new HashMap<String, List<User>>();
		
		public void addUser(String name, List<User>user){
			groupName = name;
			List<User> usersList = new ArrayList<User>();
			for(int i=0;i<user.size();i++){
				usersList.add(user.get(i));
			}
			hmap.put(groupName, usersList);
		}
		
		public List<User> getUsers(String name){
			List<User> userList = new ArrayList<User>();
			userList = hmap.get("name");
			return userList;
		}
		
		public void printGroup(String groupName){
			List<User>user = (List<User>) hmap.get(groupName);
			for(int i=0;i<user.size();i++){
				System.out.println("List of users of group: "+groupName+" are "+user.get(i).name);
			}
		}
	}
	
	public static class Bill extends Group{
		Integer TotalBill=0,EqualAmount=0;
		HashMap<String,HashMap<String,Integer>> billMap = new HashMap<String, HashMap<String,Integer>>();
		HashMap<String,Integer> userBillMap = new HashMap<String,Integer>();
		public void addBill(String groupName,HashMap<String, Integer> bill){
			userBillMap = bill;
			billMap.put(groupName, bill);
			HashMap<String,Integer> existing_bill = (HashMap<String,Integer>) billMap.get(groupName);
			HashMap<String,Integer> new_bill = new HashMap<String, Integer>();
			for(String key:existing_bill.keySet()){
				new_bill.put(key, existing_bill.get(key));
			}
			for(String key:bill.keySet()){
				new_bill.put(key, bill.get(key));
			}
		}
//		public void amountToBePaidByUser(String username){
//			int amountPaid = userBillMap.get(username);
//			System.out.println("Amount To be Paid By : "+username+" is : "+(EqualAmount-amountPaid));
//		}
		public void amountToBePaidByPersonInAGroup(String groupName,String userName){
			Integer TotalBillAmount =0;
			HashMap<String,Integer> bill = (HashMap<String,Integer>) billMap.get(groupName);
			for(String key:bill.keySet()){
				TotalBillAmount = TotalBillAmount +(Integer)bill.get(key);
			}
			int amountPaid = (Integer) bill.get(userName);
			System.out.println("amountPaid:::"+amountPaid);
			System.out.println("Amount To be Paid By : "+userName+" for group "+groupName+" is : "+((TotalBillAmount/bill.size())-amountPaid));
		}
		public void printBill(){
			System.out.println("TotalBill::"+TotalBill);
		}
	}
	
	public static void main(String []args){
		User user1 = new User();
		user1.registerUser("Asish");
		User user2 = new User();
		user2.registerUser("Devbrat");
		
		Group group1 = new Group();
		Group group2 = new Group();
		
		List userlist = new ArrayList();
		List userlist2 = new ArrayList();
		
		userlist.add(user1);
		userlist.add(user2);
		
		userlist2.add(user2);
		
		group1.addUser("Flipkart_Party", userlist);
		group1.printGroup("Flipkart_Party");
		
		group2.addUser("School_Friends", userlist2);
		group2.printGroup("School_Friends");
		
		Bill bill1 = new Bill();
		HashMap<String, Integer> bill = new HashMap<String, Integer>();
		bill.put("Asish", 10);
		bill.put("Devbrat", 20);
		bill1.addBill("Flipkart_Party",bill);
		bill1.printBill();
//		bill1.amountToBePaidByUser("Asish");
//		bill1.amountToBePaidByUser("Devbrat");
		
		Bill bill2 = new Bill();
		HashMap<String, Integer> bil2 = new HashMap<String, Integer>();
		bil2.put("Asish", 90);
		bil2.put("Devbrat", 10);
		bill2.addBill("School_Friends",bil2);
		bill2.printBill();
//		bill2.amountToBePaidByUser("Asish");
//		bill2.amountToBePaidByUser("Devbrat");
		
		bill2.amountToBePaidByPersonInAGroup("School_Friends", "Asish");
	}
}
