import java.util.*;
public class StudentDetailsMain {
public static void main(String[] args) {
	int id;
	String name,address;
	System.out.println("type y/n if you belong to NIT college");
	Scanner sc=new Scanner(System.in);
	String c=sc.next();
	System.out.println("enter id");
	 id=sc.nextInt();
	 System.out.println("enter name");
	 name=sc.next();
	
	 System.out.println("enter address");
	 address=sc.next();
	 
	if(c.equals("y")) {
		
		 
		StudentDetails student1=new StudentDetails(id,name,address);
		System.out.println(student1.getStudentid());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getStudentAddress());
		System.out.println(student1.getCollegeName());
	}
	else {
		System.out.println("enter college name");
		String college=sc.next();
		StudentDetails student1=new StudentDetails(id,name,address,college);
		System.out.println(student1.getStudentid());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getStudentAddress());
		System.out.println(student1.getCollegeName());
	}
	
}
}
