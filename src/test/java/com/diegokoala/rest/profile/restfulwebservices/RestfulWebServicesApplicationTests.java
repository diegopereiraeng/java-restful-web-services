package com.diegokoala.rest.profile.restfulwebservices;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = RestfulWebServicesApplication.class)
public class RestfulWebServicesApplicationTests extends AbstractTestNGSpringContextTests{

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@BeforeClass
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testHarness() throws Exception {
		mockMvc.perform(get("/api/v1/harness")).andExpect(status().isOk())
				.andExpect(content().contentType("text/plain;charset=UTF-8"))
				.andExpect(jsonPath("$.Message").value("Welcome to Harness, Your Deployment 1.5.5 was successful implemented")).andExpect(jsonPath("$.status").value("UP"));

	}

	@Test
	public void testResume() throws Exception {
		mockMvc.perform(get("/api/v1/resume")).andExpect(status().isOk())
				.andExpect(content().contentType("text/plain;charset=UTF-8"))
				.andExpect(jsonPath("$.name").value("Diego Paes Ramalho Pereira")).andExpect(jsonPath("$.company").value("Harness")).andExpect(jsonPath("$.objective").value("Help Customers with CI/CD"));

	}

	/* @Test
	public void testRoot() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk())
				.andExpect(content().contentType("text/plain;charset=UTF-8"))
				.andExpect(jsonPath("$.Message").value("Welcome to Harness, Your Deployment 1.5.5 was successful implemented")).andExpect(jsonPath("$.status").value("UP"));

	}
*/
	@Test
	public void testHelp() throws Exception {
		mockMvc.perform(get("/api/v1/help")).andExpect(status().isOk())
				.andExpect(content().contentType("text/plain;charset=UTF-8"))
				.andExpect(content().string("We only have the api /api/v1/resume , I hope I could help you!"));

	}

	@Test
	public void testHealthCheck() throws Exception {
		mockMvc.perform(put("/health_check/12345").param("name", "Diego")).andExpect(status().isOk())
				.andExpect(content().contentType("text/plain;charset=UTF-8"))
				.andExpect(jsonPath("$.Message").value("Welcome to Harness, Your Deployment 12345 for app: Diego was successful implemented")).andExpect(jsonPath("$.status").value("UP"));

	}

	

}
