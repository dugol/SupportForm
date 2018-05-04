package co.edu.udea.usi.bl;

import java.util.List;

import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Interface que define los métodos de la lógica de negocio de TypeUser
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public interface TypeUserBL {
	
	/**
	 * Devuelve todos los tipos de usuarios
	 * @return Lista de tipos de usuarios
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<TypeUser> findAllTypeUser() throws UsiDaoException;
}
