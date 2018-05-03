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

import co.edu.udea.usi.dao.TypeRequestDAO;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class TypeRequestDAOImplTest {
	@Autowired
	private TypeRequestDAO typeRequestDAO;
	
	@Test
	public void testCreateTypeRequest() {
		TypeRequest typeRequest = null;
		try{
			typeRequest = new TypeRequest(2, "Cambio");
			typeRequestDAO.createTypeRequest(typeRequest);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testModificateTypeRequest() {
		TypeRequest typeRequest = null;
		try{
			typeRequest = new TypeRequest(2, "Diagnostico");
			typeRequestDAO.modificateTypeRequest(typeRequest);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindAllTypeRequest() {
		List<TypeRequest> typeRequest = null;
		try{
			typeRequest = new ArrayList<TypeRequest>();
			typeRequest = typeRequestDAO.findAllTypeRequest();
			assertTrue(typeRequest.size()>0);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
