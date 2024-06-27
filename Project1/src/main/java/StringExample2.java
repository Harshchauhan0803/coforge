
public class StringExample2 {
	
	static boolean checkPalindrome2(String s) {
		char ar[]=new char[s.length()];
		int index=0;
		for(int i=s.length()-1;i>=0;i--) {
			ar[index++]=s.charAt(i);
		}
		return s.equals(new String(ar));
	}
	
	static boolean checkPalindrome3(String s) {
		char ar[]=new char[s.length()];
		char ar1[]=s.toCharArray();

		int index=0;
		for(int i=s.length()-1;i>=0;i--) {
			ar[index++]=ar1[i];
		}
		return s.equals(new String(ar));
	}
	
	
	static boolean checkPalindrome(String s1) {
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String s1="mam";
		boolean s5=checkPalindrome(s1);
		System.out.println(s5);
		boolean ss2=checkPalindrome2(s1);
		System.out.println(ss2);
		boolean ss3=checkPalindrome3(s1);
		System.out.println(ss3);
	}

}


