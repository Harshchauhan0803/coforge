
public class Person {
private long personId;
private String personName;
private int personAge;
private  Address address;
public Person(long personId, String personName, int personAge, Address address) {
	this.personId = personId;
	this.personName = personName;
	this.personAge = personAge;
	this.address = address;
}
public long getPersonId() {
	return personId;
}
public String getPersonName() {
	return personName;
}
public int getPersonAge() {
	return personAge;
}
public Address getAddress() {
	return address;
}


}
