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

import co.edu.udea.usi.dao.GeneralEventDAO;
import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class GeneralEventDAOImplTest {
	@Autowired
	private GeneralEventDAO generalEventDAO;
	

	@Test
	public void testCreateGeneralEvent() {
		
		GeneralEvent generalEvent =null;
		Request request=null;
		TypeRequest typeRequest=null;
		User user=null;
		try {
			generalEvent=new GeneralEvent();
			request= new Request();
			typeRequest=new TypeRequest(1,"incidente");
			request.setTypeRequest(typeRequest);
			request.setDate(new Date());
			request.setUser(new User("rgr228@gmail.com",new TypeUser(1,"administrador"),"Raul"));
			request.setEventTime("08:00");
			request.setTypeRequest(typeRequest);
			generalEvent.setDate(new Date());
			generalEvent.setRequest(request);
			generalEvent.setIdGEvent(1);
			generalEventDAO.createGeneralEvent(generalEvent);
			
			
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
		
	}

	@Test
	public void testModificateGeneralEvent() {
		GeneralEvent generalEvent =null;
		Request request=null;
		TypeRequest typeRequest=null;
		User user=null;
		try {
			generalEvent=new GeneralEvent();
			request= new Request();
			typeRequest=new TypeRequest(1,"incidente");
			request.setTypeRequest(typeRequest);
			request.setDate(new Date());
			request.setUser(new User("rgr228@gmail.com",new TypeUser(1,"administrador"),"Raul"));
			request.setEventTime("08:00");
			request.setTypeRequest(typeRequest);
			generalEvent.setDate(new Date());
			generalEvent.setRequest(request);
			generalEvent.setIdGEvent(1);
			generalEvent.setEventTime("09:00");
			generalEventDAO.modificateGeneralEvent(generalEvent);
			
			
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	
	@Test
	public void testFindAllGeneralEvent() {
		List<GeneralEvent> generalEvents=null;
		try {
			generalEvents=new ArrayList<GeneralEvent>();
			generalEvents=generalEventDAO.findAllGeneralEvent();
			assertTrue(generalEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByRequest() {
		List<GeneralEvent> generalEvents=null;
		Request request=null;
		TypeRequest typeRequest=null;
		try {
			request= new Request();
			request.setIdRequest(1);
			generalEvents= new ArrayList<GeneralEvent>();
			typeRequest=new TypeRequest(1,"incidente");
			request.setTypeRequest(typeRequest);
			request.setDate(new Date());
			request.setUser(new User("rgr228@gmail.com",new TypeUser(1,"administrador"),"Raul"));
			request.setEventTime("08:00");
			request.setTypeRequest(typeRequest);
			//request.setChannel("Telefonico");
			//request.setLevel(1);
			//request.setDescription("Mi equipo no enciende");
			//request.setOffice("111");
			
			generalEvents=generalEventDAO.findByRequest(request);
			assertTrue(generalEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByAdmin() {
		List<GeneralEvent> generalEvents=null;
		try {
			generalEvents=new ArrayList<GeneralEvent>();
			generalEvents=generalEventDAO.findByAdmin("Daniel");
			assertTrue(generalEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}
/*
	@Test
	public void testFindByDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByStockNumber() {
		fail("Not yet implemented");
	}
*/
}
