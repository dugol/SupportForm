package co.edu.udea.usi.Rest;

import java.rmi.RemoteException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.udea.usi.bl.TypeRequestBL;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.exception.UsiDaoException;



@Path("typeRequest")
@Component
public class TypeRequestService {
	@Autowired
	private TypeRequestBL typeRequestBl;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<TypeRequest> findAllTypeRequest() throws RemoteException{
		List<TypeRequest> typeRequests=null;
		try {
			typeRequests=typeRequestBl.findAllTypeRequest();
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return typeRequests;
				
	}

}
