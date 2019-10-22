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
		String apiUrl = "http://localhost:8080/simplerestapp/v1/base/healthCheck";
		String response = null;
		response = app.httpClientTest(apiUrl);
		Assert.assertEquals(response, "{\"isAlive\":true}");
	}
	
}
