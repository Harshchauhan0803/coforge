package Practice;
import java.util.*;
public class CheckPrime {
static boolean isPrime(int n) {
	int c=2;
	if(n==2)
		return true;
	do {
		if(n%c==0)
			return false;
		c++;
	}while(c<=n-1);
	return true;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println(isPrime(a));
}

}
