package com.coforge.Abstraction;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class SetPrg1 {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        set1.add("delhi");
        set1.add("kolkota");
        set1.add("chennai");
        set1.add("jaipur");
        set1.add("delhi");
        System.out.println(set1);
        System.out.println("using for each loop");
        for (String s : set1) {
            System.out.println(s + ", ");
        }
        System.out.println("\n using iterator");
        Iterator<String> iterator=set1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}