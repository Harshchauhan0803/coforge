package Practice;

public class sumofdigits {
public static void main(String args[]) {
	int n=1221;
	int sum=0;
	int temp1=n;
	while(n>0) {
		int temp=n%10;
		sum=sum*10+temp;
		n=n/10;
	}
	System.out.println(sum);
	if(temp1==sum) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not plindrome");
	}
}
}
