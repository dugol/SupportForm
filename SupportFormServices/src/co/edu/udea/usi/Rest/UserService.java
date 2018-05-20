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

import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;
import co.edu.udea.usi.bl.UserBL;

@Path("User")
@Component
public class UserService {
	
	@Autowired
	private UserBL userBL;
	
	@Produces(MediaType.TEXT_PLAIN)
	@POST
	@Path("/create")
	public String createUser(@QueryParam("email")String email,@QueryParam("typeUser")String typeUser,
			@QueryParam("name")String name,@QueryParam("office")String office,@QueryParam("mainFrame")String mainFrame,
			@QueryParam("phoneNumber")String phoneNumber,@QueryParam("password")String password)throws RemoteException{
		try{
			userBL.createUser(email, typeUser, name, office, mainFrame, phoneNumber, password);
		}catch(UsiDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return "";
	}
	
	@Produces(MediaType.TEXT_PLAIN)
	@POST
	@Path("/login")
	public String login(@QueryParam("email")String email,@QueryParam("password")String password)throws RemoteException{
		try{
			userBL.login(email, password);
		}catch(UsiDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return "";
	}
	
	@Produces(MediaType.TEXT_PLAIN)
	@POST
	@Path("/modificate")
	public String modificateUser(@QueryParam("email")String email,@QueryParam("typeUser")String typeUser,
			@QueryParam("name")String name,@QueryParam("office")String office,@QueryParam("mainFrame")String mainFrame,
			@QueryParam("phoneNumber")String phoneNumber,@QueryParam("password")String password)throws RemoteException{
		try{
			userBL.modificateUser(email, typeUser, name, office, mainFrame, phoneNumber, password);
		}catch(UsiDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return "";
	}
	
	@Produces(MediaType.TEXT_PLAIN)
	@POST
	@Path("/modificatePass")
	public String modificateUserPass(@QueryParam("email")String email,@QueryParam("oldPassword")String oldPassword,
			@QueryParam("newPassword")String newPassword,@QueryParam("newPassword2")String newPassword2)throws RemoteException{
		try{
			userBL.modificateUserPass(email, oldPassword, newPassword, newPassword2);
		}catch(UsiDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return "";
	}
	
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
