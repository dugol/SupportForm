package co.edu.udea.usi.Rest;

import java.rmi.RemoteException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.udea.usi.bl.GeneralEventBL;
import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

@Path("generalEvent")
@Component
public class GeneralEventService {
	@Autowired
	private GeneralEventBL genenralEventBL;
	
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/save")
	public GeneralEvent createGeneralEvent(@QueryParam("idGEvent")int idGEvent,@QueryParam("request")Request request, @QueryParam("eventTime")String eventTime,@QueryParam("stockNumber")String stockNumber,@QueryParam("detail")String detail, @QueryParam("administrator")String administrator)throws RemoteException {
	
		GeneralEvent generalEvent=null;
		try {
			generalEvent=genenralEventBL.createGeneralEvent(idGEvent, request, eventTime, stockNumber, detail, administrator);
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return generalEvent;	
	}

}
