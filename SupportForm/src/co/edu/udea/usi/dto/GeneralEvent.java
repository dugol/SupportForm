package co.edu.udea.usi.dto;
// Generated Apr 27, 2018 3:29:35 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para el almacenamiento y entrega de los atributos de un evento general
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
@XmlRootElement
public class GeneralEvent implements java.io.Serializable {
	/**
	 * Código del evento
	 */
	private Integer idGEvent;
	
	/**
	 * Solicitud asociada al evento
	 */
	private Request request;
	
	/**
	 * Fecha del evento
	 */
	private Date date;
	
	/**
	 * Hora del evento
	 */
	private String eventTime;
	
	/**
	 * Codigo de inventario del equipo atendido
	 */
	private String stockNumber;
	
	/**
	 * Detalle del evento
	 */
	private String detail;
	
	/**
	 * Administrador que realiza el evento
	 */
	private String administrator;

	public GeneralEvent() {
	}

	public GeneralEvent(Request request) {
		this.request = request;
	}

	public GeneralEvent(Request request, Date date, String eventTime, String stockNumber, String detail,
			String administrator) {
		this.request = request;
		this.date = date;
		this.eventTime = eventTime;
		this.stockNumber = stockNumber;
		this.detail = detail;
		this.administrator = administrator;
	}

	public Integer getIdGEvent() {
		return idGEvent;
	}

	public void setIdGEvent(Integer idGEvent) {
		this.idGEvent = idGEvent;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(String stockNumber) {
		this.stockNumber = stockNumber;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getAdministrator() {
		return administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

}
