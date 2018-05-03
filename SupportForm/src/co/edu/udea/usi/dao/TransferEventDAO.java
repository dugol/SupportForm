package co.edu.udea.usi.dao;

import java.util.Date;
import java.util.List;

import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.TransferEvent;
import co.edu.udea.usi.exception.UsiDaoException;

public interface TransferEventDAO {

	public TransferEvent createTransferEvent(TransferEvent transferEvent) throws UsiDaoException;
	public TransferEvent modificateTransferEvent(TransferEvent transferEvent) throws UsiDaoException;
	public List<TransferEvent> findAllTransferEvent() throws UsiDaoException;
	public List<TransferEvent> findByRequest(Request request)throws UsiDaoException;
	public TransferEvent findById(int idTEvent)throws UsiDaoException;
	public List<TransferEvent> findByDate(Date date)throws UsiDaoException;
	public List<TransferEvent> findByStockNumber(String stockNumber)throws UsiDaoException;
	public List<TransferEvent> findByAdmin(String admin)throws UsiDaoException;
	
	
}
