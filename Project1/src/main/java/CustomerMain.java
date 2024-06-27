import java.util.Iterator;

public class CustomerMain {
public static void main(String[] args) {
	int id1[]= {10001,10002,10003};
	String nm[]= {"harsh","akash","gurman"};
	float sal[]= {34000,30000,30000};
	Customer customer[]=new Customer[3];
    for (int i = 0; i < customer.length; i++) {
		customer[i]=new Customer();
		customer[i].id=id1[i];
		customer[i].name=nm[i];
		customer[i].salary=sal[i];	
	}
    for (Customer c : customer) {
		c.customerInfo();
	}
	
	
//	customer[0]=new Customer();
//	customer[0].id=10001;
//	customer[0].name="harsh chauhan";
//	customer[0].salary=20000;
	
}
}
