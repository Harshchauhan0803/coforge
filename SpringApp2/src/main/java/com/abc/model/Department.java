package com.abc.model;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

//@AllArgsConstructor
@Getter
@ToString
@Lazy(value=true)
public class Department {
private long departmentId;
private String departmentName;
private String departmentLocation;
private int departmentTotalMember;

@PostConstruct
public void initDepartment() {
	System.out.println(getClass().getSimpleName()+" init called");
	this.departmentId=9888667;
	this.departmentName="software development";
	this.departmentLocation="Pune";
	this.departmentTotalMember=560;

}


}
