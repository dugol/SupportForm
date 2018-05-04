package co.edu.udea.usi.dao;

import java.util.List;

import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Interface que define los metodos que va a proveer el dao de TypeRequest
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public interface TypeRequestDAO {
	
	/**
	 * Inserta un nuevo tipo de solicitud a la base de datos
	 * @param Tipo de solicitud a ser creada
	 * @return Instancia del tipo de solicitud creado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public TypeRequest createTypeRequest(TypeRequest typeRequest) throws UsiDaoException;
	
	/**
	 * Modifica un tipo de solicitud en la base de datos
	 * @param Tipo de solicitud a ser modificada
	 * @return Instancia del tipo de solicitud modificada
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public TypeRequest modificateTypeRequest(TypeRequest typeRequest) throws UsiDaoException;
	
	/**
	 * Entrega todos los tipos de solicitudes que hay en la base de datos
	 * @return Lista de tipos de solicitudes
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<TypeRequest> findAllTypeRequest() throws UsiDaoException;

}
