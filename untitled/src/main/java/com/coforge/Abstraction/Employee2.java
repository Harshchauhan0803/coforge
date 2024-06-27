package com.coforge.Abstraction;

public class Employee2 {
    private int empId;
    private String empName;
    private float empSalary;

    public Employee2(int empId, String empName, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

}
