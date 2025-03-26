package apiTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ParameterizedRequest {
	
	@Test
    public void queryParameter() {
		
	RestAssured.baseURI ="https://jsonplaceholder.typicode.com"; 
	RequestSpecification request = RestAssured.given();
	
	Response response = request.queryParam("userId", "1") 
			                   .get("/posts");
	
	String jsonString = response.asString();
	System.out.println(response.getStatusCode());
	
	String responseBody = response.getBody().asString();
	System.out.println("Response Body:"+ responseBody);
	}

}
