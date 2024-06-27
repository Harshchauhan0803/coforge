
public class StudentDetails {
private int studentid;
private String studentName,studentAddress,collegeName;
public int getStudentid() {
	return studentid;
}
public String getStudentName() {
	return studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public String getCollegeName() {
	return collegeName;
}
public StudentDetails(int studentid, String studentName, String studentAddress, String collegeName) {
	
	this.studentid = studentid;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
	this.collegeName = collegeName;
}
public StudentDetails(int studentid, String studentName, String studentAddress) {
	this(studentid,studentName,studentAddress,"NIT");
	this.studentid = studentid;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
}





}
