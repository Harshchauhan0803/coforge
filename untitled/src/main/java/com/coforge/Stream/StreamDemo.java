package com.coforge.Stream;

import java.util.stream.Stream;
import java.util.*;
public class StreamDemo {
    public static void main(String[] args) {
        Integer ar[]={11,1,2,4,9,7,1,11};
        System.out.println("distict");
        Stream.of(ar).distinct().forEach(b-> System.out.println(b+", "));

        System.out.println("sorted and distinct");
        Stream.of(ar).sorted().distinct().forEach(b-> System.out.println(b+", "));

        System.out.println("\nmapping ");
        Stream.of(ar).map(a->a*a).forEach(b-> System.out.println(b+", "));

        List<Integer> list1=new ArrayList<Integer>();
        list1.add(1000);
        list1.add(10);
        list1.add(200);
        list1.add(1);
        list1.add(1000);

        System.out.println();
        list1.stream().sorted().distinct().forEach(b-> System.out.println(b+", "));

        System.out.println();
        list1.stream().filter(a-> a % 2 == 0).forEach(a-> System.out.println(a+", "));

    }
}
