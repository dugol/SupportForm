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

import co.edu.udea.usi.bl.TypeUserBL;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class TypeUserBLImplTest {
	@Autowired
	private TypeUserBL typeUserBL;

	@Test
	public void testFindAllTypeUser() {
		List<TypeUser> typeUsers = null;
		try{
			typeUsers = new ArrayList<TypeUser>();
			typeUsers = typeUserBL.findAllTypeUser();
			assertTrue(typeUsers.size()>0);
		}catch(UsiDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
