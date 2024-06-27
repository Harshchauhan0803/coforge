package com.coforge;

import java.util.Scanner;

public class MyCalculator2 {


        long power(int a,int b) throws Exception{
            long res=1;
            if(a<0||b<0){
                throw new RuntimeException("a or b should not be negative");
            }
            if(a==0 && b==0){
                throw new RuntimeException("a and b should not be 0");
            }
            for(int i=1;i<=b;i++){
                res=res*a;
            }
            return res;
        }

    public static void main(String[] args) {
        MyCalculator2 myCalculator2=new MyCalculator2();
        new MyCalculator2();
        Scanner sc=new Scanner(System.in);
        int input[][]=new int[5][2];
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                input[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<5;i++){
            try {
                System.out.println(myCalculator2.power(input[i][0],input[i][1]));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    }

