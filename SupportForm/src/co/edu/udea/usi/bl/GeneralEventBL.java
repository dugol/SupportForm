package co.edu.udea.usi.bl;

import java.util.Date;
import java.util.List;

import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * 
 * @author Daniel Uribe Giraldo
 * Interface de la logica de negocio correspondiente a solicitud.
 */
public interface GeneralEventBL {
	

	/**
	 * Método encargado de crear una nueva solicitud.
	 * @param idGEvent identificador del evento
	 * @param request solicitud correspondiente al evento
	 * @param date fecha de la solicitud.
	 * @param eventTime hora de la solicitud
	 * @param stockNumber numero de inventario del equipo al que se le realizo la intervencion
	 * @param detail detalle de la intervención realizada
	 * @param administrator iniciales del administrador que realizo la intervencion
	 * @return retorna el evento general creado.
	 * @throws UsiDaoException
	 */
	public GeneralEvent createGeneralEvent(int idGEvent,Request request, String eventTime,String stockNumber,String detail, String administrator) throws UsiDaoException;
	/**
	 * Metodo encargado de modificar un evento general
	 * @param idGEvent identificador del evento
	 * @param request solicitud correspondiente al evento
	 * @param date fecha de la solicitud.
	 * @param eventTime hora de la solicitud
	 * @param stockNumber numero de inventario del equipo al que se le realizo la intervencion
	 * @param detail detalle de la intervención realizada
	 * @param administrator iniciales del administrador que realizo la intervencion
	 * @return retorna el evento general creado.
	 * @throws UsiDaoException Manejo de excepciones
	 */
	public GeneralEvent ModificateGeneralEvent(int idGEvent,Request request, Date date, String eventTime,String stockNumber,String detail, String administrator) throws UsiDaoException;
	/**
	 * 
	 * @return metodo encargado de obtener todos los eventos realizados.
	 * @throws UsiDaoException manejo de excepciones
	 */
	public List<GeneralEvent> findAllGeneralEvent() throws UsiDaoException;
	/**
	 * metodo encargado de obtener los eventos dado una solicitud.
	 * @param request solicitud.
	 * @return una lista con los eventos generados a una solicitud.
	 * @throws UsiDaoException manejo de excepciones.
	 */
	public List<GeneralEvent> findByRequest(Request request) throws UsiDaoException;
	/**
	 * metodo encargado de obtener los eventos dado un administrador.
	 * @param admin iniciales del administrador,
	 * @return retorna los eventos generales hechos por un administrador.
	 * @throws UsiDaoException manejo de excepciones.
	 */
	public List<GeneralEvent> findByAdmin(String admin) throws UsiDaoException;
	/**
	 * metodo encargado de obtener los eventos dado una fecha
	 * @param date fecha	
	 * @return retorna una lista con los eventos realizados en una fecha.
	 * @throws UsiDaoException manejo de excepciones.
	 */
	public List<GeneralEvent> findByDate(Date date) throws UsiDaoException;
	/**
	 * metodo encargado de obtener los eventos generales dado un codigo de inventario.
	 * @param stockNumber codigo de inventario.
	 * @return retorna una lista con los eventos generales realizados a un equipo con codigo de inventario proporcionado
	 * @throws UsiDaoException
	 */
	public List<GeneralEvent> findByStockNumber(String stockNumber) throws UsiDaoException;
	
}
