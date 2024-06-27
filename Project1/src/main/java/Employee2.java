
public class Employee2 {
private int empId;
private String empName;
private double salary,netsalary;

public void calNetSalary(int pfpercentage) {
	setNetsalary(getSalary()-getNetsalary()*pfpercentage/100);
}




public int getEmpId() {
	return empId;
}
public String getEmpName() {
	return empName;
}
public double getSalary() {
	return salary;
}
public double getNetsalary() {
	return netsalary;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public void setNetsalary(double netsalary) {
	this.netsalary = netsalary;
}

}
