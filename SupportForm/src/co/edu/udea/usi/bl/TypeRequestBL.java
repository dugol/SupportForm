package co.edu.udea.usi.bl;

import java.util.List;

import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.exception.UsiDaoException;

public interface TypeRequestBL {
	public List<TypeRequest> findAllTypeRequest() throws UsiDaoException;
}
