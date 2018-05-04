package co.edu.udea.usi.bl;

import java.util.List;

import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.exception.UsiDaoException;

public interface TypeUserBL {
	public List<TypeUser> findAllTypeUser() throws UsiDaoException;
}
