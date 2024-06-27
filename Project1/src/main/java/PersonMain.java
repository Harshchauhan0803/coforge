
public class PersonMain {
public static void main(String[] args) {
	Address address=new Address(899,"aagra","up");
	Person person=new Person(1,"Harsh",45,address);
	System.out.println("Person data ");
	System.out.println("\tid "+person.getPersonId());
	System.out.println("\tname "+person.getPersonName());
	System.out.println("\tage "+person.getPersonAge());
	System.out.println("\taddress "+person.getAddress().getAddrState());

}
}
