package co.edu.udea.usi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.bl.TypeRequestBL;
import co.edu.udea.usi.dao.TypeRequestDAO;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.exception.UsiDaoException;

@Transactional
public class TypeRequestBLImpl implements TypeRequestBL {
	@Autowired
	private TypeRequestDAO typeRequestDAO;
	
	@Override
	public List<TypeRequest> findAllTypeRequest() throws UsiDaoException {
		return typeRequestDAO.findAllTypeRequest();
	}

}
