package co.edu.udea.usi.dto;
// Generated Apr 27, 2018 3:29:35 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;

/**
 * Clase para el almacenamiento y entrega de los atributos de un evento de modificación
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public class ModificationEvent implements java.io.Serializable {

	private Integer idMEvent;
	private Request request;
	private Date date;
	private String stockNumber;
	private String component;
	private String modificationType;
	private String serialNadded;
	private String serialNretired;
	private String observation;
	private String administrator;

	public ModificationEvent() {
	}

	public ModificationEvent(Request request) {
		this.request = request;
	}

	public ModificationEvent(Request request, Date date, String stockNumber, String component, String modificationType,
			String serialNadded, String serialNretired, String observation, String administrator) {
		this.request = request;
		this.date = date;
		this.stockNumber = stockNumber;
		this.component = component;
		this.modificationType = modificationType;
		this.serialNadded = serialNadded;
		this.serialNretired = serialNretired;
		this.observation = observation;
		this.administrator = administrator;
	}

	public Integer getIdMEvent() {
		return this.idMEvent;
	}

	public void setIdMEvent(Integer idMEvent) {
		this.idMEvent = idMEvent;
	}

	public Request getRequest() {
		return this.request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStockNumber() {
		return this.stockNumber;
	}

	public void setStockNumber(String stockNumber) {
		this.stockNumber = stockNumber;
	}

	public String getComponent() {
		return this.component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getModificationType() {
		return this.modificationType;
	}

	public void setModificationType(String modificationType) {
		this.modificationType = modificationType;
	}

	public String getSerialNadded() {
		return this.serialNadded;
	}

	public void setSerialNadded(String serialNadded) {
		this.serialNadded = serialNadded;
	}

	public String getSerialNretired() {
		return this.serialNretired;
	}

	public void setSerialNretired(String serialNretired) {
		this.serialNretired = serialNretired;
	}

	public String getObservation() {
		return this.observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getAdministrator() {
		return this.administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

}
