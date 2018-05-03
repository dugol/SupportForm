package co.edu.udea.usi.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.ModificationEventDAO;
import co.edu.udea.usi.dto.MaintenanceEvent;
import co.edu.udea.usi.dto.ModificationEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

public class ModificationEventDAOImpl extends HibernateDaoSupport implements ModificationEventDAO {

	public ModificationEventDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ModificationEvent createModificationEvent(ModificationEvent modificationEvent) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.save(modificationEvent);
			
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return modificationEvent;
	}

	@Override
	public ModificationEvent modificateModificationEvent(ModificationEvent modificationEvent) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.update(modificationEvent);
			
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return modificationEvent;
	}

	@Override
	public List<ModificationEvent> findAllModificationEvent() throws UsiDaoException {
		Session session=null;
		List<ModificationEvent> modificationEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			modificationEvents=new ArrayList<ModificationEvent>();
			Criteria criteria=session.createCriteria(ModificationEvent.class);
			modificationEvents=criteria.list();
			
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return modificationEvents;
	}

	@Override
	public ModificationEvent findById(int idMEvent) throws UsiDaoException {
		Session session=null;
		ModificationEvent modificationEvent=null;
		try {
			modificationEvent=new ModificationEvent();
			session=this.getSessionFactory().getCurrentSession();
			modificationEvent=(ModificationEvent) session.get(ModificationEvent.class,idMEvent);
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		return modificationEvent;
	}

	@Override
	public List<ModificationEvent> findByRequest(Request request) throws UsiDaoException {
		Session session=null;
		List<ModificationEvent> modificationEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			modificationEvents=new ArrayList<ModificationEvent>();
			Query query=session.createQuery("from ModificationEvent where request=:request");
			query.setParameter("request", request);
			modificationEvents=query.list();
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		
		return modificationEvents;
	}

	@Override
	public List<ModificationEvent> findByAdmin(String admin) throws UsiDaoException {
		Session session=null;
		List<ModificationEvent> modificationEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			modificationEvents=new ArrayList<ModificationEvent>();
			Query query=session.createQuery("from ModificationEvent where administrator=:administrator");
			query.setParameter("administrator", admin);
			modificationEvents=query.list();
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		
		return modificationEvents;
	}

	@Override
	public List<ModificationEvent> findByDate(Date date) throws UsiDaoException {
		Session session=null;
		List<ModificationEvent> modificationEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			modificationEvents=new ArrayList<ModificationEvent>();
			Query query=session.createQuery("from ModificationEvent where date=:date");
			query.setParameter("date", date);
			modificationEvents=query.list();
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		
		return modificationEvents;
	}

	@Override
	public List<ModificationEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		Session session=null;
		List<ModificationEvent> modificationEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			modificationEvents=new ArrayList<ModificationEvent>();
			Query query=session.createQuery("from ModificationEvent where stockNumber=:stockNumber");
			query.setParameter("stockNumber", stockNumber);
			modificationEvents=query.list();
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		
		return modificationEvents;
	}

}
