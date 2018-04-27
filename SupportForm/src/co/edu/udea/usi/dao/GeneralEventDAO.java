package co.edu.udea.usi.dao;

import java.util.Date;
import java.util.List;

import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

public interface GeneralEventDAO {
	public GeneralEvent createGeneralEvent(GeneralEvent generalEvent) throws UsiDaoException;
	public GeneralEvent modificateGeneralEvent(GeneralEvent generalEvent) throws UsiDaoException;
	public List<GeneralEvent> findAllGeneralEvent() throws UsiDaoException;
	public List<GeneralEvent> findByRequest(Request request) throws UsiDaoException;
	public List<GeneralEvent> findByAdmin(String admin) throws UsiDaoException;;
	public List<GeneralEvent> findByDate(Date date) throws UsiDaoException;;
	public List<GeneralEvent> findByStockNumber(String stockNumber) throws UsiDaoException;
}
