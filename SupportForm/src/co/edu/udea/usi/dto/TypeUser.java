package co.edu.udea.usi.dto;
// Generated Apr 27, 2018 3:29:35 PM by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para el almacenamiento y entrega de los atributos de un tipo de
 * usuario
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
@XmlRootElement
public class TypeUser implements java.io.Serializable {
	
	/**
	 * Código del tipo de usuario
	 */
	private int idTypeUser;
	
	/**
	 * Tipo de usuario
	 */
	private String name;

	public TypeUser() {
	}

	public TypeUser(int idTypeUser, String name) {
		this.idTypeUser = idTypeUser;
		this.name = name;
	}

	public int getIdTypeUser() {
		return this.idTypeUser;
	}

	public void setIdTypeUser(int idTypeUser) {
		this.idTypeUser = idTypeUser;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
