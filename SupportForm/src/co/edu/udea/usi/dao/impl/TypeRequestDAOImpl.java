package co.edu.udea.usi.dao.impl;

import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeRequest modificateTypeRequest(TypeRequest typeRequest) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeRequest> findAllTypeRequest() throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
