
public class Product {
	int prdid;
	String prdname;
	float prdcost;
	
public Product() {
	prdid=1001;
	prdname="shirt";
	prdcost=700;
	System.out.println("default constructor called");
}





public Product(int prdid, String prdname, float prdcost) {
	
	this.prdid = prdid;
	this.prdname = prdname;
	this.prdcost = prdcost;
	System.out.println("overloaded constructor1");
}
public Product(int prdid, float prdcost) {
	this(prdid,"television",60000);
	this.prdid = prdid;
	
	this.prdcost = prdcost;
	System.out.println("overloaded constructor2");
}






void productInfo() {
	System.out.println("\n product data");
	System.out.println("\tid : "+prdid);
	System.out.println("\tname : "+prdname);
	System.out.println("\tcost : "+prdcost);

}
public static void main(String[] args) {
	Product p1=new Product();
	Product p2=new Product();

	Product p3=new Product();
	
	p1.productInfo();
	p2.productInfo();
	p3.productInfo();


	
}
}
