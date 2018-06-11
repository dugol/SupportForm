package co.edu.udea.usi.Rest;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.udea.usi.dto.LoginWS;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;
import co.edu.udea.usi.bl.UserBL;

/**
 * Clase que define todos los m�todos de la l�gica de servicios de User
 * @author Ra�l Andr�s G�mez Ram�rez - raul.gomezr
 */

@Path("User")
@Component
public class UserService {
	
	@Autowired
	private UserBL userBL;
	
	
	/**
	 * Servicio que hace la creaci�n de un usuario en el sistema
	 * @param Informaci�n del usuario a crear
	 * @return JSON con la informaci�n del usuario creado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	@Path("/create")
	public User createUser(@QueryParam("email")String email,@QueryParam("typeUser")String typeUser,
			@QueryParam("name")String name,@QueryParam("office")String office,@QueryParam("mainFrame")String mainFrame,
			@QueryParam("phoneNumber")String phoneNumber,@QueryParam("password")String password)throws RemoteException{
			User user = null;
		try{
			user = userBL.createUser(email, typeUser, name, office, mainFrame, phoneNumber, password);
		}catch(UsiDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return user;
	}
	
	/**
	 * Servicio que hace la validaci�n para el acceso de un usuario en el sistema
	 * @param email y contrase�a del usuario a loguearse
	 * @return JSON con la informaci�n del usuario logueado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/login")
	public User login(LoginWS login)throws RemoteException{
		User user = null;
		try{
			//System.out.println(login.getEmail());
			user = userBL.login(login.getEmail(), login.getPassword());
		}catch(UsiDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return user;
	}
	
	/**
	 *Servicio que hace la modificaci�n de un usuario en el sistema
	 * @param Informaci�n a modificar del usuario
	 * @return JSON con la informaci�n del usuario modificado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	@Path("/modificate")
	public User modificateUser(@QueryParam("email")String email,@QueryParam("typeUser")String typeUser,
			@QueryParam("name")String name,@QueryParam("office")String office,@QueryParam("mainFrame")String mainFrame,
			@QueryParam("phoneNumber")String phoneNumber,@QueryParam("password")String password)throws RemoteException{
			User user = null;
		try{
			user = userBL.modificateUser(email, typeUser, name, office, mainFrame, phoneNumber, password);
		}catch(UsiDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return user;
	}
	
	/**
	 * Servicio que hace la modificaci�n de la clave de un usuario
	 * @param email, contrase�a actual y contrase�a nueva de la cuenta del usuario
	 * @return JSON con la informaci�n del usuario al que se le ha modificado su clave
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	@Path("/modificatePass")
	public User modificateUserPass(@QueryParam("email")String email,@QueryParam("oldPassword")String oldPassword,
			@QueryParam("newPassword")String newPassword,@QueryParam("newPassword2")String newPassword2)throws RemoteException{
			User user = null;
		try{
			user = userBL.modificateUserPass(email, oldPassword, newPassword, newPassword2);
		}catch(UsiDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return user;
	}
	
	/**
	 * Servicio que obtiene todos los usuarios que hay en el sistema
	 * @return Arreglo de JSON con la informaci�n de todos los usuarios
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	public List<User> findAllUser()throws RemoteException{
		List<User> users = null;
		try {
			users = new ArrayList<User>();
			users =userBL.findAllUser();
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return users;
	}
	
	/**
	 * Servicio que hace la b�squeda de un usuario en el sistema seg�n su email
	 * @param email del usuario a encontrar
	 * @return JSON con la informaci�n del usuario encontrado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	@Path("/email")
	public User findByEmail(@QueryParam("email")String email)throws RemoteException{
		User user = null;
		try {
			user = userBL.findByEmail(email);
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return user;
	}
	
	/**
	 * Servicio que hace la b�squeda de uno o varios usuarios en el sistema seg�n su tipo de usuario
	 * @param tipo de usuario de los usuarios a encontrar
	 * @return Arreglo de JSON con la informaci�n de los usuarios encontrados
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	@Path("/typeUser")
	public List<User> findByType(@QueryParam("typeUser")String typeUser)throws RemoteException{
		List<User> users = null;
		try {
			users = new ArrayList<User>();
			users =userBL.findByType(typeUser);
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return users;
	}
	
	/**
	 * Servicio que hace la b�squeda de un usuario en el sistema seg�n su equipo
	 * @param serial del equipo del usuario a encontrar
	 * @return JSON con la informaci�n del usuario encontrado
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	@Path("/mainFrame")
	public User findByMainFrame(@QueryParam("mainFrame")String mainFrame)throws RemoteException{
		User user= null;
		try {
			user = userBL.findByMainFrame(mainFrame);
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return user;
	}
	
	/**
	 * Servicio que hace la b�squeda de un usuario en el sistema seg�n su nombre
	 * @param nombre de los usuarios a encontrar
	 * @return Arreglo de JSON con la informaci�n de los usuarios encontrados
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	@Path("/name")
	public List<User> findByName(@QueryParam("name")String name)throws RemoteException{
		List<User> users = null;
		try {
			users = new ArrayList<User>();
			users = userBL.findByName(name);
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return users;
	}
	
	/**
	 * Servicio que hace la b�squeda de uno o varios usuarios en el sistema seg�n su oficina
	 * @param oficina de los usuarios a encontrar
	 * @return Arreglo de JSON con la informaci�n de los usuarios encontrados
	 * @throws UsiDaoException Ocurre un error con la conexión.
	 */
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	@Path("/office")
	public List<User> findByOffice(@QueryParam("office")String office)throws RemoteException{
		List<User> users = null;
		try {
			users = new ArrayList<User>();
			users = userBL.findByOffice(office);
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return users;
	}
	
}
