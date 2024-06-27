package com.coforge.main;



import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

import com.coforge.model.Employee;
import com.coforge.util.MySessionFactory;

import java.util.List;

public class EmployeeMain {

public static void main(String[] args) {

// Configuration configuration=new Configuration();
// configuration.configure();
//
 SessionFactory factory=MySessionFactory.getSessionFactory();
Session session=factory.openSession();
 
 Transaction transaction=session.getTransaction();

 Employee employee=new Employee();
 employee.setId(1002);
 employee.setName("Amit Kumar");
 employee.setSalary(20000);

 transaction.begin();
 session.save(employee);
 transaction.commit();

 Query query =session.createQuery("from Employee");
 List<Employee> resultList =(List) query.getResultList();
 
 for(Employee emp1:resultList)
 System.out.println(emp1.getId()+"\t"+emp1.getName()+"\t"+emp1.getSalary());
 session.close();

}
}