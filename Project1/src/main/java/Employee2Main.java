import java.util.*;
public class Employee2Main {
static Scanner sc=new Scanner(System.in);
public static Employee2 getEmployeeDetails() {
	Employee2 employee2=new Employee2();
	System.out.println("enter id ");
	employee2.setEmpId(sc.nextInt());
	System.out.println("enter name ");
	employee2.setEmpName(sc.next());
	System.out.println("enter salary ");
	employee2.setSalary(sc.nextDouble());
	return employee2;
}
public static int getPFPercentage() {
	System.out.println("Enter PF percentage: ");
	return sc.nextInt();
}
public static void main(String[] args) {
	Employee2 employee2=getEmployeeDetails();
	employee2.calNetSalary(getPFPercentage());
	System.out.println("id : "+employee2.getEmpId());
	System.out.println(employee2.getEmpName());
	System.out.println(employee2.getSalary());
	System.out.println(employee2.getNetsalary());
}


}
