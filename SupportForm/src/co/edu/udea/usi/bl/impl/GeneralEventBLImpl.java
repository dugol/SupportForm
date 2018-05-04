package co.edu.udea.usi.bl.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.usi.bl.GeneralEventBL;
import co.edu.udea.usi.dao.GeneralEventDAO;
import co.edu.udea.usi.dao.MainFrameDAO;
import co.edu.udea.usi.dao.RequestDAO;
import co.edu.udea.usi.dto.GeneralEvent;
import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.dto.Request;
import co.edu.udea.usi.exception.UsiDaoException;
import co.edu.udea.usi.util.validations.Validaciones;

public class GeneralEventBLImpl implements GeneralEventBL {
	@Autowired
	RequestDAO requestDAO;

	@Autowired
	MainFrameDAO mainFrameDAO;

	@Autowired
	GeneralEventDAO generalEventDAO;

	@Override
	public GeneralEvent createGeneralEvent(int idGEvent, Request request, Date date, String eventTime,
			String stockNumber, String detail, String administrator) throws UsiDaoException {

		Request request1 = null;

		request1 = requestDAO.findById(request.getIdRequest());
		if (request1 == null) {
			throw new UsiDaoException("El evento debe pertenecer a una solicitud");
		}
		if (Validaciones.isTextoVacio(eventTime)) {
			throw new UsiDaoException("el evento debe tener una hora asignada");
		}
		if (Validaciones.isTextoVacio(stockNumber)) {
			throw new UsiDaoException("el evento debe estar relacionado con algún equipo");
		}
		if (Validaciones.isTextoVacio(administrator)) {
			throw new UsiDaoException("el evento debe haber sido realizado por un administrador");
		}
		if (Validaciones.isTextoVacio(detail)) {
			throw new UsiDaoException("el evento debe tener una descripcion");
		}
		if (date == null) {
			throw new UsiDaoException("La fecha no puede ser un objeto nulo");
		}
		GeneralEvent generalEvent = new GeneralEvent(request, date, eventTime, stockNumber, detail, administrator);
		generalEventDAO.createGeneralEvent(generalEvent);

		return generalEvent;
	}

	@Override
	public GeneralEvent ModificateGeneralEvent(int idGEvent, Request request, Date date, String eventTime,
			String stockNumber, String detail, String administrator) throws UsiDaoException {
		Request request1 = null;

		request1 = requestDAO.findById(request.getIdRequest());
		if (request1 == null) {
			throw new UsiDaoException("El evento debe pertenecer a una solicitud");
		}
		if (Validaciones.isTextoVacio(eventTime)) {
			throw new UsiDaoException("el evento debe tener una hora asignada");
		}
		if (Validaciones.isTextoVacio(stockNumber)) {
			throw new UsiDaoException("el evento debe estar relacionado con algún equipo");
		}
		if (Validaciones.isTextoVacio(administrator)) {
			throw new UsiDaoException("el evento debe haber sido realizado por un administrador");
		}
		if (Validaciones.isTextoVacio(detail)) {
			throw new UsiDaoException("el evento debe tener una descripcion");
		}
		if (date == null) {
			throw new UsiDaoException("La fecha no puede ser un objeto nulo");
		}
		GeneralEvent generalEvent = new GeneralEvent(request, date, eventTime, stockNumber, detail, administrator);
		generalEventDAO.createGeneralEvent(generalEvent);

		return generalEvent;
	}

	@Override
	public List<GeneralEvent> findAllGeneralEvent() throws UsiDaoException {
		List<GeneralEvent> generalEvents=new ArrayList<GeneralEvent>();
		generalEvents=generalEventDAO.findAllGeneralEvent();
		return generalEvents;
	}

	@Override
	public List<GeneralEvent> findByRequest(Request request) throws UsiDaoException {
		if(request==null) {
			throw new UsiDaoException("La solicitud debe ser diferente de nula");
		}
		Request request1=requestDAO.findById(request.getIdRequest());
		if(request1==null) {
			throw new UsiDaoException("La solicitud ser válida");
		}
		List<GeneralEvent> generalEvents=new ArrayList<GeneralEvent>();
		generalEvents=generalEventDAO.findByRequest(request);
		return generalEvents;
	}

	@Override
	public List<GeneralEvent> findByAdmin(String admin) throws UsiDaoException {
		if(Validaciones.isTextoVacio(admin)) {
			throw new UsiDaoException("El administrador es un campo requerido");
		}
		List<GeneralEvent> generalEvents=new ArrayList<GeneralEvent>();
		generalEvents=generalEventDAO.findByAdmin(admin);
		return generalEvents;
	}

	@Override
	public List<GeneralEvent> findByDate(Date date) throws UsiDaoException {
		if(date==null) {
			throw new UsiDaoException("La fecha debe ser diferente de nula");
		}
		List<GeneralEvent> generalEvents=new ArrayList<GeneralEvent>();
		generalEvents=generalEventDAO.findByDate(date);
		return generalEvents;
	}

	@Override
	public List<GeneralEvent> findByStockNumber(String stockNumber) throws UsiDaoException {
		if(Validaciones.isTextoVacio(stockNumber)) {
			throw new UsiDaoException("el numero de inventario debe ser diferente de null");
			
		}
		List<GeneralEvent> generalEvents=new ArrayList<GeneralEvent>();
		generalEvents=generalEventDAO.findByStockNumber(stockNumber);
		return generalEvents;
		
	}

}
