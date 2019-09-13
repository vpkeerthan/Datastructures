package CollegeApp;

public class Student {
	String name;
	String deptName="Not Enrolled";
	Double grade;
	Student(){
		
	}
	Student(String name){
		this.name = name;
	}
	public void setDept(String deptName){
		this.deptName = deptName;
	}
	public void setGrade(Double grade){
		this.grade = grade;
	}
}
