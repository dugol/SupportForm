package co.edu.udea.usi.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.dao.GeneralEventDAO;
import co.edu.udea.usi.dto.GeneralEvent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class GeneralEventDAOImplTest {
	@Autowired
	private GeneralEventDAO generalEventDAO;
	

	@Test
	public void testCreateGeneralEvent() {
		
		GeneralEvent generalEvent =null;
		try {
			generalEvent=new GeneralEvent();
		}
		
	}

	@Test
	public void testModificateGeneralEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllGeneralEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByRequest() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByAdmin() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByStockNumber() {
		fail("Not yet implemented");
	}

}
