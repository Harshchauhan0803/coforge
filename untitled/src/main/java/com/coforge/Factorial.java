package com.coforge;

import java.util.Scanner;

public class Factorial {
    Scanner sc=new Scanner(System.in);
    long getFactorial(){
        System.out.println("enter no. :");
        int p=sc.nextInt();
        if(p<=0){
            throw new RuntimeException("invalid no. ");

        }else{
            long fact=1;
            for (int i=1;i<=p;i++){
                fact=fact*1;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        System.out.println("Program starts ");
        System.out.println("factorial is "+new Factorial().getFactorial());
        System.out.println("program ends");
    }

}


class Factorial2 {
    Scanner sc = new Scanner(System.in);

    long getFactorial() throws Exception {
        System.out.println("enter no. :");
        int p = sc.nextInt();
        if (p <= 0) {
            throw new RuntimeException("invalid no. ");

        } else {
            long fact = 1;
            for (int i = 1; i <= p; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

        public static void main (String[]args){
            try {
                System.out.println("Program starts ");
                System.out.println("factorial is " + new Factorial2().getFactorial());
                System.out.println("program ends");
            } catch (Exception e) {
                System.out.println("catch exception is thrown " + e);
            }
        }}

class Factorial3{
    Scanner sc=new Scanner(System.in);
    long getFactorial() throws Exception {
        System.out.println("enter no. :");
        int p = sc.nextInt();
        if (p <= 0) {
            try {
                throw new RuntimeException("Invalid No h Bhai ");

            } catch (Exception e) {
                System.out.println("catch method exception is thrown"+e.getMessage());
               throw e;
            }
        } else {
            long fact = 1;
            for (int i = 1; i <= p; i++) {
                fact = fact * i;
            }
            return fact;
        }
    //    return -1;
    }

            public static void main (String[]args) {
                try {
                    System.out.println("Program starts ");
                    System.out.println("factorial is " + new Factorial3().getFactorial());

                } catch (Exception e) {
                    System.out.println("catch main exception is thrown " + e.getMessage());
                }
                System.out.println("program ends");
            }}