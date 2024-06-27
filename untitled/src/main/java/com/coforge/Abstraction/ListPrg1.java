package com.coforge.Abstraction;

import java.util.*;

public class ListPrg1 {
    public static void main(String[] args) {
        List l1=new ArrayList();
        l1.add(100001);
        l1.add(6800);
        l1.add("Hello world");
        l1.add(new Employee(101,"harsh",50000));
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));
        System.out.println(l1.get(3));

    }
}
