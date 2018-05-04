package co.edu.udea.usi.bl.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


import co.edu.udea.usi.bl.TypeRequestBL;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class TypeRequestBLImplTest {
	@Autowired
	private TypeRequestBL typeRequestBL;
	
	@Test
	public void testFindAllTypeRequest() {
		List<TypeRequest> typeRequests = null;
		try{
			typeRequests = new ArrayList<TypeRequest>();
			typeRequests = typeRequestBL.findAllTypeRequest();
			assertTrue(typeRequests.size()>0);
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
