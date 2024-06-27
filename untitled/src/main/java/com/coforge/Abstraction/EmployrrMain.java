package com.coforge.Abstraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortById implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        if (o1.getEmpId()>o2.getEmpId())
            return 1;
        else if(o1.getEmpId()<o2.getEmpId())
            return -1;
        else
            return 0;
    }
}

public class EmployrrMain {
    public static void main(String[] args) {
        int id[] = {10003, 10001, 10002};
        String nm[] = {"suresh", "ramesh", "pawan"};
        float sal[] = {350000, 12000, 45000};
        ArrayList<Employee2> empList = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            empList.add(new Employee2(id[i], nm[i], sal[i]));
        }
        System.out.println("all employees ");
        for (Employee2 emp : empList)
        System.out.println(emp);
        Collections.sort(empList,new SortById());
        System.out.println("after sorting all employees ");
        for(Employee2 emp:empList)
            System.out.println(emp);
    }
}
