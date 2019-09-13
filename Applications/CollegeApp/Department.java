package CollegeApp;

public class Department {
	String departmentName;
	String departmentHead;
	Department() {

	}
	Department(String departmentName){
		this.departmentName = departmentName;
	}
	public void createHOD(String departmentHead){
		this.departmentHead = departmentHead;
	}
}
