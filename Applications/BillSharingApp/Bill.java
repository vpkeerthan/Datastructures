package BillSharingApp;

import java.util.HashMap;

public class Bill {
	String groupName;
	Double billTotal,paymentAmount;
	HashMap<String, Double> billMap = new HashMap<String, Double>();
	Bill(String groupName){
		this.groupName = groupName;
	}
}
