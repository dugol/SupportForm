package co.edu.udea.usi.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.MaintenanceEventDAO;
import co.edu.udea.usi.dto.MaintenanceEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

public class MaintenanceEventDAOImpl extends HibernateDaoSupport implements MaintenanceEventDAO {

	public MaintenanceEventDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public MaintenanceEvent createMaintenanceEvent(MaintenanceEvent maintenanceEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MaintenanceEvent modificateMaintenaceEvent(MaintenanceEvent maintenanceEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MaintenanceEvent> findAllMaintenanceEvent() throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MaintenanceEvent findById(int idMEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MaintenanceEvent> findByRequest(Request request) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MaintenanceEvent> findByAdmin(String admin) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MaintenanceEvent> findByDate(Date date) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MaintenanceEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
