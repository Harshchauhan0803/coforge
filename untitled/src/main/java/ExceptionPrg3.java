import java.util.Scanner;

public class ExceptionPrg3 {

    public static void main(String[] args) {
        System.out.println("program starts");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            System.out.println("arthematic exception in "+a/b);
        }catch(ArithmeticException e){
            System.out.println();

        }
    }
}
