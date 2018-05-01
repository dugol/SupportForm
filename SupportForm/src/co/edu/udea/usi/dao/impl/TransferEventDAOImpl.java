package co.edu.udea.usi.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.TransferEventDAO;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.TransferEvent;
import co.edu.udea.usi.exception.UsiDaoException;

public class TransferEventDAOImpl extends HibernateDaoSupport implements TransferEventDAO {

	public TransferEventDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public TransferEvent createTransferEvent(TransferEvent transferEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransferEvent modificateTransferEvent(TransferEvent transferEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransferEvent> findAllTransferEvent() throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransferEvent> findByRequest(Request request) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransferEvent findById(int idTEvent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransferEvent> findByDate(Date date) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransferEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransferEvent> findByAdmin(String admin) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
