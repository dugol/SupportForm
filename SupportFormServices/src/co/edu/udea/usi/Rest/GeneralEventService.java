package co.edu.udea.usi.Rest;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import co.edu.udea.usi.bl.GeneralEventBL;
import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;

@Path("generalEvent")
@Component
public class GeneralEventService {
	@Autowired
	private GeneralEventBL generalEventBL;
	
	
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/save")
	public GeneralEvent createGeneralEvent(GeneralEvent generalEvent)throws RemoteException {
	
		//GeneralEvent generalEvent=null;
		try {
			System.out.println(generalEvent.getAdministrator());
			generalEvent=generalEventBL.createGeneralEvent(generalEvent.getIdGEvent(), generalEvent.getRequest(), generalEvent.getEventTime(), generalEvent.getStockNumber(), generalEvent.getDetail(), generalEvent.getAdministrator());
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return generalEvent;	
	}
	
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<GeneralEvent> findAllGeneralEvent() throws RemoteException{
		List<GeneralEvent> generalEvents=null;
		try {
			generalEvents=generalEventBL.findAllGeneralEvent();
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return generalEvents;
	}
	
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/admin")
	public List<GeneralEvent> findByAdmin(@QueryParam("admin")String admin) throws RemoteException{
		List<GeneralEvent> generalEvents=null;
		try {
			generalEvents=generalEventBL.findByAdmin(admin);
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return generalEvents;
	}
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/date")
	public List<GeneralEvent> findByDate(@QueryParam("date") Date date) throws RemoteException{
		List<GeneralEvent> generalEvents=null;
		try {
			generalEvents=generalEventBL.findByDate(date);
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return generalEvents;
	}
	
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/stockNumber")
	public List<GeneralEvent> findByStockNumber(@QueryParam("stockNumber")String stockNumber) throws RemoteException{
		List<GeneralEvent> generalEvents=null;
		try {
			generalEvents=generalEventBL.findByStockNumber(stockNumber);
		}catch(UsiDaoException e) {
			throw new RemoteException(e.getMessage());
		}
		return generalEvents;
	}

}
