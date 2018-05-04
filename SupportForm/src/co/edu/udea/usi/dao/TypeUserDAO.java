package co.edu.udea.usi.dao;

import java.util.List;

import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Interface que define los metodos que va a proveer el dao de TypeUser
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public interface TypeUserDAO {
	
	/**
	 * Inserta un nuevo tipo de usuario a la base de datos
	 * @param Tipo de usuario a ser creado
	 * @return Instancia del tipo de usuario creado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public TypeUser createTyperUser(TypeUser typeUser) throws UsiDaoException;
	
	/**
	 * Modifica un tipo de usuario en la base de datos
	 * @param Tipo de usuario a ser modificado
	 * @return Instancia del tipo de usuario modificado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public TypeUser modificateTypeUser(TypeUser typeUser) throws UsiDaoException;
	
	/**
	 * Entrega todos los tipos de usuarios que hay en la base de datos
	 * @return Lista de tipos de usuarios
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<TypeUser> findAllTypeUser() throws UsiDaoException;
	
	/**
	 * Entrega el tipo de solicitud según su nombre
	 * @param Nombre del tipo de solicitud
	 * @return Instancia del tipo de solicitud
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public TypeUser findByName(String name)throws UsiDaoException;
}
