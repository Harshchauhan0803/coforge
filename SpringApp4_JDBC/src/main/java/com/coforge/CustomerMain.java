package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.coforge.config.JdbcConfig;
import com.coforge.dao.CustomerDao;
import com.coforge.dao.CustomerDaoImpl;
import com.coforge.model.Customer;

public class CustomerMain {
	
 public static void main(String[] args) {
	 
 ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
 CustomerDao dao = ctx.getBean(CustomerDaoImpl.class);
 Customer customer = new Customer();
 
 customer.setId(100003);
 customer.setName(" Amit kumar");
 customer.setSalary(40000);
 Customer saveCustomer = dao.saveCustomer(customer);
 
 if (customer != null) {
 System.out.println(customer + "\n\n Added");
 }
 else
 System.out.println("some error ");

 dao.getAllCustomer().forEach(a->System.out.println(a));
 }

}















