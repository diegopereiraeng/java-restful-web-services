package com.diegokoala.rest.profile.restfulwebservices;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.net.UnknownHostException;

import java.net.InetAddress;


@SpringBootTest
class RestfulWebServicesApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void TestUtilsController() 
	{
		InetAddress inetAddress = InetAddress.getLocalHost();
        hostName = inetAddress.getHostName();
    	
		assertEquals(hostName, UtilsController.getHostName());
	}

	@Test
	public void ResumeController() 
	{
    	
		assertEquals("{ Message: 'Welcome to Harness, Your Deployment 1.1.2 was successful implemented', status: 'UP' }", UtilsController.GetHarness());
		assertEquals("{ Message: 'Welcome to Harness, Your Deployment demo example for app: Java App was successful implemented', status: 'UP' }", UtilsController.SetDeployment("demo example","Java App"));
		assertEquals("We only have the api /api/v1/resume , I hope I could help you!", UtilsController.GetHelp());
	}

}
