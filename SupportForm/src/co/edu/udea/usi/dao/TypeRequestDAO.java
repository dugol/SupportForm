package co.edu.udea.usi.dao;

import java.util.List;

import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Interface que define los metodos que va a proveer el dao de TypeRequest
 * @author Ra煤l Andr茅s G贸mez Ram铆rez - raul.gomezr
 */
public interface TypeRequestDAO {
	
	/**
	 * Inserta un nuevo tipo de solicitud a la base de datos
	 * @param Tipo de solicitud a ser creada
	 * @return Instancia del tipo de solicitud creado
	 * @throws UsiDaoException Ocurre un error con la conexi贸n.
	 */
	public TypeRequest createTypeRequest(TypeRequest typeRequest) throws UsiDaoException;
	
	/**
	 * Modifica un tipo de solicitud en la base de datos
	 * @param Tipo de solicitud a ser modificada
	 * @return Instancia del tipo de solicitud modificada
	 * @throws UsiDaoException Ocurre un error con la conexi贸n.
	 */
	public TypeRequest modificateTypeRequest(TypeRequest typeRequest) throws UsiDaoException;
	
	/**
	 * Entrega todos los tipos de solicitudes que hay en la base de datos
	 * @return Lista de tipos de solicitudes
	 * @throws UsiDaoException Ocurre un error con la conexi贸n.
	 */
	public List<TypeRequest> findAllTypeRequest() throws UsiDaoException;
	
	/**
	 * Entrega un tipo de solicitud seg鷑 su nombre
	 * @return Instancia del tipo de solicitud encontrado seg鷑 el par醡etro
	 * @throws UsiDaoException Ocurre un error con la conexi贸n.
	 */
	public TypeRequest findByName(String name)throws UsiDaoException;

}
