package com.coforge.model;



public class User {

private int userid;

private String userName;

public int getUserid() {

 return userid;

}

public void setUserid(int userid) {

 this.userid = userid;

}

public String getUserName() {

 return userName;

}

public void setUserName(String userName) {

 this.userName = userName;

}

private User() {

}

static User user;

static User getUser()

{if (user== null)

 user =new User();


return user;

}

}









