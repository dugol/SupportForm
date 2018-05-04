package co.edu.udea.usi.dto;
// Generated Apr 27, 2018 3:29:35 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;

/**
 * Clase para el almacenamiento y entrega de los atributos de un evento de mantenimiento
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public class MaintenanceEvent implements java.io.Serializable {

	private Integer idREvent;
	private Request request;
	private Date date;
	private String stockNumber;
	private String interventionType;
	private String firstState;
	private String firstObservation;
	private String process;
	private String finalState;
	private String finalObservation;
	private String administrator;

	public MaintenanceEvent() {
	}

	public MaintenanceEvent(Request request, String interventionType, String firstState, String firstObservation,
			String process, String finalState) {
		this.request = request;
		this.interventionType = interventionType;
		this.firstState = firstState;
		this.firstObservation = firstObservation;
		this.process = process;
		this.finalState = finalState;
	}

	public MaintenanceEvent(Request request, Date date, String stockNumber, String interventionType, String firstState,
			String firstObservation, String process, String finalState, String finalObservation, String administrator) {
		this.request = request;
		this.date = date;
		this.stockNumber = stockNumber;
		this.interventionType = interventionType;
		this.firstState = firstState;
		this.firstObservation = firstObservation;
		this.process = process;
		this.finalState = finalState;
		this.finalObservation = finalObservation;
		this.administrator = administrator;
	}

	public Integer getIdREvent() {
		return this.idREvent;
	}

	public void setIdREvent(Integer idREvent) {
		this.idREvent = idREvent;
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

	public String getInterventionType() {
		return this.interventionType;
	}

	public void setInterventionType(String interventionType) {
		this.interventionType = interventionType;
	}

	public String getFirstState() {
		return this.firstState;
	}

	public void setFirstState(String firstState) {
		this.firstState = firstState;
	}

	public String getFirstObservation() {
		return this.firstObservation;
	}

	public void setFirstObservation(String firstObservation) {
		this.firstObservation = firstObservation;
	}

	public String getProcess() {
		return this.process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getFinalState() {
		return this.finalState;
	}

	public void setFinalState(String finalState) {
		this.finalState = finalState;
	}

	public String getFinalObservation() {
		return this.finalObservation;
	}

	public void setFinalObservation(String finalObservation) {
		this.finalObservation = finalObservation;
	}

	public String getAdministrator() {
		return this.administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

}
