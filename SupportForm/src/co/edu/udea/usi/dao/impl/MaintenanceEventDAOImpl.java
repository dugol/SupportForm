package co.edu.udea.usi.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.MaintenanceEventDAO;
import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.dto.MaintenanceEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

public class MaintenanceEventDAOImpl extends HibernateDaoSupport implements MaintenanceEventDAO {

	public MaintenanceEventDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public MaintenanceEvent createMaintenanceEvent(MaintenanceEvent maintenanceEvent) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.save(maintenanceEvent);
			
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return maintenanceEvent;
	}

	@Override
	public MaintenanceEvent modificateMaintenaceEvent(MaintenanceEvent maintenanceEvent) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.update(maintenanceEvent);
			
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return maintenanceEvent;
	}

	@Override
	public List<MaintenanceEvent> findAllMaintenanceEvent() throws UsiDaoException {
		Session session=null;
		List<MaintenanceEvent> maintenanceEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			maintenanceEvents=new ArrayList<MaintenanceEvent>();
			Criteria criteria=session.createCriteria(MaintenanceEvent.class);
			maintenanceEvents=criteria.list();
			
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return maintenanceEvents;
	}

	@Override
	public MaintenanceEvent findById(int idMEvent) throws UsiDaoException {
		Session session=null;
		MaintenanceEvent maintenanceEvent=null;
		try {
			maintenanceEvent=new MaintenanceEvent();
			session=this.getSessionFactory().getCurrentSession();
			maintenanceEvent=(MaintenanceEvent) session.get(MaintenanceEvent.class,idMEvent);
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		return maintenanceEvent;
	}

	@Override
	public List<MaintenanceEvent> findByRequest(Request request) throws UsiDaoException {
		Session session=null;
		List<MaintenanceEvent> maintenanceEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			maintenanceEvents=new ArrayList<MaintenanceEvent>();
			Query query=session.createQuery("from MaintenanceEvent where request=:request");
			query.setParameter("request", request);
			maintenanceEvents=query.list();
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		
		return maintenanceEvents;
	}

	@Override
	public List<MaintenanceEvent> findByAdmin(String admin) throws UsiDaoException {
		Session session=null;
		List<MaintenanceEvent> maintenanceEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			maintenanceEvents=new ArrayList<MaintenanceEvent>();
			Query query=session.createQuery("from MaintenanceEvent where administrador=:administrador");
			query.setParameter("administrador", admin);
			maintenanceEvents=query.list();
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		
		return maintenanceEvents;
	}

	@Override
	public List<MaintenanceEvent> findByDate(Date date) throws UsiDaoException {
		Session session=null;
		List<MaintenanceEvent> maintenanceEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			maintenanceEvents=new ArrayList<MaintenanceEvent>();
			Query query=session.createQuery("from MaintenanceEvent where date=:date");
			query.setParameter("date", date);
			maintenanceEvents=query.list();
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		
		return maintenanceEvents;
	}

	@Override
	public List<MaintenanceEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		Session session=null;
		List<MaintenanceEvent> maintenanceEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			maintenanceEvents=new ArrayList<MaintenanceEvent>();
			Query query=session.createQuery("from MaintenanceEvent where stockNumber=:stockNumber");
			query.setParameter("stockNumber", stockNumber);
			maintenanceEvents=query.list();
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		
		return maintenanceEvents;
	}

}
