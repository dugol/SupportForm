package co.edu.udea.usi.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.RequestDAO;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

public class RequestDAOImpl extends HibernateDaoSupport implements RequestDAO {

	public RequestDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Request createRequest(Request request) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.save(request);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return request;
	}

	@Override
	public Request modificateRequest(Request request) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.update(request);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return request;
	}

	@Override
	public List<Request> findAllRequest() throws UsiDaoException {
		Session session = null;
		List<Request> requests = null;
		try{
			requests = new ArrayList<Request>();
			session = this.getSessionFactory().getCurrentSession();
			Criteria criteria =session.createCriteria(Request.class);
			requests = criteria.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return requests;
	}

	@Override
	public List<Request> findByDate(Date date) throws UsiDaoException {
		Session session = null;
		List<Request> requests = null;
		try{
			requests = new ArrayList<Request>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from Request where date=:date");
			query.setParameter("date",date);
			requests = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return requests;
	}

	@Override
	public Request findById(int idRequest) throws UsiDaoException {
		Session session = null;
		Request request = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			request = (Request) session.get(Request.class, idRequest);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return request;
	}

	@Override
	public void deleteRequest(Request request) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.delete(request);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
	}

	@Override
	public List<Request> findByState(char state) throws UsiDaoException {
		Session session = null;
		List<Request> requests = null;
		try{
			requests = new ArrayList<Request>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from Request where state=:state");
			query.setParameter("state",state);
			requests = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return requests;
	}

	@Override
	public List<Request> findByUser(User user) throws UsiDaoException {
		Session session = null;
		List<Request> requests = null;
		try{
			requests = new ArrayList<Request>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from Request where user=:user");
			query.setParameter("user",user);
			requests = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return requests;
	}

}
