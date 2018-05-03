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

import co.edu.udea.usi.dao.MaintenanceEventDAO;
import co.edu.udea.usi.dto.MaintenanceEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class MaintenanceEventDAOImplTest {

	@Autowired
	MaintenanceEventDAO MaintenanceEventDAO;
	
	@Test
	public void testCreateMaintenanceEvent() {
		MaintenanceEvent maintenanceEvent=null;
		Request request=null;
		TypeRequest typeRequest=null;
		User user=null;
		try {
			maintenanceEvent= new MaintenanceEvent();
			request= new Request();
			typeRequest=new TypeRequest(1,"incidente");
			request.setTypeRequest(typeRequest);
			request.setDate(new Date());
			request.setUser(new User("rgr228@gmail.com",new TypeUser(1,"administrador"),"Raul"));
			request.setEventTime("08:00");
			request.setTypeRequest(typeRequest);
			maintenanceEvent.setIdREvent(1);
			maintenanceEvent.setRequest(request);
			maintenanceEvent.setInterventionType("Prev");
			maintenanceEvent.setFinalState("OP");
			maintenanceEvent.setFirstObservation("Tiene da�os leves pero funciona correctamente");
			maintenanceEvent.setProcess("Se limpia la impresora");
			maintenanceEvent.setFinalState("OP");
			MaintenanceEventDAO.createMaintenanceEvent(maintenanceEvent);
			
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testModificateMaintenaceEvent() {
		MaintenanceEvent maintenanceEvent=null;
		Request request=null;
		TypeRequest typeRequest=null;
		User user=null;
		try {
			maintenanceEvent= new MaintenanceEvent();
			request= new Request();
			typeRequest=new TypeRequest(1,"incidente");
			request.setTypeRequest(typeRequest);
			request.setDate(new Date());
			request.setUser(new User("rgr228@gmail.com",new TypeUser(1,"administrador"),"Raul"));
			request.setEventTime("08:00");
			request.setTypeRequest(typeRequest);
			maintenanceEvent.setIdREvent(1);
			maintenanceEvent.setRequest(request);
			maintenanceEvent.setInterventionType("Prev");
			maintenanceEvent.setFinalState("IN");
			maintenanceEvent.setFirstObservation("Tiene multiples averturas");
			maintenanceEvent.setProcess("Se limpia la impresora");
			maintenanceEvent.setFinalState("OP");
			MaintenanceEventDAO.modificateMaintenaceEvent(maintenanceEvent);
			
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}


	@Test
	public void testFindAllMaintenanceEvent() {
		List<MaintenanceEvent> maintenanceEvents=null;
		try {
			maintenanceEvents=new ArrayList<MaintenanceEvent>();
			maintenanceEvents=MaintenanceEventDAO.findAllMaintenanceEvent();
			assertTrue(maintenanceEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
		
	}

	@Test
	public void testFindById() {
		MaintenanceEvent maintenanceEvent=null;
		try {
			maintenanceEvent=MaintenanceEventDAO.findById(1);
			assertTrue(maintenanceEvent!=null);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByRequest() {
		List<MaintenanceEvent> maintenanceEvents=null;
		Request request=null;
		TypeRequest typeRequest=null;
		User user=null;
		try {
			maintenanceEvents=new ArrayList<MaintenanceEvent>();
			request= new Request();
			typeRequest=new TypeRequest(1,"incidente");
			request.setTypeRequest(typeRequest);
			request.setDate(new Date());
			request.setUser(new User("rgr228@gmail.com",new TypeUser(1,"administrador"),"Raul"));
			request.setEventTime("08:00");
			request.setTypeRequest(typeRequest);
			maintenanceEvents=MaintenanceEventDAO.findByRequest(request);
			assertTrue(maintenanceEvents.size()>0);
		}catch(UsiDaoException e) {
			e.getMessage();
		}
	}

	@Test
	public void testFindByAdmin() {
		List<MaintenanceEvent> maintenanceEvents=null;
		try {
			maintenanceEvents=new ArrayList<MaintenanceEvent>();
			maintenanceEvents=MaintenanceEventDAO.findByAdmin("Daniel");
			assertTrue(maintenanceEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByDate() {
		List<MaintenanceEvent> maintenanceEvents=null;
		try {
			maintenanceEvents=new ArrayList<MaintenanceEvent>();
			Calendar calendar = new GregorianCalendar();
			calendar.set(2018, 4, 3,0,0,0);
			maintenanceEvents=MaintenanceEventDAO.findByDate(calendar.getTime());
			assertTrue(maintenanceEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByStockNumber() {
		List<MaintenanceEvent> maintenanceEvents=null;
		try {
			maintenanceEvents=new ArrayList<MaintenanceEvent>();
			maintenanceEvents=MaintenanceEventDAO.findByStockNumber("000000");
			assertTrue(maintenanceEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

}
