package co.edu.udea.usi.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.RefundEventDAO;
import co.edu.udea.usi.dto.ModificationEvent;
import co.edu.udea.usi.dto.RefundEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

public class RefundEventDAOImpl extends HibernateDaoSupport implements RefundEventDAO {

	public RefundEventDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public RefundEvent createRefundEvent(RefundEvent refundEvent) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.save(refundEvent);
			
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return refundEvent;
	}

	@Override
	public RefundEvent modificateRefundEvent(RefundEvent refundEvent) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.update(refundEvent);
			
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return refundEvent;
	}

	@Override
	public List<RefundEvent> findAllRefundEvent() throws UsiDaoException {
		Session session=null;
		List<RefundEvent> refundEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			refundEvents=new ArrayList<RefundEvent>();
			Criteria criteria=session.createCriteria(RefundEvent.class);
			refundEvents=criteria.list();
			
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return refundEvents;
	}

	@Override
	public RefundEvent findById(int idReEvent) throws UsiDaoException {
		Session session=null;
		RefundEvent refundEvent=null;
		try {
			refundEvent=new RefundEvent();
			session=this.getSessionFactory().getCurrentSession();
			refundEvent=(RefundEvent) session.get(RefundEvent.class,idReEvent);
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		return refundEvent;
	}

	@Override
	public List<RefundEvent> findByRequest(Request request) throws UsiDaoException {
		Session session=null;
		List<RefundEvent> refundEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			refundEvents=new ArrayList<RefundEvent>();
			Query query=session.createQuery("from RefundEvent where request=:request");
			query.setParameter("request", request);
			refundEvents=query.list();
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		
		return refundEvents;
	}

	@Override
	public List<RefundEvent> findByDate(Date date) throws UsiDaoException {
		Session session=null;
		List<RefundEvent> refundEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			refundEvents=new ArrayList<RefundEvent>();
			Query query=session.createQuery("from RefundEvent where date=:date");
			query.setParameter("date", date);
			refundEvents=query.list();
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		
		return refundEvents;
	}

	@Override
	public List<RefundEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		Session session=null;
		List<RefundEvent> refundEvents=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			refundEvents=new ArrayList<RefundEvent>();
			Query query=session.createQuery("from RefundEvent where stockNumber=:stockNumber");
			query.setParameter("stockNumber", stockNumber);
			refundEvents=query.list();
			
		}catch(HibernateException e) {
			throw new UsiDaoException(e);
		}
		
		return refundEvents;
	}

}
