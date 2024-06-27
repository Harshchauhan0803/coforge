package com.coforge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");

        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<=0||b<=0)
                throw new InputMismatchException();
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.err.println(e);
        }
        catch(InputMismatchException e){

            System.err.println(e);
        }
    }
}
