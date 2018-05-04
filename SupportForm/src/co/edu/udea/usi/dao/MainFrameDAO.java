package co.edu.udea.usi.dao;

import java.util.List;

import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Interface que define los metodos que va a proveer el dao de MainFrame
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public interface MainFrameDAO {
	
	/**
	 * Inserta un nuevo equipo a la base de datos
	 * @param Equipo a ser creado
	 * @return Instancia del equipo Creado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public MainFrame createMainFrame(MainFrame mainFrame) throws UsiDaoException;
	
	/**
	 * Modifica un registro de equipo en la base de datos
	 * @param Equipo a ser modificado
	 * @return Instancia del equipo modificado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public MainFrame modificateMainFrame(MainFrame mainFrame) throws UsiDaoException;
	
	/**
	 * Entrega todos los equipos que hay en la base de datos
	 * @return Lista de equipos
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<MainFrame> findAllMainFrame() throws UsiDaoException;
	
	/**
	 * Entrega un equipo según su serial
	 * @return Instancia del equipo
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public MainFrame findBySerial(String serialNumber) throws UsiDaoException;
}
