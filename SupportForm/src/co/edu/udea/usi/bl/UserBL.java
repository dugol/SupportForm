package co.edu.udea.usi.bl;

import java.util.List;

import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Interface que define los métodos de la lógica de negocio de User
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public interface UserBL {
	
	/**
	 * Hace la creación de un usuario en el sistema
	 * @param Información del usuario a crear
	 * @return Instancia del usuario creado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public User createUser(String email,String typeUser,String name, String office, String mainFrame, String phoneNumber, String password) throws UsiDaoException;
	
	/**
	 * Método que hace autentificación de un usuario
	 * @param Email y contraseña del usuario
	 * @return Instancia del usuario logueado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public User login(String email,String password)throws UsiDaoException;
	
	/**
	 * Hace la modificación de los datos de un usuario
	 * @param Recibe los nuevos datos que actualizarán el usuario
	 * @return Instancia del usuario modificado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public User modificateUser(String email,String typeUser,String name, String office, String mainFrame, String phoneNumber, String password) throws UsiDaoException;
	
	/**
	 * Hace el cambio de la contraseña de un usuario
	 * @param Email, contraseña antigua, nueva contraseña y confirmación de
	 * la nueva contraseña del usuario
	 * @return Instancia del usuario con la contraseña actualizada
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public User modificateUserPass(String email,String oldPassword, String newPassword,String newPassword2)throws UsiDaoException;
	
	/**
	 * Devuelve todos los usuarios del sistema
	 * @return Lista de usuarios
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<User> findAllUser() throws UsiDaoException;
	
	/**
	 * Devuelve un usuario según su email
	 * @param Email del usuario
	 * @return Instancia del usuario
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public User findByEmail(String email) throws UsiDaoException;
	
	/**
	 * Devuelve los usuarios asociados a un determinado tipo de usuario
	 * @param tipo de usuario
	 * @return Lista de usuarios
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<User> findByType(String typeUser) throws UsiDaoException;
	
	/**
	 * Devuelve un usuario asociado a un determinado equipo
	 * @param Serial del equipo
	 * @return Instancia del usuario
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public User findByMainFrame(String mainFrame) throws UsiDaoException;
	
	/**
	 * Devuelve un usuario según su nombre
	 * @param Nombre del usuario
	 * @return Instancia del usuario
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<User> findByName(String name) throws UsiDaoException;
	
	/**
	 * Devuelve los usuarios pertenecientes a una determinada oficina
	 * @param Oficina del usuario
	 * @return Lista de usuarios
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	public List<User> findByOffice(String office) throws UsiDaoException;
}
