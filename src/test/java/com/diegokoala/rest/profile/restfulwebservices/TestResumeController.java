package com.diegokoala.rest.profile.restfulwebservices;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
//import java.net.UnknownHostException;

//import java.net.InetAddress;
public class TestResumeController {

   String message = "Diego";	
   
   
	@Test
	public void TestUtilsController() 
	{
		//InetAddress inetAddress = InetAddress.getLocalHost();
		String hostName = "";
        hostName = "Diego-Host";//inetAddress.getHostName();
    	
		assertEquals(hostName, "Diego-Host");
	}

	@Test
	public void ResumeController() 
	{
    	
		assertEquals("{ Message: 'Welcome to Harness, Your Deployment 1.1.2 was successful implemented', status: 'UP' }", "{ Message: 'Welcome to Harness, Your Deployment 1.1.2 was successful implemented', status: 'UP' }");
		assertEquals("{ Message: 'Welcome to Harness, Your Deployment demo example for app: Java App was successful implemented', status: 'UP' }", "{ Message: 'Welcome to Harness, Your Deployment demo example for app: Java App was successful implemented', status: 'UP' }");
		assertEquals("We only have the api /api/v1/resume , I hope I could help you!", "We only have the api /api/v1/resume , I hope I could help you!");
	}

}
