package JavaConcepts;
import java.util.Arrays;
import java.util.Comparator;
public class ComparableAndComparatorInterfaces {
	
	public static class Employee implements Comparable<Employee>{
		int empID;
		String empName;
		int age;
		int salary;
		
		Employee(int empID,String empName,int age,int salary){
			this.empID = empID;
			this.empName = empName;
			this.age = age;
			this.salary = salary;
		}
		
		public String getEmpName(){
			return this.empName;
		}
		
		public int getEmpSalary(){
			return this.salary;
		}
		
		public int getAge(){
			return this.age;
		}
		
		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return (this.empID - o.empID);
		}
		
		
		
		@Override
		public String toString(){
			return "[id=" + this.empID + " name=" + this.empName + " age=" + this.age + " salary=" + this.salary + "]";
		}
	}
	
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2){
			return e1.getEmpName().compareTo(e2.getEmpName());
		}
	};

	
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2){
			return (e1.getEmpSalary() - e2.getEmpSalary());
		}
	};
	
	
	public static Comparator<Employee> AgeComparator = new Comparator<Employee>(){

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getAge()-e2.getAge();
		}
	};
	
	public static void main(String[] args){
		//Employee e = new Employee(1,"abc",20,3000);
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee(1,"ABC",20,30000);
		empArr[1] = new Employee(2,"XYZ",25,45000);
		empArr[2] = new Employee(3,"MNO",21,20000);
		Arrays.sort(empArr);
		System.out.println("Employees list sorted by EmpID: "+Arrays.toString(empArr));
		
		Arrays.sort(empArr,SalaryComparator);
		System.out.println("Employees list sorted by Salary: "+Arrays.toString(empArr));
		
		Arrays.sort(empArr,AgeComparator);
		System.out.println("Employees list sorted by Age: "+Arrays.toString(empArr));
		
	}

}

