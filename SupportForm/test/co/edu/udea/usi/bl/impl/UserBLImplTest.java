package co.edu.udea.usi.bl.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.bl.UserBL;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class UserBLImplTest {
	@Autowired
	private UserBL userBL;
	
	@Test
	public void testCreateUser() {
		try{
			userBL.createUser("dugol@gmail.com", "administrador", "Daniel", "33-100", 
					"0000000", "3148523", "12345");
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testLogin() {
		try{
			userBL.login("rgr2228@gmail.com","12345");
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testModificateUser() {
		try{
			userBL.modificateUser("rgr2228@gmail.com", "administrador", "Andres", "33-100", 
					"0000000", "3148523", "12345");
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testModificateUserPass() {
		try{
			userBL.modificateUserPass("rgr2228@gmail.com", "12345", "123", "123");
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindAllUser() {
		List<User> users = null;
		try{
			users = new ArrayList<User>();
			users = userBL.findAllUser();
			assertTrue(users.size()>0);
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	

	@Test
	public void testFindByEmail() {
		User user = null;
		try{
			user = userBL.findByEmail("rgr2228@gmail.com");
			assertNotNull(user);
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByType() {
		List<User> users = null;
		try{
			users = new ArrayList<User>();
			users = userBL.findByType("administrador");
			assertTrue(users.size()>0);
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByMainFrame() {
		User user = null;
		try{
			user = userBL.findByMainFrame("0000000");
			assertNotNull(user);
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByName() {
		List<User> users = null;
		try{
			users = new ArrayList<User>();
			users = userBL.findByName("Raul");
			assertTrue(users.size()>0);
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByOffice() {
		List<User> users = null;
		try{
			users = new ArrayList<User>();
			users = userBL.findByOffice("33-100");
			assertTrue(users.size()>0);
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
