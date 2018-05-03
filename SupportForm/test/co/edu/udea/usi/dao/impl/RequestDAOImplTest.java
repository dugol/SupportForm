package co.edu.udea.usi.dao.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.dao.RequestDAO;
import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class RequestDAOImplTest {
	@Autowired
	private RequestDAO requestDAO;
	
	
	@Test
	public void testCreateRequest() {
		User user = null;
		TypeRequest typeRequest = null;
		TypeUser typeUser = null;
		Request request = null;
		try{
			typeRequest = new TypeRequest(1,"Incidente");
			typeUser = new TypeUser(1,"administrador");
			user = new User("rgr2228@gmail.com", typeUser,"Raul");
			request = new Request(typeRequest, user, new Date(), "08:00");
			request.setIdRequest(2);
			requestDAO.createRequest(request);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testModificateRequest() {
		User user = null;
		TypeRequest typeRequest = null;
		TypeUser typeUser = null;
		Request request = null;
		try{
			typeRequest = new TypeRequest(1,"Incidente");
			typeUser = new TypeUser(1,"administrador");
			user = new User("rgr2228@gmail.com", typeUser,"Raul");
			request = new Request(typeRequest, user, new Date(), "08:00");
			request.setDescription("Problemas con el internet");
			request.setIdRequest(1);
			requestDAO.modificateRequest(request);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindAllRequest() {
		List<Request> requests = null;
		try{
			requests = new ArrayList<Request>();
			requests = requestDAO.findAllRequest();
			assertTrue(requests.size()>0);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByDate() {
		List<Request> requests = null;
		try{
			requests = new ArrayList<Request>();
			Calendar calendar = new GregorianCalendar();
			calendar.set(2018, 4, 3,0,0,0);
			requests = requestDAO.findByDate(calendar.getTime());
			assertTrue(requests.size()>0);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindById() {
		Request request = null;
		try{
			request = requestDAO.findById(1);
			assertNotNull(request);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testDeleteRequest() {
		User user = null;
		TypeRequest typeRequest = null;
		TypeUser typeUser = null;
		MainFrame mainFrame = null;
		Request request = null;
		try{
			typeUser = new TypeUser(1,"administrador");
			mainFrame = new MainFrame("0000000", "000000", "G32M", "SURE", "Intel core i3", 8, "500GB", "G32M");
			user = new User("rgr2228@gmail.com", mainFrame, typeUser, "Raul", "33-100","3148514700","12345");
			typeRequest = new TypeRequest(1,"Incidente");
			request = new Request();
			request.setIdRequest(1);
			request.setDate(new Date());
			request.setEventTime("08:00");
			request.setUser(user);
			request.setOffice("33-310");
			request.setState('p');
			request.setTypeRequest(typeRequest);
			requestDAO.deleteRequest(request);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByState() {
		List<Request> requests = null;
		try{
			requests = new ArrayList<Request>();
			requests = requestDAO.findByState('0');
			assertTrue(requests.size()>0);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByUser() {
		List<Request> requests = null;
		User user = null;
		MainFrame mainFrame = null;
		TypeUser typeUser = null;
		try{
			typeUser = new TypeUser(1,"administrador");
			mainFrame = new MainFrame("0000000", "000000", "G32M", "SURE", "Intel core i3", 8, "500GB", "G32M");
			user = new User("rgr2228@gmail.com", mainFrame, typeUser, "Raul", "33-100","3148514700","12345");
			requests = new ArrayList<Request>();
			requests = requestDAO.findByUser(user);
			assertTrue(requests.size()>0);
		}catch(UsiDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
