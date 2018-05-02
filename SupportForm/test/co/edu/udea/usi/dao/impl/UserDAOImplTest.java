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
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class UserDAOImplTest {
	@Autowired
	private UserDAO userDAO;
	
/*
	@Test
	public void testCreateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testModificateUser() {
		fail("Not yet implemented");
	}
*/
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
/*
	@Test
	public void testFindByEmail() {
		fail("Not yet implemented");
	}
*/
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
/*
	@Test
	public void testFindByMainFrame() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByOffice() {
		fail("Not yet implemented");
	}*/

}
