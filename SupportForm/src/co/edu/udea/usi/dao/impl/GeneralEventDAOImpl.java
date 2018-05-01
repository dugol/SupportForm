package co.edu.udea.usi.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.GeneralEventDAO;
import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

public class GeneralEventDAOImpl extends HibernateDaoSupport implements GeneralEventDAO {

	public GeneralEventDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public GeneralEvent createGeneralEvent(GeneralEvent generalEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GeneralEvent modificateGeneralEvent(GeneralEvent generalEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GeneralEvent> findAllGeneralEvent() throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GeneralEvent> findByRequest(Request request) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GeneralEvent> findByAdmin(String admin) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GeneralEvent> findByDate(Date date) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GeneralEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
