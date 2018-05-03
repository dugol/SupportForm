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

import co.edu.udea.usi.dao.RefundEventDAO;
import co.edu.udea.usi.dto.RefundEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class RefundEventDAOImplTest {
	@Autowired
	RefundEventDAO refundEventDAO;


	@Test
	public void testCreateRefundEvent() {
		RefundEvent refundEvent=null;
		try {
			refundEvent=new RefundEvent();
			refundEvent.setIdReEvent(2);
			refundEvent.setDate(new Date());
			refundEvent.setItem("PCE");
			refundEvent.setAmount(1);
			refundEvent.setStockNumber("000000");
			refundEventDAO.createRefundEvent(refundEvent);	
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testModificateRefundEvent() {
		RefundEvent refundEvent=null;
		try {
			refundEvent=new RefundEvent();
			refundEvent.setIdReEvent(1);
			refundEvent.setItem("SPI");
			refundEvent.setAmount(1);
			refundEvent.setStockNumber("111111");
			refundEvent.setDate(new Date());
			refundEventDAO.modificateRefundEvent(refundEvent);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindAllRefundEvent() {
		List<RefundEvent> refundEvents=null;
		try {
			refundEvents= new ArrayList<RefundEvent>();
			refundEvents=refundEventDAO.findAllRefundEvent();
			assertTrue(refundEvents.size()>0);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindById() {
		RefundEvent refundEvent=null;
		try {
			refundEvent=refundEventDAO.findById(1);
			assertTrue(refundEvent!=null);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindByRequest() {
		Request request=null;
		TypeRequest typeRequest=null;
		User user=null;
		List<RefundEvent> refundEvents=null;
		try {
			refundEvents=new ArrayList<RefundEvent>();
			request= new Request();
			typeRequest=new TypeRequest(1,"incidente");
			request.setTypeRequest(typeRequest);
			//request.setDate(new Date());
			request.setUser(new User("rgr228@gmail.com",new TypeUser(1,"administrador"),"Raul"));
			request.setEventTime("08:00");
			request.setTypeRequest(typeRequest);
			request.setIdRequest(1);
			refundEvents=refundEventDAO.findByRequest(request);
			assertTrue(refundEvents.size()>0);
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
