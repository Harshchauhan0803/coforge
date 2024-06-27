import java.util.Iterator;

public class StringExample5 {
public static void main(String[] args) {
	String var="we are learning java. with java";
	if(var.contains("java")){
		System.out.println("java present at "+var.indexOf("java"));
		System.out.println("java present at "+var.lastIndexOf("java"));

	}
	System.out.println("e present at "+ var.indexOf('e'));
	
	
	String ar[]=var.split(" ");
	System.out.println("no of words are "+ar.length);
for (String s:ar) {
	System.out.println(s);
}
	

}
}
