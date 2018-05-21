package co.edu.udea.usi.Rest;

import java.rmi.RemoteException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.udea.usi.bl.TypeUserBL;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.exception.UsiDaoException;

@Path("typeUser")
@Component
public class TypeUserService {

	@Autowired
	private TypeUserBL typeUserBl;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<TypeUser> findAllTypeUser() throws RemoteException{
		List<TypeUser> typeUsers=null;
		try {
			typeUsers=typeUserBl.findAllTypeUser();
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return typeUsers;
	}
}
