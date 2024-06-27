package Practice;
import java.util.*;
public class table {
static void tabledisplay(int a) {
	int c=1;
	do {
		System.out.println(a+"*"+c+"="+(a*c));
		c++;
	}while(c<=10);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. ");
	int a=sc.nextInt();
		tabledisplay(a);
	}
}

