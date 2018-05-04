package co.edu.udea.usi.dao;

import java.util.List;

import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.exception.UsiDaoException;

public interface TypeUserDAO {
	public TypeUser createTyperUser(TypeUser typeUser) throws UsiDaoException;
	public TypeUser modificateTypeUser(TypeUser typeUser) throws UsiDaoException;
	public List<TypeUser> findAllTypeUser() throws UsiDaoException;
	public TypeUser findByName(String name)throws UsiDaoException;
}
