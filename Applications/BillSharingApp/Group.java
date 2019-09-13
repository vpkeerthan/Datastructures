package BillSharingApp;

import java.util.ArrayList;

public class Group {
	String groupName;
	int groupSize=0;
	ArrayList<User> users = new ArrayList<User>();
	Group(String groupName){
		this.groupName = groupName;
	}
}
