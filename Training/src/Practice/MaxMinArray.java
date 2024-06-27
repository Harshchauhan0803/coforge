package Practice;
import java.util.*;

public class MaxMinArray {
	
	static int[] display(int arr[]) {
		int max=0;
		int min=arr[0];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int result[]= {max,min,sum};
		
		return result;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=0;
	int[] a
	
	
	
	
	r=new int[10];
	while(n<10) {
		arr[n]=sc.nextInt();
		n++;
	}
	
		System.out.println("your array is : "+ Arrays.toString(arr));
		display(arr);
}
}
