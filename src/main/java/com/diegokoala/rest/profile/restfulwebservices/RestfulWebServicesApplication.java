package com.diegokoala.rest.profile.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.diegokoala.rest.profile.harnessservice.FFHarnessService;

@SpringBootApplication(scanBasePackages = {"com.diegokoala"})
public class RestfulWebServicesApplication  {



	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

}
