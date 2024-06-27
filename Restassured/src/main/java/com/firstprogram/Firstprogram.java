package com.firstprogram;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Firstprogram {
	@Test
    public void test1() {
        Response res =RestAssured.get("http://www.google.com");
        System.out.println(res.asPrettyString());
        int StatusCode = res.getStatusCode();
        Assert.assertEquals(StatusCode, 200);
        
    }

	@Test
    public void test2() {
        Response res =RestAssured.get("http://www.reqres.in");
        int StatusCode = res.getStatusCode();
        Assert.assertEquals(StatusCode, 404);
        
    }
	
	@Test
    public void test3() {
        Response res =RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
        System.out.println(res.asPrettyString());
        int StatusCode = res.getStatusCode();
        Assert.assertEquals(StatusCode, 200);
        
    }



	@Test
    public void test4() {
        Response response = given().redirects().follow(true).get("http://www.google.com");
        System.out.println(response.asPrettyString());
        int StatusCode = response.getStatusCode();
        Assert.assertEquals(StatusCode, 200);
        
    }
	
	@Test
	public void test5() {
		Response response = RestAssured.get("https://reqres.in/api/users/2");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.statusLine());

        int statusCode = response.getStatusCode();
        
       
     
         
         Assert.assertEquals(response.jsonPath().getInt("data.id"), 2);
         Assert.assertEquals(response.jsonPath().getString("data.first_name"), "Janet");
	}
	
	@Test
	public void test6() {
	
	 RestAssured.baseURI = "https://reqres.in";
     
     // Get the RequestSpecification of the request that you want to sent
     // to the server. The server is specified by the BaseURI that we have
     // specified in the above step.
     RequestSpecification httpRequest = RestAssured.given();
     
     // Make a request to the server by specifying the method Type and the method URL.
     // This will return the Response from the server. Store the response in a variable.
     Response response = httpRequest.request(Method.GET, "/api/users/2");
    
    System.out.println(response.statusCode());
    System.out.println(response.asString());
    System.out.println(response.getHeaders());
    String conn = response.getHeader("Connection");
    
    System.out.println(response.getBody().asString());
    System.out.println(response.statusLine());

    int statusCode = response.getStatusCode();
    
   
 
     
     Assert.assertEquals(response.jsonPath().getInt("data.id"), 2);
     Assert.assertEquals(response.jsonPath().getString("data.first_name"), "Janet");
	}

}
