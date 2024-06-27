package com.abc;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.abc.config.AppConfig1;
import com.abc.dao.ProductDao;
import com.abc.dao.ProductDaoImpl1;
import com.abc.model.Product;

public class ProductMain1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig1.class);
		ProductDao dao = applicationContext.getBean(ProductDao.class);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Add record Operation");
		System.out.println("Enter book name and cost");
		Product product = new Product();

		product.setBname(scanner.nextLine());
		product.setCost(scanner.nextFloat());
		Product product2 = dao.addProduct(product);

		if (product2 != null)
			System.out.println("Product Added is \n" + product2);

		else
			System.out.println("Some Error");

		System.out.println("\nSearch Record Operation");
		System.out.println("Enter product id");

		Product searchProduct = dao.searchProduct(scanner.nextLong());

		if (searchProduct == null)
			System.out.println("product not found with given id");

		else
			System.out.println("product found eith id\n" + searchProduct);

		System.out.println("\nShow all record operation ");

		dao.getAllProduct().forEach(a -> System.out.println(a));

	}

}