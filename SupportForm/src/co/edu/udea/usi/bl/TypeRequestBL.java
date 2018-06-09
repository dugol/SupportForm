package co.edu.udea.usi.bl;

import java.util.List;

import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Interface que define los m茅todos de la l贸gica de negocio de TypeRequest
 * @author Ra煤l Andr茅s G贸mez Ram铆rez - raul.gomezr
 */
public interface TypeRequestBL {
	
	/**
	 * Devuelve todos los tipos de solicitudes
	 * @return Lista de tipos de solicitud
	 * @throws UsiDaoException Ocurre un error con la conexi贸n.
	 */
	public List<TypeRequest> findAllTypeRequest() throws UsiDaoException;
	
	/**
	 * Devuelve un tipo de solicitud seg鷑 su nombre
	 * @return Instancia del tipo de solicitud
	 * @throws UsiDaoException Ocurre un error con la conexi贸n.
	 */
	public TypeRequest findByName(String name) throws UsiDaoException;
}
