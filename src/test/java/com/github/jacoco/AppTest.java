package com.github.jacoco;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest 
{
 
	App app = new App();
	
	@Test
	public void testAppHealth() throws ClientProtocolException, IOException {
		String apiUrl = "http://192.168.40.138:8080/simplerestapp/v1/base/healthCheck";
		String response = null;
		response = app.httpClientTest(apiUrl);
		Assert.assertEquals(response, "{\"isAlive\":true}");
	}
	
	@Test
	public void testAllUsers() throws ClientProtocolException, IOException {
		String apiUrl = "http://192.168.40.138:8080/simplerestapp/v1/accounts/all";
		String response = null;
		response = app.httpClientTest(apiUrl);
		Assert.assertEquals(response, "[{\"id\":1,\"name\":\"Ramu\",\"age\":24},{\"id\":2,\"name\":\"Suresh\",\"age\":38}]");
	}
	
}
