package co.edu.udea.usi.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
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
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.save(transferEvent);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		
		return transferEvent;
	}

	@Override
	public TransferEvent modificateTransferEvent(TransferEvent transferEvent) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.update(transferEvent);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return transferEvent;
	}

	@Override
	public List<TransferEvent> findAllTransferEvent() throws UsiDaoException {
		Session session = null;
		List<TransferEvent> transferEvents = null;
		try{
			transferEvents = new ArrayList<TransferEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Criteria criteria =session.createCriteria(TransferEvent.class);
			transferEvents = criteria.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return transferEvents;
	}

	@Override
	public List<TransferEvent> findByRequest(Request request) throws UsiDaoException {
		Session session = null;
		List<TransferEvent> transferEvents = null;
		try{
			transferEvents = new ArrayList<TransferEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from TransferEvent where request=:request");
			query.setParameter("request",request);
			transferEvents = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return transferEvents;
	}

	@Override
	public TransferEvent findById(int idTEvent) throws UsiDaoException {
		Session session = null;
		TransferEvent transferEvent = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			transferEvent = (TransferEvent) session.get(TransferEvent.class,idTEvent);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return transferEvent;
	}

	@Override
	public List<TransferEvent> findByDate(Date date) throws UsiDaoException {
		Session session = null;
		List<TransferEvent> transferEvents = null;
		try{
			transferEvents = new ArrayList<TransferEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from TransferEvent where date=:date");
			query.setParameter("date",date);
			transferEvents = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return transferEvents;
	}

	@Override
	public List<TransferEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		Session session = null;
		List<TransferEvent> transferEvents = null;
		try{
			transferEvents = new ArrayList<TransferEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from TransferEvent where stockNumber=:stockNumber");
			query.setParameter("stockNumber",stockNumber);
			transferEvents = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return transferEvents;
	}

	@Override
	public List<TransferEvent> findByAdmin(String admin) throws UsiDaoException {
		Session session = null;
		List<TransferEvent> transferEvents = null;
		try{
			transferEvents = new ArrayList<TransferEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from TransferEvent where admin=:admin");
			query.setParameter("admin",admin);
			transferEvents = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return transferEvents;
	}

}
