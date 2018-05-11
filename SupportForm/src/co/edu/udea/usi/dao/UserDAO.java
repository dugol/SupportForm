package co.edu.udea.usi.dao;

import java.util.List;

import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Interface que define los metodos que va a proveer el dao de User
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public interface UserDAO {
	
	/**
	 * Inserta un nuevo usuario a la base de datos
	 * @param Usuario a ser creado
	 * @return Instancia del usuario creado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public User createUser(User user) throws UsiDaoException;
	
	/**
	 * Modifica un registro de usuario en la base de datos
	 * @param Usuario a ser modificado
	 * @return Instancia del usuario modificado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public User modificateUser(User user) throws UsiDaoException;
	
	/**
	 * Entrega todos los usuarios que hay en la base de datos
	 * @return Lista de usuarios
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<User> findAllUser() throws UsiDaoException;
	
	/**
	 * Entrega un usuario según su email
	 * @param correo electrónico del usuario
	 * @return Instancia del usuario
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public User findByEmail(String email)throws UsiDaoException;
	
	/**
	 * Entrega los usuarios de un tipo en particular
	 * @param Tipo de usuario
	 * @return Lista de usuarios
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<User> findByType(TypeUser typeUser)throws UsiDaoException;
	
	/**
	 * Entrega el usuario asociado a un equipo
	 * @param Equipo asociado
	 * @return Instancia del usuario
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public User findByMainFrame(MainFrame mainFrame)throws UsiDaoException;
	
	/**
	 * Entrega una solicitud según su nombre
	 * @param Nombre del usuario
	 * @return Instancia del usuario
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<User> findByName(String name)throws UsiDaoException;
	
	/**
	 * Entrega usuarios asociados a una oficina
	 * @param Oficina asociada
	 * @return Lista de usuarios
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<User> findByOffice(String office)throws UsiDaoException;
}
