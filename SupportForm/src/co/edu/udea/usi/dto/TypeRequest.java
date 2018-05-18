package co.edu.udea.usi.dto;
// Generated Apr 27, 2018 3:29:35 PM by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para el almacenamiento y entrega de los atributos de un tipo de
 * solicitud
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
@XmlRootElement
public class TypeRequest implements java.io.Serializable {
	
	/**
	 * Código del tipo de la solicitud
	 */
	private Integer idTypeRequest;
	
	/**
	 * Tipo de solicitud
	 */
	private String name;

	public TypeRequest() {
	}

	public TypeRequest(Integer idTypeRequest, String name) {
		this.idTypeRequest = idTypeRequest;
		this.name = name;
	}

	public TypeRequest(String name) {
		this.name = name;
	}

	public Integer getIdTypeRequest() {
		return this.idTypeRequest;
	}

	public void setIdTypeRequest(Integer idTypeRequest) {
		this.idTypeRequest = idTypeRequest;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
