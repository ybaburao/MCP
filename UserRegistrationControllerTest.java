package com.cts.mc.user.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.CachePut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cts.mc.user.exception.UserException;
import com.cts.mc.user.model.User;

@SpringBootTest
public class UserRegistrationControllerTest {
	@Autowired
	private UserRegistrationController controller;
	

	
	@Test
	public void createUserTest() throws UserException {
		User user = new User();
		user.setUserId(5l);
		user.setDob("02/03/09");
		user.setEmail("baburao3@gmail.com");
		user.setFirstName("FirstNameTest1");
		user.setLastName("lastNameTest1");
		ResponseEntity<String> createUser = controller.createUser(user);
		assertEquals("User Creaed Successfully", createUser.getBody());
		//assertNotNull(createUser);
	}
	@Test
	public void updateUserTest() throws UserException {
		User user = new User();
		user.setUserId(14l);
		user.setDob("02/03/09");
		user.setEmail("baburao3111@gmail.com");
		user.setFirstName("FirstNameTest111");
		user.setLastName("lastNameTest1111");
		ResponseEntity<String> updateUser = controller.updateUser(user);
		assertEquals("User Creaed Successfully", updateUser.getBody());
	}
	
	@Test
	public void getUserTest() throws UserException {
		User updateUser = controller.updateUser(14l);
		assertNotNull(updateUser);
	}
}
