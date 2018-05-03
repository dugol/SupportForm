package co.edu.udea.usi.dao.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.dao.ModificationEventDAO;
import co.edu.udea.usi.dto.MaintenanceEvent;
import co.edu.udea.usi.dto.ModificationEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class ModificationEventDAOImplTest {

	@Autowired
	ModificationEventDAO modificationEventDAO;

	@Test
	public void testCreateModificationEvent() {
		ModificationEvent modificationEvent=null;
		Request request=null;
		TypeRequest typeRequest=null;
		User user=null;
		try {
			modificationEvent= new ModificationEvent();
			request= new Request();
			typeRequest=new TypeRequest(1,"incidente");
			request.setTypeRequest(typeRequest);
			request.setDate(new Date());
			request.setUser(new User("rgr228@gmail.com",new TypeUser(1,"administrador"),"Raul"));
			request.setEventTime("08:00");
			request.setTypeRequest(typeRequest);
			modificationEvent.setIdMEvent(2);
			modificationEvent.setRequest(request);
			modificationEventDAO.createModificationEvent(modificationEvent);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testModificateModificationEvent() {
		ModificationEvent modificationEvent=null;
		Request request=null;
		TypeRequest typeRequest=null;
		User user=null;
		try {
			modificationEvent= new ModificationEvent();
			request= new Request();
			typeRequest=new TypeRequest(1,"incidente");
			request.setTypeRequest(typeRequest);
			request.setDate(new Date());
			request.setUser(new User("rgr228@gmail.com",new TypeUser(1,"administrador"),"Raul"));
			request.setEventTime("08:00");
			request.setTypeRequest(typeRequest);
			modificationEvent.setIdMEvent(1);
			modificationEvent.setRequest(request);
			modificationEvent.setAdministrator("Daniel");
			modificationEventDAO.createModificationEvent(modificationEvent);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindAllModificationEvent() {
		List<ModificationEvent> modificationEvents=null;
		try {
			modificationEvents=new ArrayList<ModificationEvent>();
			modificationEvents=modificationEventDAO.findAllModificationEvent();
			assertTrue(modificationEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindById() {
		ModificationEvent modificationEvent=null;
		try {
			modificationEvent=modificationEventDAO.findById(1);
			assertTrue(modificationEvent!=null);
			
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByRequest() {
		List<ModificationEvent> modificationEvents=null;
		Request request=null;
		TypeRequest typeRequest=null;
		User user=null;
		try {
			modificationEvents=new ArrayList<ModificationEvent>();
			request= new Request();
			typeRequest=new TypeRequest(1,"incidente");
			request.setTypeRequest(typeRequest);
			request.setDate(new Date());
			request.setUser(new User("rgr228@gmail.com",new TypeUser(1,"administrador"),"Raul"));
			request.setEventTime("08:00");
			request.setTypeRequest(typeRequest);
			modificationEvents=modificationEventDAO.findByRequest(request);
			assertTrue(modificationEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByAdmin() {
		List<ModificationEvent> modificationEvents=null;
		try {
			modificationEvents=new ArrayList<ModificationEvent>();
			modificationEvents=modificationEventDAO.findByAdmin("Daniel");
			assertTrue(modificationEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByDate() {
		List<ModificationEvent> modificationEvents=null;
		try {
			modificationEvents=new ArrayList<ModificationEvent>();
			modificationEvents=modificationEventDAO.findByDate(new Date());
			assertTrue(modificationEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByStockNumber() {
		List<ModificationEvent> modificationEvents=null;
		try {
			modificationEvents=new ArrayList<ModificationEvent>();
			modificationEvents=modificationEventDAO.findByStockNumber("000000");
			assertTrue(modificationEvents.size()>0);
			
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

}
