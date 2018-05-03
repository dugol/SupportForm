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

import co.edu.udea.usi.dao.MainFrameDAO;
import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.cfg.xml")
@Transactional
public class MainFrameDAOImplTest {
	
	@Autowired
	private MainFrameDAO mainFrameDAO; 
	

	@Test
	public void testCreateMainFrame() {
		MainFrame mainFrame=null;
		try {
			mainFrame=new MainFrame();					
			mainFrame.setSerialNumber("111111");
			mainFrame.setStockNumber("111111");
			mainFrame.setBrand("Lenovo");
			mainFrame.setReference("ThinkCentre 710s");
			mainFrame.setProcessor("Intel Corei7-7400");
			mainFrame.setRam(8);
			mainFrame.setHardDrive("500GB 7200RPM");
			mainFrame.setMainBoard("Intel Chipset");
			mainFrameDAO.createMainFrame(mainFrame);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
		
	}
	
	

	@Test
	public void testModificateMainFrame() {
		MainFrame mainFrame=null;
		try {
			mainFrame=new MainFrame();					
			mainFrame.setSerialNumber("111111");
			mainFrame.setStockNumber("0000000");
			mainFrame.setBrand("Lenovo");
			mainFrame.setReference("ThinkCentre 710s");
			mainFrame.setProcessor("Intel Corei7-7400");
			mainFrame.setRam(8);
			mainFrame.setHardDrive("500GB 7200RPM");
			mainFrame.setMainBoard("Intel Chipset");
			mainFrameDAO.modificateMainFrame(mainFrame);
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

	
	@Test
	public void testFindAllMainFrame() {
		List<MainFrame> mainFrames=null;
		try {
			mainFrames=new ArrayList<MainFrame>();
			mainFrames=mainFrameDAO.findAllMainFrame();
			assertTrue(mainFrames.size()>0);
			
		}catch(UsiDaoException e) {
			fail(e.getMessage());
		}
	}

}
