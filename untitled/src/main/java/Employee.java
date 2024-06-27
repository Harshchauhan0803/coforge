public class Employee {
    int id;
    String name;
    float salary;

    void employeeInfo(){
        System.out.println("employee Information");
        System.out.println("\tid "+id);
        System.out.println("\tname "+name);
        System.out.println("\tsalary "+salary);

    }
}
class Manager extends Employee{
String location; void main(String[] args) {
int age;
Manager manager=new Manager();
        manager.id=101;
        manager.name="naman";
        manager.salary=90000;
        manager.employeeInfo();
    }
}