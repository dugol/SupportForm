package co.edu.udea.usi.dao.impl;

import java.util.Date;
import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Request modificateRequest(Request request) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Request> findAllRequest() throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Request> findByDate(Date date) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Request findById(int idRequest) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRequest(Request request) throws UsiDaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Request> findByState(char state) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Request> findByUser(User user) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
