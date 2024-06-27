
package com.coforge.model;



public class SingletonUserTest {

 public static void main(String[] args) {

  User user1 =User.getUser();

  user1.setUserid(10);

  user1.setUserName("gurman");

  User user2 =User.getUser();

  user1.setUserid(101);

  user1.setUserName("Harsh");

  System.out.println("user1 info");

  System.out.println("\t Id"+user1.getUserid());

  System.out.println("\tName"+user1.getUserName());

  System.out.println("user2 info");

  System.out.println("\tid"+user2.getUserid());

  System.out.println("\t Name"+user2.getUserName());

 }

}

