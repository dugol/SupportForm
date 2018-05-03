package co.edu.udea.usi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.TypeUserDAO;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.exception.UsiDaoException;

public class TypeUserDAOImpl extends HibernateDaoSupport implements TypeUserDAO {

	public TypeUserDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public TypeUser createTyperUser(TypeUser typeUser) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.save(typeUser);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return typeUser;
	}

	@Override
	public TypeUser modificateTypeUser(TypeUser typeUser) throws UsiDaoException {
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			session.update(typeUser);
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return typeUser;
	}

	@Override
	public List<TypeUser> findAllTypeUser() throws UsiDaoException {
		Session session = null;
		List<TypeUser> typeUsers = null;
		try{
			typeUsers = new ArrayList<TypeUser>();
			session = this.getSessionFactory().getCurrentSession();
			Criteria criteria =session.createCriteria(TypeUser.class);
			typeUsers = criteria.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return typeUsers;
	}

}
