package co.edu.udea.usi.dao.impl;

import java.util.Date;
import java.util.List;

import co.edu.udea.usi.dao.SharedEventDAO;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.SharedEvent;
import co.edu.udea.usi.exception.UsiDaoException;

public class SharedEventDAOImpl implements SharedEventDAO {

	public SharedEventDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public SharedEvent createSharedEvent(SharedEvent sharedEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SharedEvent modificateSharedEvent(SharedEvent sharedEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SharedEvent> findAllSharedEvent() throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SharedEvent> findByRequest(Request request) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SharedEvent findById(int idSEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SharedEvent> findByDate(Date date) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SharedEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SharedEvent> findByAdmin(String admin) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SharedEvent> findByRoute(String route) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
