package co.edu.udea.usi.dao;

import java.util.Date;
import java.util.List;

import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Interface que define los metodos que va a proveer el dao de Request
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public interface RequestDAO {
	
	/**
	 * Inserta una nueva solicitud a la base de datos
	 * @param SOlicitud a ser creada
	 * @return Instancia de la solicitud creada
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public Request createRequest(Request request) throws UsiDaoException;
	
	/**
	 * Modifica un registro de solicitud en la base de datos
	 * @param Solicitud a ser modificada
	 * @return Instancia de la solicitud modificada
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public Request modificateRequest(Request request) throws UsiDaoException;
	
	/**
	 * Entrega todas los solicitudes que hay en la base de datos
	 * @return Lista de solicitudes
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<Request> findAllRequest() throws UsiDaoException;
	
	/**
	 * Entrega todas las solicitudes realizadas en una determinada
	 * fecha
	 * @param Fecha asociada a las solicitudes
	 * @return Lista de solicitudes
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<Request> findByDate(Date date)throws UsiDaoException;
	
	/**
	 * Entrega una solicitud según su código
	 * @param código de la solicitud
	 * @return Instancia de la solicitud
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public Request findById(int idRequest)throws UsiDaoException;
	
	/**
	 * Elimina una solicitud determinada
	 * @param Solicitud a ser eliminada
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public void deleteRequest(Request request)throws UsiDaoException;
	
	/**
	 * Entrega una solicitud según su estado
	 * @param estado de la solicitud
	 * @return Lista de solicitudes
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<Request> findByState(char state)throws UsiDaoException;
	
	/**
	 * Entrega una solicitud según el solicitante
	 * @param solicitante
	 * @return Lista de solicitudes
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<Request> findByUser(User user)throws UsiDaoException;
}
