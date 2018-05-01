package co.edu.udea.usi.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.ModificationEventDAO;
import co.edu.udea.usi.dto.ModificationEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

public class ModificationEventDAOImpl extends HibernateDaoSupport implements ModificationEventDAO {

	public ModificationEventDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ModificationEvent createModificationEvent(ModificationEvent modificationEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModificationEvent modificateModificationEvent(ModificationEvent modificationEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModificationEvent> findAllModificationEvent() throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModificationEvent findById(int idMEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModificationEvent> findByRequest(Request request) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModificationEvent> findByAdmin(String admin) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModificationEvent> findByDate(Date date) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModificationEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
