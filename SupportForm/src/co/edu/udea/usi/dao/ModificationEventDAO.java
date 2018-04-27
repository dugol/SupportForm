package co.edu.udea.usi.dao;

import java.util.Date;
import java.util.List;


import co.edu.udea.usi.dto.ModificationEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

public interface ModificationEventDAO {

	public ModificationEvent createModificationEvent(ModificationEvent modificationEvent) throws UsiDaoException;
	public ModificationEvent modificateModificationEvent(ModificationEvent modificationEvent) throws UsiDaoException;
	public List<ModificationEvent> findAllModificationEvent() throws UsiDaoException;
	public ModificationEvent findById(int idMEvent)throws UsiDaoException;
	public List<ModificationEvent> findByRequest(Request request) throws UsiDaoException;
	public List<ModificationEvent> findByAdmin(String admin) throws UsiDaoException;;
	public List<ModificationEvent> findByDate(Date date) throws UsiDaoException;;
	public List<ModificationEvent> findByStockNumber(String stockNumber) throws UsiDaoException;
}
