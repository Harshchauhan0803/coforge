package com.coforge.web;



import com.coforge.dao.AddressRepository;

import com.coforge.dao.EmployeeRepository;

import com.coforge.model.Address;

import com.coforge.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {

    @Autowired

    EmployeeRepository employeeRepository;

    @Autowired

    AddressRepository AddressRepository;

    @GetMapping("/allEmployees")

    public List<Employee> getAllEmployee(){

        return employeeRepository.findAll();

    }

    @PostMapping("/allEmployees")

    public Employee addEmployee(@RequestBody Employee employee){

// AddressRepository.save(employee.getAddress());

        return employeeRepository.save(employee);

    }

    @GetMapping("/AllEmployees/{id}")

    public Employee searchEmployee(@PathVariable("id")int id){

        return employeeRepository.findById(id).get();

    }

    @GetMapping("/AllEmployees/aaddress/{addrid}")

    public Address searchAddress(@PathVariable("addrid")int addrid){

        return AddressRepository.findById(addrid).get();

    }

}







