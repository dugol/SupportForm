package co.edu.udea.usi.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.MainFrameDAO;
import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.exception.UsiDaoException;

public class MainFrameDAOImpl extends HibernateDaoSupport implements MainFrameDAO {

	public MainFrameDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public MainFrame createMainFrame(MainFrame mainFrame) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MainFrame modificateMainFrame(MainFrame mainFrame) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MainFrame> findAllMainFrame() throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
