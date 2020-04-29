package getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutData {

	@Test
	public void test() {
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("firstname", "abel bro");
		json.put("lastname", "baker bro");
		json.put("subjectid", "1");
		json.put("id", "4");
		req.body(json.toJSONString());
		Response res = req.put("http://localhost:3000/users/4");
		int code = res.getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println("put means update and update user 4 data");
	}

}
