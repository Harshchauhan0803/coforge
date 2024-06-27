package com.coforge.Abstraction;

public interface Calculation1 {
//    void addition(int a,int b);
      int addition(int a,int b);
//    void subtraction(int a,int b);
}

//class outer1 {
//    private Calculation1 calc = new Calculation1() {
//        int p;
//
//        @Override
//        public void addition(int a, int b) {
//            System.out.println("Addition is " + (a + b));
//        }
//
//        @Override
//        public void subtraction(int a, int b) {
//            System.out.println("Subtraction is " + (a - b));
//        }
//    };
//
//    public static void main(String[] args) {
//        outer1 outer = new outer1();
//        outer.calc.addition(11, 22);
//        outer.calc.subtraction(110, 22);
//    }
//}




class outer {
    public static void main(String[] args) {
        Calculation1 addition1=(x,y)->x+y;
        System.out.println(addition1.addition(1,2));
    }
}