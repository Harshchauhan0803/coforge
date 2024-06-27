package Practice;

public class Alphabet {
static void capitalAlphabet(){
	int x=65;
	while(x<=90) {
		System.out.print(x+ " -- "+(char) x +",  ");
		x++;
		if(x%5==0) {
			System.out.println();
		}
	}
}
static void smallAlphabet(){
	int x=97;
	while(x<=122) {
		System.out.print(x+ " -- "+(char) x +",  ");
		x++;
		if(x%5==0) {
			System.out.println();
		}
	}
}
public static void main(String args[]) {
	capitalAlphabet();
	System.out.println();
	 smallAlphabet();
}
}
