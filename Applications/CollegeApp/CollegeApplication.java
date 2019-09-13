package CollegeApp;

//Interface to declare all the methods
public interface CollegeApplication {
	public void addStudent(Student student);
	public void createDepartment(Department department);
	public void addStudentToADepartment(String studName,String deptName);
	public void printAllStudents();
	public void printStudentsBasedOnDepartment(String deptName);
	public void printDepartmentTopper(String deptName);
	public void collegeTopper();
}
