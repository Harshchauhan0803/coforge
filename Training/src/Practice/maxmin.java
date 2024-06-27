package Practice;
import java.util.*;
public class maxmin {

public static void main(String args[]) {
	int max=0;
	int min=0;
	int sum=0,n=0;
	int count=1;
Scanner sc=new Scanner(System.in);
while(count<=10) {
System.out.println("Enter no.");
n=sc.nextInt();
if(count==1) {
	max=min=n;
}
else if(n>=max) {
	max=n;
}
else if(n<=min) {
	min=n;
}
sum=sum+n;
count++;
}
System.out.println("max is "+max);
System.out.println("min is "+min);




}
}