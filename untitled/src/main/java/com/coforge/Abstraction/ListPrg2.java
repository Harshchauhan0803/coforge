package com.coforge.Abstraction;
import com.coforge.Abstraction.ListPrg1;
import java.util.*;
public class ListPrg2 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("java");
        list1.add("php");
        list1.add("java");
        list1.add("python");
        list1.add("angular");
        list1.add("react");
        System.out.println("unsorted"+ list1);
        Collections.sort(list1);
        System.out.println("sorted"+ list1);

        System.out.println("all elements using loop");
        for (int i = 0; i < list1.size() ; i++) {
            System.out.println(list1.get(i) + ", ");
        }
            System.out.println("\njava present in list "+list1.contains("java"));
            System.out.println("\n using for each");
            for(String s: list1) {
                System.out.println(s + ", ");
            }
            ArrayList<String> l2=new ArrayList<String>();
            l2.add("hindi");
            l2.add("english");
            l2.add("sanskrit");
            l2.add("tamil");
            list1.addAll(l2);
            System.out.println(list1);
            System.out.println(list1.containsAll(l2));
            list1.removeAll(l2);
            System.out.println(l2);
            LinkedList<Integer> l3=new LinkedList<>();
            l3.add(100);
            l3.add(101);

            l3.add(103);
            System.out.println(l3);

            l3.addFirst(105);
            l3.addLast(200);
            System.out.println(l3);

            l3.remove();
            l3.removeLast();
            System.out.println(l3);
            l3.clear();
            System.out.println(l3);
        }
    }

