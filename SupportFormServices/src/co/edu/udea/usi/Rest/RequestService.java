package co.edu.udea.usi.Rest;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.udea.usi.bl.RequestBL;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

@Path("Request")
@Component
public class RequestService {

	@Autowired 
	private RequestBL requestBL;
	
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	public List<Request> findAllRequest() throws RemoteException{
		List<Request> requests = null;
		try{
			requests = new ArrayList<Request>();
			requests = requestBL.findAllRequest();
		}catch(UsiDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return requests;
	}
	
}
