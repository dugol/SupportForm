package co.edu.udea.usi.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.GeneralEventDAO;
import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

public class GeneralEventDAOImpl extends HibernateDaoSupport implements GeneralEventDAO {

	public GeneralEventDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public GeneralEvent createGeneralEvent(GeneralEvent generalEvent) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.save(generalEvent);
			
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return generalEvent;
	}

	@Override
	public GeneralEvent modificateGeneralEvent(GeneralEvent generalEvent) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GeneralEvent> findAllGeneralEvent() throws UsiDaoException {
		Session session = null;
		List<GeneralEvent> generalEvents = null;
		try{
			generalEvents = new ArrayList<GeneralEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Criteria criteria =session.createCriteria(GeneralEvent.class);
			generalEvents = criteria.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return generalEvents;
	}

	@Override
	public List<GeneralEvent> findByRequest(Request request) throws UsiDaoException {
		Session session = null;
		List<GeneralEvent> generalEvents = null;
		try{
			generalEvents = new ArrayList<GeneralEvent>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from generalevent where request=:request");
			query.setParameter("request",request);
			generalEvents = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return generalEvents;
	}

	@Override
	public List<GeneralEvent> findByAdmin(String admin) throws UsiDaoException {
		
		return null;
	}

	@Override
	public List<GeneralEvent> findByDate(Date date) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GeneralEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
