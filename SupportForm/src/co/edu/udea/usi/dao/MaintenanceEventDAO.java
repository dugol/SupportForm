package co.edu.udea.usi.dao;

import java.util.Date;
import java.util.List;

import co.edu.udea.usi.dto.MaintenanceEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

public interface MaintenanceEventDAO {
	public MaintenanceEvent createMaintenanceEvent(MaintenanceEvent maintenanceEvent) throws UsiDaoException;
	public MaintenanceEvent modificateMaintenaceEvent(MaintenanceEvent maintenanceEvent) throws UsiDaoException;
	public List<MaintenanceEvent> findAllMaintenanceEvent() throws UsiDaoException;
	public MaintenanceEvent findById(int idMEvent)throws UsiDaoException;
	public List<MaintenanceEvent> findByRequest(Request request) throws UsiDaoException;
	public List<MaintenanceEvent> findByAdmin(String admin) throws UsiDaoException;;
	public List<MaintenanceEvent> findByDate(Date date) throws UsiDaoException;;
	public List<MaintenanceEvent> findByStockNumber(String stockNumber) throws UsiDaoException;
}
