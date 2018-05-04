package co.edu.udea.usi.dto;
// Generated Apr 27, 2018 3:29:35 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;

/**
 * Clase para el almacenamiento y entrega de los atributos de un 
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public class SharedEvent implements java.io.Serializable {

	private Integer idSEvent;
	private Request request;
	private Date date;
	private String action;
	private String route;
	private String userType;
	private String stockNumber;
	private String user;
	private String office;
	private String administrator;

	public SharedEvent() {
	}

	public SharedEvent(Request request) {
		this.request = request;
	}

	public SharedEvent(Request request, Date date, String action, String route, String userType, String stockNumber,
			String user, String office, String administrator) {
		this.request = request;
		this.date = date;
		this.action = action;
		this.route = route;
		this.userType = userType;
		this.stockNumber = stockNumber;
		this.user = user;
		this.office = office;
		this.administrator = administrator;
	}

	public Integer getIdSEvent() {
		return this.idSEvent;
	}

	public void setIdSEvent(Integer idSEvent) {
		this.idSEvent = idSEvent;
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

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getStockNumber() {
		return this.stockNumber;
	}

	public void setStockNumber(String stockNumber) {
		this.stockNumber = stockNumber;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getAdministrator() {
		return this.administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

}
