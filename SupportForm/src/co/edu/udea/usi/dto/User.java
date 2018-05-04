package co.edu.udea.usi.dto;
// Generated Apr 27, 2018 3:29:35 PM by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Clase para el almacenamiento y entrega de los atributos de un usuario
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public class User implements java.io.Serializable {
	
	/**
	 * Correo electrónico del usuario
	 */
	private String email;
	
	/**
	 * Equipo asociado al usuario
	 */
	private MainFrame mainFrame;
	
	/**
	 * TIpo de usuario
	 */
	private TypeUser typeUser;
	
	/**
	 * Nombre del usuario
	 */
	private String name;
	
	/**
	 * Oficina del usuario
	 */
	private String office;
	
	/**
	 * Teléfono del usuario
	 */
	private String phoneNumber;
	
	/**
	 * Contraseña del usuario
	 */
	private String password;

	public User() {
	}

	public User(String email, TypeUser typeUser, String name) {
		this.email = email;
		this.typeUser = typeUser;
		this.name = name;
	}

	public User(String email, MainFrame mainFrame, TypeUser typeUser, String name, String office, String phoneNumber,
			String password) {
		this.email = email;
		this.mainFrame = mainFrame;
		this.typeUser = typeUser;
		this.name = name;
		this.office = office;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MainFrame getMainFrame() {
		return this.mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public TypeUser getTypeUser() {
		return this.typeUser;
	}

	public void setTypeUser(TypeUser typeUser) {
		this.typeUser = typeUser;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
