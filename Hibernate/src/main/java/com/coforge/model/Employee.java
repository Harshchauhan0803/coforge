package com.coforge.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "emp1")
@Getter
@Setter
@ToString

@NamedQuery(name="")

public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "emp_id")
	private int id;
	private LocalDate dob;

	private String name;

	private float salary;

	 
}
