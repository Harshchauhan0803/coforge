package com.coforge;

import java.util.Scanner;

public class Interestcalculation {
    float amt, rate;
    int time;
    Scanner sc=new Scanner(System.in);

//    public Interestcalculation() {
//
//    }

    float interest() {
        System.out.println("Enter amount");
        amt = sc.nextInt();
        if (amt <= 0)
            throw new RuntimeException("Invalid amount");
        System.out.println("Enter rate");
        rate = sc.nextFloat();
        if (rate <= 0)
            throw new RuntimeException("Invalid rate");
        System.out.println("Enter time");
        time = sc.nextInt();
        if (time <= 0)
            throw new RuntimeException("Invalid time");
        return amt*rate*time/100;
    }

    public static void main(String[] args) {
        Interestcalculation interestcalculation=new Interestcalculation();
        try{
            System.out.println("Interest is "+interestcalculation.interest());

        }catch(RuntimeException e){
            System.err.println(e.getMessage());
        }
    }

}
