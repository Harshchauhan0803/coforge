package Practice;
import java.util.*;
public class InterestCalc {
	static float calc() {
		Scanner sc=new Scanner (System.in);
	float amt,rate,time;
	do {
		System.out.println("Enter amount >=0");
		amt=sc.nextFloat();
	}while(amt<=0);
	do {
		System.out.println("Enter rate >=0");
		rate=sc.nextFloat();
	}while(rate<=0);

	do {
		System.out.println("Enter time >=0");
		time=sc.nextFloat();
	}while(time<=0);
	
	return(amt*rate*time)/100.0f;
	}
	public static void main(String[] args) {
		System.out.println("interest is " + calc());
		
System.out.println("kamao     ");
	}
	
}
