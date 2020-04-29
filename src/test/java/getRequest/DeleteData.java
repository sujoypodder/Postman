
package getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteData {

	@Test
	public void test() {
		RequestSpecification req = RestAssured.given();
		Response res = req.delete("http://localhost:3000/users/4");
		int code = res.getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println("delete users 5 data from db.json");
	}

}
