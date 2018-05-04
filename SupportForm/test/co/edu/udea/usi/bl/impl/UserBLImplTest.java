package co.edu.udea.usi.bl.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.bl.UserBL;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class UserBLImplTest {
	@Autowired
	private UserBL userBL;
	
	@Test
	public void testCreateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testModificateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testModificateUserPass() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByType() {
		fail("Not yet implemented");
	}

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
	}

}
