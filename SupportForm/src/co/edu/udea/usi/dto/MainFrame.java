package co.edu.udea.usi.dto;
// Generated Apr 27, 2018 3:29:35 PM by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Clase para el almacenamiento y entrega de los atributos de un equipo 
 * de cómputo
 * @author Raúl Andrés Gómez Ramírez - raul.gomezr
 */
public class MainFrame implements java.io.Serializable {
	
	/**
	 * Serial del equipo
	 */
	private String serialNumber;
	
	/**
	 * Código de inventario del equipo
	 */
	private String stockNumber;
	
	/**
	 * Referencia del equipo
	 */
	private String reference;
	
	/**
	 * Marca del equipo
	 */
	private String brand;
	
	/**
	 * Procesador del equipo
	 */
	private String processor;
	
	/**
	 * Memoria ram del equipo
	 */
	private int ram;
	
	/**
	 * Disco duro del equipo
	 */
	private String hardDrive;
	
	/**
	 * Tarjeta madre del equipo
	 */
	private String mainBoard;
	

	public MainFrame() {
	}

	public MainFrame(String serialNumber, String stockNumber, String reference, String brand, String processor, int ram,
			String hardDrive, String mainBoard) {
		this.serialNumber = serialNumber;
		this.stockNumber = stockNumber;
		this.reference = reference;
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.mainBoard = mainBoard;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getStockNumber() {
		return this.stockNumber;
	}

	public void setStockNumber(String stockNumber) {
		this.stockNumber = stockNumber;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProcessor() {
		return this.processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRam() {
		return this.ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getHardDrive() {
		return this.hardDrive;
	}

	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

	public String getMainBoard() {
		return this.mainBoard;
	}

	public void setMainBoard(String mainBoard) {
		this.mainBoard = mainBoard;
	}


}
