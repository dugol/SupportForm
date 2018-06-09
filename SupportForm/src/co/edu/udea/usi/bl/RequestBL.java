package co.edu.udea.usi.bl;

import java.util.Date;
import java.util.List;

import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * interface de la logica de negocio de request.
 * @author Daniel Uribe Giraldo
 *
 */
public interface RequestBL {
	
	/**
	 * metodo encargado de crear una nueva solicitud.
	 * @param idRequest identificador de la solicitud.
	 * @param date fecha de la solicitud.
	 * @param eventTime hora de la solicitud
	 * @param user usuario quien realiza la solicitud
	 * @param office oficina de quien realiza la solicitud
	 * @param description descripcion de la solicitud
	 * @param type tipo de solicitud(incidente,cambio,información)
	 * @param channel canal por el que se realiza la solicitud(pagina web, personal, telefonico,correo)
	 * @param priority prioridad del caso, asignada por algun administrador.
	 * @param level nivel de la solicitud (N1 auxiliares, N2 jefes)
	 * @param state estado de la solicitud
	 * @return retorna la solicitud guardada.
	 * @throws UsiDaoException manejo de exccepciones.
	 */
	public Request createRequest(Date date,String eventTime,User user,String office,String description,TypeRequest typeRequest,String channel,int priority, int level,char state) throws UsiDaoException;

	
	/**
	 * metodo encargado de modificar una solicitud.
	 * @param idRequest identificador de la solicitud.
	 * @param date fecha de la solicitud.
	 * @param eventTime hora de la solicitud
	 * @param user usuario quien realiza la solicitud
	 * @param office oficina de quien realiza la solicitud
	 * @param description descripcion de la solicitud
	 * @param type tipo de solicitud(incidente,cambio,información)
	 * @param channel canal por el que se realiza la solicitud(pagina web, personal, telefonico,correo)
	 * @param priority prioridad del caso, asignada por algun administrador.
	 * @param level nivel de la solicitud (N1 auxiliares, N2 jefes)
	 * @param state estado de la solicitud
	 * @return retorna la solicitud guardada.
	 * @throws UsiDaoException manejo de exccepciones.
	 */
	public Request modificateRequest(int idRequest,Date date,String eventTime,User user,String office,String description,TypeRequest typeRequest,String channel,int priority, int level,char state) throws UsiDaoException;
	/**
	 * metodo encargado de obtener todas las solicitudes.
	 * @return retorna todas las solicitudes del sistema.
	 * @throws UsiDaoException manejo de excepciones.
	 */
	public List<Request> findAllRequest() throws UsiDaoException;
	
	
	
}
