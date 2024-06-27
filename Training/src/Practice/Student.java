package Practice;
import java.util.*;
public class Student {
	static String calculateGrade(int m1,int m2,int m3,int avg) {
		
		if(avg>=75 && avg<=100) {
			return "distinction";
		}
		if(avg>=60 && avg<=74) {
			return "first"; 
		 
		}
		if(avg>=50 && avg<=59) {
			return "second"; 
			
		}
		if(avg>=35 && avg<=49) {
			return "third"; 
			
		}
		if(avg>=0 && avg<=34) {
		 return "fail"; 
			
		}
		return null;
	}
	
	static void display(String name,int rollno,int m1,int m2,int m3,String s1,String s2,String s3,int avg,String grade) {
		System.out.println("Your name is " +name);
		System.out.println("Your Roll no. is " +rollno);
		System.out.println("Your Marks is " +m1);
		System.out.println("Your Marks is "+m2);
		System.out.println("Your Marks is "+m3);
		System.out.println("Your subject 1 is "+s1);
		System.out.println("Your subject 2 is "+s2);
		System.out.println("Your subject 3 is "+s3);
		System.out.println("Your grade is "+grade);
		System.out.println("Your average Marks is "+avg);
	}

public static void main(String args[]) {
	int rollno,m1,m2,m3,avg;
	String grade;
	String name,s1,s2,s3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your roll no.");
	rollno=sc.nextInt();
	System.out.println("Enter your Name");
	sc.nextLine();
	name=sc.nextLine();
	System.out.println("Enter your subject 1");
	s1=sc.next();
	System.out.println("Enter your subject 2");
	s2=sc.next();
	System.out.println("Enter your subject 3");
	s3=sc.next();
	System.out.println("Enter your marks of subject 1");
	m1=sc.nextInt();
	System.out.println("Enter your marks of subject 2");
	m2=sc.nextInt();
	System.out.println("Enter your marks of subject 3");
	m3=sc.nextInt();
	avg=(m1+m2+m3)/3;
	grade=calculateGrade(m1,m2,m3,avg);
	display(name,rollno,m1,m2,m3,s1,s2,s3,avg,grade);
}
}
