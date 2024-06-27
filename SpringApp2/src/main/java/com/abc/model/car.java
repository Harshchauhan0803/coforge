package com.abc.model;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class car {
private long regNo;
private String model;
private float cost;

@PostConstruct
public void start() {
	System.out.println(getClass().getSimpleName()+" init called");

	this.regNo=785465709;
	this.model="celerio";
	this.cost=670000;
	
	
}
}
