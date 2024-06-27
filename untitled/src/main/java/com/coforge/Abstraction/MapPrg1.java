package com.coforge.Abstraction;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPrg1 {
    public static void main(String[] args) {
        Map<Integer,String> empMap=new HashMap<>();
        empMap.put(1001,"Harsh chauhan");
        empMap.put(1002,"Beedibaz");
        empMap.put(1003,"Darubaaz");
        empMap.put(1004,"Babli Badmos");

        System.out.println("1001 is id of "+empMap.get(1001));
        System.out.println("1002 is id of "+empMap.get(1002));
        System.out.println("1003 is id of "+empMap.get(1003));
        System.out.println(empMap);
        Set<Integer>keys=empMap.keySet();
        for(Integer k:keys)

            System.out.println(k+"  -------  "+empMap.get(k));

        empMap.remove(1001);
        System.out.println(empMap.containsKey(1001));
        System.out.println(empMap.containsValue("harsh chauhan"));


    }
}
