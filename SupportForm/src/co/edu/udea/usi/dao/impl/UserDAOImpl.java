package co.edu.udea.usi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.UserDAO;
import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	public UserDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User createUser(User user) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User modificateUser(User user) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUser() throws UsiDaoException {
		Session session = null;
		List<User> users = null;
		try {
			session = this.getSessionFactory().getCurrentSession();
			users = new ArrayList<User>();
			Criteria criteria =session.createCriteria(User.class);
			users = criteria.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return users;
	}

	@Override
	public User findByEmail(String email) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findByType(TypeUser typeUser) throws UsiDaoException {
		Session session = null;
		List<User> users = null;
		try {
			users = new ArrayList<User>();
			session = this.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from User where typeUser=:typeUser");
			query.setParameter("typeUser",typeUser);
			users = query.list();
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return users;
	}

	@Override
	public User findByMainFrame(MainFrame mainFrame) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByName(String name) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findByOffice(String office) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
