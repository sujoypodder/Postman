package getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostData {

	@Test
	public void test() {
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("firstname", "abel");
		json.put("lastname", "baker");
		json.put("subjectid", "2");
		json.put("id", "4");
		req.body(json.toJSONString());
		Response res = req.post("http://localhost:3000/users");
		int code = res.getStatusCode();
		Assert.assertEquals(code, 201);
		System.out.println("post means create and create new user data");
	}

}
