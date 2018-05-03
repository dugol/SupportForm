package co.edu.udea.usi.dao.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.dao.UserDAO;
import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class UserDAOImplTest {
	@Autowired
	private UserDAO userDAO;
	
	@Test
	public void testCreateUser() {
		TypeUser typeUser = null;
		User user = null;
		try{
			typeUser = new TypeUser(1,"administrador");
			user = new User("dugol@gmail.com", typeUser,"Daniel");
			userDAO.createUser(user);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testModificateUser() {
		TypeUser typeUser = null;
		MainFrame mainFrame = null;
		User user = null;
		try{
			typeUser = new TypeUser(1,"administrador");
			//mainFrame = new MainFrame("00000", "G32M", "SURE", "0000000", "Intel core i3", 8, "500GB", "G32M");
			user = new User("rgr2228@gmail.com", typeUser,"Raul");
			user.setOffice("33-108");
			userDAO.modificateUser(user);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testFindAllUser() {
		List<User> users = null;
		try {
			users = new ArrayList<User>();
			users = userDAO.findAllUser();
			assertTrue(users.size()>0);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByEmail() {
		User user = null;
		try {
			user = userDAO.findByEmail("rgr2228@gmail.com");
			assertNotNull(user);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testFindByType() {
		List<User> users = null;
		TypeUser typeUser = null;
		try {
			users = new ArrayList<User>();
			typeUser = new TypeUser(1,"administrador");
			users = userDAO.findByType(typeUser);
			assertTrue(users.size()>0);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByMainFrame() {
		User user = null;
		MainFrame mainFrame = null;
		try {
			mainFrame = new MainFrame("0000000", "000000", "G32M", "SURE", "Intel core i3", 8, "500GB", "G32M");
			user = userDAO.findByMainFrame(mainFrame);
			assertNotNull(user);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByName() {
		User user = null;
		try {
			user = userDAO.findByName("Raul");
			assertNotNull(user);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByOffice() {
		List<User> users = null;
		try{
			users = new ArrayList<User>();
			users = userDAO.findByOffice("33-100");
			assertTrue(users.size()>0);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
