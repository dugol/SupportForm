package co.edu.udea.usi.dto;
// Generated Apr 27, 2018 3:29:35 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * Clase para el almacenamiento y entrega de los atributos de una solicitud
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
@XmlRootElement
public class Request implements java.io.Serializable {
	
	/**
	 * Código de la solicitud
	 */
	private Integer idRequest;
	
	/**
	 * Tipo de la solicitud
	 */
	private TypeRequest typeRequest;
	
	/**
	 * Usuario solicitante
	 */
	private User user;
	
	/**
	 * Fecha de la solicitud
	 */
	private Date date;
	
	/**
	 * Hora de la solicitud
	 */
	private String eventTime;
	
	/**
	 * Oficina del solicitante
	 */
	private String office;
	
	/**
	 * Descripción de la solicitud
	 */
	private String description;
	
	/**
	 * Canal de la solicitud
	 */
	private String channel;
	
	/**
	 * Prioridad de la solicitud
	 */
	private Integer priority;
	
	/**
	 * Nivel de la solicitud
	 */
	private Integer level;
	
	/**
	 * Estado de la solicitud
	 */
	private Character state;

	public Request() {
	}

	public Request(TypeRequest typeRequest, User user, Date date, String eventTime) {
		this.typeRequest = typeRequest;
		this.user = user;
		this.date = date;
		this.eventTime = eventTime;
	}

	public Request(TypeRequest typeRequest, User user, Date date, String eventTime, String office, String description,
			String channel, Integer priority, Integer level, Character state) {
		this.typeRequest = typeRequest;
		this.user = user;
		this.date = date;
		this.eventTime = eventTime;
		this.office = office;
		this.description = description;
		this.channel = channel;
		this.priority = priority;
		this.level = level;
		this.state = state;
	}

	public Integer getIdRequest() {
		return this.idRequest;
	}

	public void setIdRequest(Integer idRequest) {
		this.idRequest = idRequest;
	}

	public TypeRequest getTypeRequest() {
		return this.typeRequest;
	}

	public void setTypeRequest(TypeRequest typeRequest) {
		this.typeRequest = typeRequest;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEventTime() {
		return this.eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Character getState() {
		return this.state;
	}

	public void setState(Character state) {
		this.state = state;
	}

}
