package CollegeApp;

public class MainClass {
	public static void main(String []args){
		DriverClass obj = new DriverClass();
		
		obj.createDepartment(new Department("CS"));
		obj.createDepartment(new Department("EC"));
		obj.createDepartment(new Department("IT"));
		
		obj.addStudent(new Student("Virgil Van Dijk"));
		obj.addStudent(new Student("Alison Becker"));
		obj.addStudent(new Student("Andy Robertson"));
		obj.addStudent(new Student("Trent Alexander Arnold"));
		obj.addStudent(new Student("Joe Gomes"));
		
		obj.printAllStudents();
		
		obj.addStudentToADepartment("Virgil Van Dijk", "CS");
		obj.addStudentToADepartment("Alison Becker", "EC");
		obj.addStudentToADepartment("Andy Robertson", "CS");
		obj.addStudentToADepartment("Trent Alexander Arnold", "IT");
		obj.addStudentToADepartment("Joe Gomes", "CS");
		//obj.addStudentToADepartment("Alison Becker", "MECH");
		
		obj.printStudentsBasedOnDepartment("CS");
		
		obj.addGrade("Virgil Van Dijk", 9.2);
		obj.addGrade("Alison Becker", 8.5);
		obj.addGrade("Andy Robertson", 8.8);
		obj.addGrade("Trent Alexander Arnold", 9.4);
		obj.addGrade("Joe Gomes", 8.2);
		
		obj.printDepartmentTopper("CS");
		obj.collegeTopper();
	}
}
