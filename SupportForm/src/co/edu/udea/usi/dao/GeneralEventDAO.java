package co.edu.udea.usi.dao;

import java.util.Date;
import java.util.List;

import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Interface que define los metodos que va a proveer el dao de GeneralEvent
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 *
 */

public interface GeneralEventDAO {
	
	/**
	 * Inserta un nuevo evento a la base de datos
	 * @param Evento a ser creado
	 * @return Instancia del evento creado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public GeneralEvent createGeneralEvent(GeneralEvent generalEvent) throws UsiDaoException;
	
	/**
	 * Modifica un registro de evento en la base de datos
	 * @param Evento a ser modificado
	 * @return Instancia del evento modificado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public GeneralEvent modificateGeneralEvent(GeneralEvent generalEvent) throws UsiDaoException;
	
	/**
	 * Entrega todos los eventos generales que hay en la base de datos
	 * @return Lista de eventos
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<GeneralEvent> findAllGeneralEvent() throws UsiDaoException;
	
	/**
	 * Entrega todos los eventos generales asociados a una solicitud
	 * @param Solicitud asociada a los eventos
	 * @return Lista de eventos
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<GeneralEvent> findByRequest(Request request) throws UsiDaoException;
	
	/**
	 * Entrega todos los eventos generales realizados por un determinado
	 * administrador
	 * @param Administrador asociado a los eventos
	 * @return Lista de eventos
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<GeneralEvent> findByAdmin(String admin) throws UsiDaoException;;
	
	/**
	 * Entrega todos los eventos generales realizados en una determinada
	 * fecha
	 * @param Fecha asociada a los eventos
	 * @return Lista de eventos
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<GeneralEvent> findByDate(Date date) throws UsiDaoException;;
	
	/**
	 * Entrega todos los eventos generales realizados a un equipo en particular
	 * @param Código de inventario del equipo asociado a los eventos
	 * @return Lista de eventos
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<GeneralEvent> findByStockNumber(String stockNumber) throws UsiDaoException;
}
