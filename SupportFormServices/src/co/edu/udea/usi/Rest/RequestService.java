package co.edu.udea.usi.Rest;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.udea.usi.bl.RequestBL;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.dto.TypeRequest;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

/**
 * Clase que define todos los métodos de la lógica de servicios de Request
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */

@Path("Request")
@Component
public class RequestService {

	@Autowired 
	private RequestBL requestBL;
	
	/**
	 * Servicio que obtiene todas las solicitudes que hay en el sistema
	 * @return Arreglo de JSON con la información de todas las solicitudes
	 * @throws UsiDaoException Ocurre un error con la conexiÃ³n.
	 */
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

	/**
	 * Servicio que hace la creación de una solicitud en el sistema
	 * @param Información de la solicitud a crear
	 * @return JSON con la información de la solicitud creada
	 * @throws UsiDaoException Ocurre un error con la conexiÃ³n.
	 */
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	@Path("/create")
	public Request createRequest(@QueryParam("idRequest")int idRequest,@QueryParam("date")Date date, @QueryParam("eventTime")String eventTime,
			@QueryParam("user") User user,@QueryParam("office")String office,@QueryParam("description")String description,
			@QueryParam("typeRequest") TypeRequest typeRequest,@QueryParam("channel") String channel, @QueryParam("priority")int priority,
			@QueryParam("level")int level,@QueryParam("state") char state)throws RemoteException{
			Request request = null;
		try{
			request = requestBL.createRequest(idRequest, date, eventTime, user, office, description, typeRequest, channel, priority, level, state);
		}catch(UsiDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return request;
	}
	
	/**
	 *Servicio que hace la modificación de una solicitud en el sistema
	 * @param Información a modificar de la solicitud
	 * @return JSON con la información de la solicitud modificada
	 * @throws UsiDaoException Ocurre un error con la conexiÃ³n.
	 */
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@POST
	@Path("/modificate")
	public Request modificateRequest(@QueryParam("idRequest")int idRequest,@QueryParam("date")Date date, @QueryParam("eventTime")String eventTime,
			@QueryParam("user") User user,@QueryParam("office")String office,@QueryParam("description")String description,
			@QueryParam("typeRequest") TypeRequest typeRequest,@QueryParam("channel") String channel, @QueryParam("priority")int priority,
			@QueryParam("level")int level,@QueryParam("state") char state)throws RemoteException{
			Request request = null;
		try{
			request = requestBL.modificateRequest(idRequest, date, eventTime, user, office, description, typeRequest, channel, priority, level, state);
		}catch(UsiDaoException e){
			throw new RemoteException(e.getMessage());
		}
		return request;
	}
}
