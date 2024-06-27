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
 
Query namedQuery=session.createNamedQuery("allemp");


