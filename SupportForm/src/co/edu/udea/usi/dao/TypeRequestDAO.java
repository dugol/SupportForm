package co.edu.udea.usi.dao;

import java.util.List;

import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.exception.UsiDaoException;

public interface TypeRequestDAO {
	public TypeRequest createTypeRequest(TypeRequest typeRequest) throws UsiDaoException;
	public TypeRequest modificateTypeRequest(TypeRequest typeRequest) throws UsiDaoException;
	public List<TypeRequest> findAllTypeRequest() throws UsiDaoException;

}
