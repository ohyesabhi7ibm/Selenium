package com.rest.AssuredRestPractise;


import org.testng.annotations.Test;

//import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
/**
 * Unit test for simple App.
 */
public class GetTest 
{
//	@Test
//	public void test1()
//	{
//		Response res=get("http://reqres.in/api/users?page=2");
//		System.out.println("status code is "+res.getStatusCode());
//		System.out.println("res as string is"+res.asString());
//		System.out.println("res is "+res);
//		System.out.println("res body is"+res.getBody().asString());
//		System.out.println("status line is"+res.getStatusLine());
//		System.out.println("res time "+res.getTime());
//		System.out.println("res header "+res.getHeader("content-type"));
//	}
	
	@Test
	public void test2()
	{
		System.out.println("=================================================");
		given()
			.get("http://reqres.in/api/users?page=2")
		.then()
			.statusCode(200).body("data.id[0]",equalTo(7));
	}
	
	@Test
	public void test3()
	{
		System.out.println("=================================================");
		given()
			.get("http://reqres.in/api/users?page=2")
		.then()
			.statusCode(200).body( "data.id", hasItem(10));
	}
}
