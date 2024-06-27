package Practice;

import java.util.Iterator;

public class Matrix {
	static void display(int ar[][]) {
		System.out.println("using for loop");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[0].length;j++) {
				System.out.print(ar[i][j]+" , ");
			}	
			System.out.println();
		}
	}
	static void display1(int ar[][]) {
		System.out.println("using for each loop");
		for(int[] is: ar) {
			for(int is2 : is) {
				System.out.print(is2+" , ");
				
			}
			System.out.println();
		}
	}
	
	static int[][] sum(int ar[][],int ar1[][]){
		int ar3[][]=new int[ar.length][ar[0].length];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar3[i][j]=ar[i][j]+ar1[i][j];
			}
			
		}
		return ar3;
	}

	public static void main(String[] args) {
		int arr[][]= {
				{1,2,3,4}, 
				{5,6,7,8},
				{9,6,8,5}
		};
		int arr1[][]= {
				{1,4,3,9},
				{5,6,7,8},
				{9,6,8,5}
		};
		System.out.println("no. of rows "+ arr.length);
		System.out.println("no. of rows "+ arr[0].length);
		display(arr);
		display(arr1);
		display(sum(arr,arr1));
	}
}