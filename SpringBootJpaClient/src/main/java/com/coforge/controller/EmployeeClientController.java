package com.coforge.controller;
import com.coforge.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

public class EmployeeClientController {
    RestTemplate restTemplate =new RestTemplate();

    @GetMapping("/all")
    public List<Employee> showAllemployee(){
        return Arrays.asList(restTemplate.getForObject("http://localhost:9090/allEmployee",Employee[].class));
    }
}