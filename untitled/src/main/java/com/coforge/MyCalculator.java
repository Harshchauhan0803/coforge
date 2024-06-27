package com.coforge;

import java.util.Scanner;

import static java.lang.Math.pow;

public class MyCalculator {
    long power(int a,int b){

        if(a<0||b<0){
            throw new RuntimeException("a or b should not be negative");
        }
        if(a==0 && b==0){
            throw new RuntimeException("a and b should not be 0");
        }
        long c= ((long)Math.pow(a, b));
        return c;
    }
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter value of a : ");
            int a=sc.nextInt();
            System.out.println("enter value of b : ");
            int b=sc.nextInt();
            MyCalculator calc=new MyCalculator();
            System.out.println(calc.power(a,b));



        }catch(ArithmeticException e){
            System.err.println(e);
        }

    }
}
