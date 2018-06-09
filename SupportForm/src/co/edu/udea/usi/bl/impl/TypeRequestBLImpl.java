package co.edu.udea.usi.bl.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.bl.TypeRequestBL;
import co.edu.udea.usi.dao.TypeRequestDAO;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;
import co.edu.udea.usi.util.validations.Validaciones;

@Transactional
public class TypeRequestBLImpl implements TypeRequestBL {
	@Autowired
	private TypeRequestDAO typeRequestDAO;
	
	@Override
	public List<TypeRequest> findAllTypeRequest() throws UsiDaoException {
		return typeRequestDAO.findAllTypeRequest();
	}

	@Override
	public TypeRequest findByName(String name) throws UsiDaoException {
		TypeRequest typeRequest = null;
		if(Validaciones.isTextoVacio(name)){
			throw new UsiDaoException("El nombre no puede estar vacío");
		}
		typeRequest = typeRequestDAO.findByName(name);
		if(typeRequest == null){
			throw new UsiDaoException("Tipo de solicitud no encontrada");
		}
		return typeRequest;
	}

}
