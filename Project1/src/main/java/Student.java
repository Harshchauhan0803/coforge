
public class Student {
int rollno;
String name,subject;
void study() {
	System.out.println("Bhai 9 se 2 padhta h ");
}
public static void main(String[] args) {
	Student student1=new Student();

	student1.name="ram";
	student1.rollno=1234;
	student1.subject="Maths";
	System.out.println(student1.name);
	System.out.println(student1.rollno);
	System.out.println(student1.subject);
	student1.study();
}
}
