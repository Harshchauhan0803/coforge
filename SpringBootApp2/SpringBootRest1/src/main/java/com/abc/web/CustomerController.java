package com.abc.web;

import com.abc.model.Customer;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@RestController
public class CustomerController {

    //@RequestMapping("/")

    @GetMapping("/")
    public String hello(){
        return "<h1>Hello world</h1>";
    }
    static List<Customer> customerList;
    static{
        customerList=new ArrayList<>();
        customerList.add(new Customer(1001,"ram kumar", LocalDate.of(1997,11,30)));
        customerList.add(new Customer(1002,"shyam kumar", LocalDate.of(1998,9,20)));
        customerList.add(new Customer(1003,"ramu kumar", LocalDate.of(1987,10,12)));
        customerList.add(new Customer(1004,"raj kumar", LocalDate.of(1977,8,11)));
        customerList.add(new Customer(1005,"rakesh kumar", LocalDate.of(1976,12,15)));
    }

    @GetMapping("/allcustomer")
    public List<Customer> getAllCustomer(){
        return customerList;
    }

    @GetMapping("/allcustomer/{id}")
    public Customer searchCustomer(@PathVariable("id") int id){
        return customerList.stream().filter(a -> a.getId()==id).findFirst().get();
    }

    @PostMapping("/allcustomer")
    public Customer addCustomer(@RequestBody Customer customer){
customerList.add(customer);
        return customer;

    }

}









