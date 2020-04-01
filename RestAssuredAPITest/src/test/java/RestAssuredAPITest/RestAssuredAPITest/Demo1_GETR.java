package RestAssuredAPITest.RestAssuredAPITest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1_GETR {

	

	
	@SuppressWarnings("unchecked")
	@Test
	void getbagyo()
	{
		
		/*
			
		RestAssured.baseURI = System.getProperty("https://project-x-dev.ekulus.com/api/user/by_verification_token/:token");
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("sam@xmail.com");
		authScheme.setPassword("aaaEEE!!");
		
		RestAssured.authentication = authScheme;
		
		RequestSpecification response = RestAssured.given();
		
		
		Response res = response.request(Method.GET,"/");
		response.headers("Authorization", "Bearer " + "37AA438751C54E76843D2C2837425EC3", "Content-Type",
			              ContentType.JSON,
			              "Accept",
			              ContentType.JSON)
			          .when()
			          .get("https://project-x-dev.ekulus.com/api/user/by_verification_token/:token")
			          .then()
			          .contentType(ContentType.JSON)
			          .extract()
			          .response();
		
		String d = res.getBody().asString();
		System.out.println(d);
		
*/
		
			Response resp = RestAssured.
			given()
			.header("Authorization","ContentType","application/json")
			.auth()
			.oauth2("37AA438751C54E76843D2C2837425EC3")
			.get("https://project-x-dev.ekulus.com/api/user/by_verification_token/:token");
			
			System.out.println(resp.getStatusCode());
			String g=resp.getBody().asString();
			System.out.println(g);

		
	} 
	
	
	

}
