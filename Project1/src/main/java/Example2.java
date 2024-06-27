
public class Example2 {
public static void main(String[] args) {
//	String s1="hello";
//	String concat=" world";
//	concat=s1.concat(concat);
//	System.out.println(concat);


StringBuffer buffer=new StringBuffer("welcome");
System.out.println(buffer);
buffer.append("to java");
System.out.println(buffer);
buffer.delete(2, 5);
System.out.println(buffer);
buffer.reverse();
System.out.println(buffer);

String s1="hello";
s1.replace('e', 'z');
System.out.println(s1);


}
}

