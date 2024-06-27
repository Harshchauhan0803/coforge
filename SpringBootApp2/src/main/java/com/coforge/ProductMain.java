package com.coforge;

import com.coforge.dao.ProductDao;
import com.coforge.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Optional;
import java.util.Scanner;
@SpringBootApplication
public class ProductMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ProductMain.class, args);
        ProductDao dao = ctx.getBean(ProductDao.class);
        Product product = new Product();
        product.setName("book");
        product.setCost(1200);
        dao.save(product);
        System.out.println("aLL products are");
        dao.findAll().forEach(a-> System.out.println(a));
        System.out.println("search product");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the product id");
        int id=sc.nextInt();
        Optional<Product> byId =dao.findById(id);
        if(byId.isPresent())
            System.out.println("found with id " +id +" is " +byId.get());
        else
            System.out.println("not found " + id);

    }

}



