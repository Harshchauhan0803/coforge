
public class BookMain {
public static void main(String[] args) {
	
	Book book1=new Book();
	book1.setIsbn(63545);
	book1.setBname("Harry potter 1");
	book1.setAuthor("JK rollins");
	book1.setCost(500);
	
	Book book2=new Book();
	book2.setIsbn(635489);
	book2.setBname("Harry potter 2");
	book2.setAuthor("JK rollins");
	book2.setCost(700);
	
	Book book3=new Book();
	book3.setIsbn(6354597);
	book3.setBname("Harry potter 3");
	book3.setAuthor("JK rollins");
	book3.setCost(800);
	
	System.out.println(book1.getIsbn());
	System.out.println(book2.getIsbn());
	System.out.println(book3.getIsbn());

}
}
