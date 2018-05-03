package co.edu.udea.usi.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.SharedEventDAO;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.SharedEvent;
import co.edu.udea.usi.dto.TransferEvent;
import co.edu.udea.usi.exception.UsiDaoException;

public class SharedEventDAOImpl extends HibernateDaoSupport implements SharedEventDAO {

	public SharedEventDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public SharedEvent createSharedEvent(SharedEvent sharedEvent) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.save(sharedEvent);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		
		return sharedEvent;
	}

	@Override
	public SharedEvent modificateSharedEvent(SharedEvent sharedEvent) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.update(sharedEvent);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return sharedEvent;
	}

	@Override
	public List<SharedEvent> findAllSharedEvent() throws UsiDaoException {
		Session session = null;
		List<SharedEvent> sharedEvent = null;
		try{
			sharedEvent = new ArrayList<SharedEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Criteria criteria =session.createCriteria(SharedEvent.class);
			sharedEvent = criteria.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return sharedEvent;
	}

	@Override
	public List<SharedEvent> findByRequest(Request request) throws UsiDaoException {
		Session session = null;
		List<SharedEvent> sharedEvent = null;
		try{
			sharedEvent = new ArrayList<SharedEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from SharedEvent where request=:request");
			query.setParameter("request",request);
			sharedEvent = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return sharedEvent;
	}

	@Override
	public SharedEvent findById(int idSEvent) throws UsiDaoException {
		Session session = null;
		SharedEvent sharedEvent = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			sharedEvent = (SharedEvent) session.get(SharedEvent.class,idSEvent);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return sharedEvent;
	}

	@Override
	public List<SharedEvent> findByDate(Date date) throws UsiDaoException {
		Session session = null;
		List<SharedEvent> sharedEvents = null;
		try{
			sharedEvents = new ArrayList<SharedEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from SharedEvent where date=:date");
			query.setParameter("date",date);
			sharedEvents = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return sharedEvents;
	}

	@Override
	public List<SharedEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		Session session = null;
		List<SharedEvent> sharedEvents = null;
		try{
			sharedEvents = new ArrayList<SharedEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from SharedEvent where stockNumber=:stockNumber");
			query.setParameter("stockNumber",stockNumber);
			sharedEvents = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return sharedEvents;
	}

	@Override
	public List<SharedEvent> findByAdmin(String admin) throws UsiDaoException {
		Session session = null;
		List<SharedEvent> sharedEvents = null;
		try{
			sharedEvents = new ArrayList<SharedEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from SharedEvent where admin=:admin");
			query.setParameter("admin",admin);
			sharedEvents = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return sharedEvents;
	}

	@Override
	public List<SharedEvent> findByRoute(String route) throws UsiDaoException {
		Session session = null;
		List<SharedEvent> sharedEvents = null;
		try{
			sharedEvents = new ArrayList<SharedEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from SharedEvent where route=:route");
			query.setParameter("route",route);
			sharedEvents = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return sharedEvents;
	}

}
