package co.edu.udea.usi.dao;

import java.util.Date;
import java.util.List;

import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.SharedEvent;
import co.edu.udea.usi.exception.UsiDaoException;

public interface SharedEventDAO {

	public SharedEvent createSharedEvent(SharedEvent sharedEvent) throws UsiDaoException;
	public SharedEvent modificateSharedEvent(SharedEvent sharedEvent) throws UsiDaoException;
	public List<SharedEvent> findAllSharedEvent() throws UsiDaoException;
	public List<SharedEvent> findByRequest(Request request)throws UsiDaoException;
	public SharedEvent findById(int idSEvent)throws UsiDaoException;
	public List<SharedEvent> findByDate(Date date)throws UsiDaoException;
	public List<SharedEvent> findByStockNumber(String stockNumber)throws UsiDaoException;
	public List<SharedEvent> findByAdmin(String admin)throws UsiDaoException;
	public List<SharedEvent> findByRoute(String route)throws UsiDaoException;
	
}
