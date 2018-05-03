package co.edu.udea.usi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.TypeRequestDAO;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.exception.UsiDaoException;

public class TypeRequestDAOImpl extends HibernateDaoSupport implements TypeRequestDAO {

	public TypeRequestDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public TypeRequest createTypeRequest(TypeRequest typeRequest) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.save(typeRequest);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return typeRequest;
	}

	@Override
	public TypeRequest modificateTypeRequest(TypeRequest typeRequest) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.update(typeRequest);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return typeRequest;
	}

	@Override
	public List<TypeRequest> findAllTypeRequest() throws UsiDaoException {
		Session session = null;
		List<TypeRequest> typeRequests = null;
		try{
			typeRequests = new ArrayList<TypeRequest>();
			session = this.getSessionFactory().getCurrentSession();
			Criteria criteria =session.createCriteria(TypeRequest.class);
			typeRequests = criteria.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return typeRequests;
	}

}
