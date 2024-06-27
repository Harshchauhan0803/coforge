
public class Employee {
private int empId;
private String empName;
private float empSalary;
private static String companyName="coforge";
static int count=0;
int c=0;
public Employee(int empId, String empName, float empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	count++;
	c++;
}
public static void main(String[] args) {
	
	Employee employee1=new Employee(100,"mittal",45000);
	Employee employee2=new Employee(100,"mittal",45000);
	Employee employee3=new Employee(100,"mittal",45000);

//	System.out.println("company name is :"+ companyName);
//	
//	System.out.println("id : "+employee.empId);
//	System.out.println("name is : "+employee.empName);
	System.out.println(count);
	System.out.println(employee1.c);
	System.out.println(employee2.c);
	

}
}
