package co.edu.udea.usi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.bl.TypeUserBL;
import co.edu.udea.usi.dao.TypeUserDAO;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.exception.UsiDaoException;

@Transactional
public class TypeUserBLImpl implements TypeUserBL {
	@Autowired
	private TypeUserDAO typeUserDAO;
	
	@Override
	public List<TypeUser> findAllTypeUser() throws UsiDaoException {
		return typeUserDAO.findAllTypeUser();
	}

}
