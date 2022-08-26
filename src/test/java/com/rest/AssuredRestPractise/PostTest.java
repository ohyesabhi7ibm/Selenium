package com.rest.AssuredRestPractise;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

//import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class PostTest {
	
	
	@Test
	public void postTest1()
	{
		JSONObject request=new JSONObject();
		request.put("name", "Abhi");
		request.put("job", "Engineer");
		
		given().
			body(request.toJSONString()).
				when().post("https://reqres.in/api/users").
					then().statusCode(201);
	}
}
