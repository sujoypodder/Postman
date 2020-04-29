package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetData {
	/*
	 * @Test public void testResponsecode() { Response res = RestAssured.get(
	 * "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02"
	 * ); int code = res.getStatusCode(); System.out.println("status code is " +
	 * code); Assert.assertEquals(code, 200); }
	 * 
	 * @Test public void testbody() { Response res = RestAssured.get(
	 * "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02"
	 * ); String data = res.asString(); System.out.println("data is " + data);
	 * System.out.println("response time is " + res.getTime()); }
	 */
	@Test
	public void testResponsecode() {
		int code = get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02")
						.getStatusCode();
		System.out.println("status code is " + code);
		Assert.assertEquals(code, 200);
	}

	@Test
	public void testbody() {
		String data = get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02")
						.asString();
		System.out.println("data is " + data);
		long time = get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02")
						.getTime();
		System.out.println("response time is " + time);
	}

}
