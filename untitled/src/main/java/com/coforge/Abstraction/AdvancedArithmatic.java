package com.coforge.Abstraction;

import java.util.Scanner;


public interface AdvancedArithmatic {
    int divisor_sum(int n);

}
class MyCalculator implements AdvancedArithmatic{


    @Override
    public int divisor_sum(int n) {

        if (n > 1000) {
            return -1;
        }
        else {

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
            return sum;
        }

    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            AdvancedArithmatic a = new MyCalculator();
            System.out.println("enter the no. ");
            int n = sc.nextInt();
            System.out.println(a.getClass().getInterfaces()[0].getSimpleName());
            System.out.println(a.divisor_sum(n));
        }

    }

