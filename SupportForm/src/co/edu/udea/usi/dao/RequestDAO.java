package co.edu.udea.usi.dao;

import java.util.Date;
import java.util.List;

import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

public interface RequestDAO {

	public Request createRequest(Request request) throws UsiDaoException;
	public Request modificateRequest(Request request) throws UsiDaoException;
	public List<Request> findAllRequest() throws UsiDaoException;
	public List<Request> findByDate(Date date)throws UsiDaoException;
	public Request findById(int idRequest)throws UsiDaoException;
	public void deleteRequest(Request request)throws UsiDaoException;
	public List<Request> findByState(char state)throws UsiDaoException;
	public List<Request> findByUser(User user)throws UsiDaoException;
}
