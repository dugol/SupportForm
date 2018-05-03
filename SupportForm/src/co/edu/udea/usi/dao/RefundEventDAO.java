package co.edu.udea.usi.dao;

import java.util.Date;
import java.util.List;


import co.edu.udea.usi.dto.RefundEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

public interface RefundEventDAO {

	public RefundEvent createRefundEvent(RefundEvent refundEvent) throws UsiDaoException;
	public RefundEvent modificateRefundEvent(RefundEvent refundEvent) throws UsiDaoException;
	public List<RefundEvent> findAllRefundEvent() throws UsiDaoException;
	public RefundEvent findById(int idReEvent)throws UsiDaoException;
	public List<RefundEvent> findByDate(Date date)throws UsiDaoException;
	public List<RefundEvent> findByStockNumber(String stockNumber)throws UsiDaoException;
}
