package co.edu.udea.usi.bl.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.bl.RequestBL;
import co.edu.udea.usi.dao.RequestDAO;
import co.edu.udea.usi.dao.UserDAO;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;
import co.edu.udea.usi.util.validations.Validaciones;

/**
 * Clase encargada de la logica de negocio de solicitudes.
 * @author Daniel Uribe Giraldo
 *
 */
@Transactional
public class RequestBLImpl implements RequestBL {

	@Autowired
	UserDAO userDAO;
	
	@Autowired
	RequestDAO requestDAO;
	
	@Override
	public Request createRequest(Date date, String eventTime, User user, String office,
			String description, TypeRequest typeRequest, String channel, int priority, int level, char state) throws UsiDaoException {
		
		User user1=null;
		user1=userDAO.findByEmail(user.getEmail());
		if(user1==null) {
			throw new UsiDaoException("Usuario inexistente");
		}
		if(Validaciones.isTextoVacio(eventTime)) {
			throw new UsiDaoException("la hora de la solicitud debe ser diferente de vacia");
		}
		if(Validaciones.isTextoVacio(channel)) {
			throw new UsiDaoException("el canal de la solicitud debe ser diferente de vacio");
		}
		if(Validaciones.isTextoVacio(description)) {
			throw new UsiDaoException("la descripcion de la solicitud no puede ser vacia");
		}
		if(date==null) {
			date=new Date();
		}
		if(user==null) {
			throw new UsiDaoException("El usuario que realiaza la solicitud debe ser diferente de nulo");
		}
		if(typeRequest==null) {
			throw new UsiDaoException("El tipo de solicitud no puede nulo");
		}
		Request request=new Request(typeRequest,user,date,eventTime,office,description,channel,priority,level,state);
		requestDAO.createRequest(request);
		return request;
		
		
	}

	
	@Override
	public Request modificateRequest(int idRequest, Date date, String eventTime, User user, String office,
			String description, TypeRequest typeRequest, String channel, int priority, int level, char state) throws UsiDaoException {
		
		User user1=null;
		user1=userDAO.findByEmail(user.getEmail());
		if(user1==null) {
			throw new UsiDaoException("Usuario inexistente");
		}
		if(Validaciones.isTextoVacio(eventTime)) {
			throw new UsiDaoException("la hora de la solicitud debe ser diferente de vacia");
		}
		if(Validaciones.isTextoVacio(channel)) {
			throw new UsiDaoException("el canal de la solicitud debe ser diferente de vacio");
		}
		if(Validaciones.isTextoVacio(description)) {
			throw new UsiDaoException("la descripcion de la solicitud no puede ser vacia");
		}
		if(date==null) {
			date=new Date();
		}
		if(user==null) {
			throw new UsiDaoException("El usuario que realiaza la solicitud debe ser diferente de nulo");
		}
		if(typeRequest==null) {
			throw new UsiDaoException("El tipo de solicitud no puede nulo");
		}
		Request request=new Request(typeRequest,user,date,eventTime,office,description,channel,priority,level,state);
		requestDAO.modificateRequest(request);
		return request;
	}

	@Override
	public List<Request> findAllRequest() throws UsiDaoException {
		List<Request> requestList=requestDAO.findAllRequest();
		return requestList;
	}




}
