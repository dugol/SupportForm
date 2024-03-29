package co.edu.udea.usi.dto;
// Generated Apr 27, 2018 3:29:35 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;

/**
 * Clase para el almacenamiento y entrega de los atributos de un evento de reembolso
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public class RefundEvent implements java.io.Serializable {

	private Integer idReEvent;
	private Date date;
	private String stockNumber;
	private String item;
	private Integer amount;
	private String reference;
	private String state;
	private String observation;

	public RefundEvent() {
	}

	public RefundEvent(Date date, String stockNumber, String item, Integer amount, String reference, String state,
			String observation) {
		this.date = date;
		this.stockNumber = stockNumber;
		this.item = item;
		this.amount = amount;
		this.reference = reference;
		this.state = state;
		this.observation = observation;
	}

	public Integer getIdReEvent() {
		return this.idReEvent;
	}

	public void setIdReEvent(Integer idReEvent) {
		this.idReEvent = idReEvent;
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

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getObservation() {
		return this.observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

}
