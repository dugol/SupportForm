package co.edu.udea.usi.bl;

import java.util.List;

import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Interface que define los métodos de la lógica de negocio de TypeRequest
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public interface TypeRequestBL {
	
	/**
	 * Devuelve todos los tipos de solicitudes
	 * @return Lista de tipos de solicitud
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<TypeRequest> findAllTypeRequest() throws UsiDaoException;
}
