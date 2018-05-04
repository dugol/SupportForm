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

import co.edu.udea.usi.dao.TypeUserDAO;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class TypeUserDAOImplTest {
	@Autowired
	private TypeUserDAO typeUserDAO;

	@Test
	public void testCreateTyperUser() {
		TypeUser typeUser = null;
		try{
			typeUser = new TypeUser(2,"auxiliar");
			typeUserDAO.createTyperUser(typeUser);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testModificateTypeUser() {
		TypeUser typeUser = null;
		try{
			typeUser = new TypeUser(2,"profesor");
			typeUserDAO.modificateTypeUser(typeUser);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindAllTypeUser() {
		List<TypeUser> typeUser = null;
		try{
			typeUser = new ArrayList<TypeUser>();
			typeUser = typeUserDAO.findAllTypeUser();
			assertTrue(typeUser.size()>0);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testByName(){
		TypeUser typeUser = null;
		try{
			typeUser = typeUserDAO.findByName("administrador");
			assertNotNull(typeUser);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
