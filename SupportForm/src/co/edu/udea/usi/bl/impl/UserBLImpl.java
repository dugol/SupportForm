package co.edu.udea.usi.bl.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.bl.UserBL;
import co.edu.udea.usi.dao.MainFrameDAO;
import co.edu.udea.usi.dao.TypeUserDAO;
import co.edu.udea.usi.dao.UserDAO;
import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;
import co.edu.udea.usi.util.validations.Validaciones;

@Transactional
public class UserBLImpl implements UserBL {
	@Autowired
	private UserDAO userDAO;	
	@Autowired
	private TypeUserDAO typeUserDAO;
	@Autowired
	private MainFrameDAO mainFrameDAO;
	
	private final String MENSAJE_AUTENTICA = "Usuario y/o contraseña inválida";

	@Override
	public User createUser(String email, String typeUser, String name, String office, String mainFrame,
			String phoneNumber, String password) throws UsiDaoException {
		User user = null;
		TypeUser typeUser1 = null;
		MainFrame mainFrame1 = null;
		if(!Validaciones.isEmail(email)) {
			throw new UsiDaoException("El email debe tener el formato correcto");
		}
		user = userDAO.findByEmail(email);
		if(user!=null){
			throw new UsiDaoException("Correo ya existente en sistema");
		}
		if(Validaciones.isTextoVacio(typeUser)) {
			throw new UsiDaoException("El tipo de usuario no puede ser vacío");
		}
		if(Validaciones.isTextoVacio(name)) {
			throw new UsiDaoException("El nombre no puede ser vacío");
		}
		if(Validaciones.isTextoVacio(office)) {
			throw new UsiDaoException("La oficina no puede ser vacío");
		}
		if(Validaciones.isTextoVacio(mainFrame)) {
			throw new UsiDaoException("El equipo no puede ser vacío");
		}
		if(Validaciones.isTextoVacio(phoneNumber)) {
			throw new UsiDaoException("El teléfono no puede ser vacío");
		}
		if(Validaciones.isTextoVacio(password)) {
			throw new UsiDaoException("La contraseña no puede ser vacía");
		}
		typeUser1 = typeUserDAO.findByName(typeUser);
		mainFrame1 = mainFrameDAO.findBySerial(mainFrame);
		if(typeUser1 == null){
			throw new UsiDaoException("Tipo usuario inválido");
		}
		if(mainFrame1 == null){
			throw new UsiDaoException("Equipo inválido");
		}
		user = new User(email,mainFrame1,typeUser1,name,office,phoneNumber,password);
		return userDAO.createUser(user);
	}

	@Override
	public User login(String email, String password) throws UsiDaoException {
		User user = null;
		user = userDAO.findByEmail(email);
		if(Validaciones.isTextoVacio(email)) {
			throw new UsiDaoException(MENSAJE_AUTENTICA);
		}
		if(user==null){
			throw new UsiDaoException(MENSAJE_AUTENTICA);
		}
		if(!user.getPassword().equals(password)){
			throw new UsiDaoException(MENSAJE_AUTENTICA);
		}
		return user;
	}

	@Override
	public User modificateUser(String email,String typeUser,String name, String office, String mainFrame, String phoneNumber, String password) throws UsiDaoException {
		User user = null;
		TypeUser typeUser1 = null;
		MainFrame mainFrame1 = null;
		if(!Validaciones.isEmail(email)){
			throw new UsiDaoException("Usuario no autentificado");
		}
		user = userDAO.findByEmail(email);
		if(user==null){
			throw new UsiDaoException("Usuario no autentificado");
		}
		if(Validaciones.isTextoVacio(typeUser)) {
			throw new UsiDaoException("El tipo de usuario no puede ser vacío");
		}
		if(Validaciones.isTextoVacio(name)) {
			throw new UsiDaoException("El nombre no puede ser vacío");
		}
		if(Validaciones.isTextoVacio(office)) {
			throw new UsiDaoException("La oficina no puede ser vacío");
		}
		if(Validaciones.isTextoVacio(mainFrame)) {
			throw new UsiDaoException("El equipo no puede ser vacío");
		}
		if(Validaciones.isTextoVacio(phoneNumber)) {
			throw new UsiDaoException("El teléfono no puede ser vacío");
		}
		if(Validaciones.isTextoVacio(password)) {
			throw new UsiDaoException("La contraseña no puede ser vacía");
		}
		typeUser1 = typeUserDAO.findByName(typeUser);
		mainFrame1 = mainFrameDAO.findBySerial(mainFrame);
		if(typeUser1 == null){
			throw new UsiDaoException("Tipo usuario inválido");
		}
		if(mainFrame1 == null){
			throw new UsiDaoException("Equipo inválido");
		}
		user.setMainFrame(mainFrame1);
		user.setName(name);
		user.setOffice(office);
		user.setPassword(password);
		user.setPhoneNumber(phoneNumber);
		user.setTypeUser(typeUser1);
		return userDAO.modificateUser(user);
	}

	@Override
	public User modificateUserPass(String email, String oldPassword, String newPassword,String newPassword2) throws UsiDaoException {
		User user = null;
		user = userDAO.findByEmail(email);
		if(Validaciones.isTextoVacio(newPassword) || Validaciones.isTextoVacio(newPassword2)|| 
				Validaciones.isTextoVacio(oldPassword)){
			throw new UsiDaoException("Ninguno de los campos puede quedar vacío");
		}
		if(!user.getPassword().equals(oldPassword)){
			throw new UsiDaoException("Contraseña inválida");
		}
		if(!newPassword.equals(newPassword2)){
			throw new UsiDaoException("Las contraseñas no coinciden");
		}
		user.setPassword(newPassword);
		return userDAO.modificateUser(user);
	}

	@Override
	public List<User> findAllUser() throws UsiDaoException {
		return userDAO.findAllUser();
	}

	@Override
	public User findByEmail(String email) throws UsiDaoException {
		User user = null;
		if(Validaciones.isTextoVacio(email)){
			throw new UsiDaoException("El email no puede estar vacío");
		}
		user = userDAO.findByEmail(email);
		if(user == null){
			throw new UsiDaoException("Usuario no encontrado");
		}
		return user;
	}

	@Override
	public List<User> findByType(String typeUser) throws UsiDaoException {
		TypeUser typeUser1 = null;
		List<User> users = null;
		if(Validaciones.isTextoVacio(typeUser)){
			throw new UsiDaoException("El email no puede estar vacío");
		}
		typeUser1 = typeUserDAO.findByName(typeUser);
		if(typeUser1 == null){
			throw new UsiDaoException("Tipo de usuario inválido");
		}
		users = new ArrayList<User>();
		users = userDAO.findByType(typeUser1);
		if(users==null){
			throw new UsiDaoException("Usuario no encontrado");
		}
		return users;
	}

	@Override
	public User findByMainFrame(String mainFrame) throws UsiDaoException {
		MainFrame mainFrame1 = null;
		User user =null;
		if(Validaciones.isTextoVacio(mainFrame)){
			throw new UsiDaoException("El serial no puede estar vacío");
		}
		mainFrame1 = mainFrameDAO.findBySerial(mainFrame);
		if(mainFrame1 == null){
			throw new UsiDaoException("Serial inválido");
		}
		user = userDAO.findByMainFrame(mainFrame1);
		if(user==null){
			throw new UsiDaoException("Usuario no encontrado");
		}
		return user;
	}

	@Override
	public List<User> findByName(String name) throws UsiDaoException {
		List<User> users = null;
		if(Validaciones.isTextoVacio(name)){
			throw new UsiDaoException("El nombre no puede estar vacío");
		}
		users = new ArrayList<User>();
		users = userDAO.findByName(name);
		if(users == null){
			throw new UsiDaoException("Usuario no encontrado");
		}
		return users;
	}

	@Override
	public List<User> findByOffice(String office) throws UsiDaoException {
		List<User> users = null;
		if(Validaciones.isTextoVacio(office)){
			throw new UsiDaoException("La oficina no puede estar vacío");
		}
		users = new ArrayList<User>();
		users = userDAO.findByOffice(office);
		if(users == null){
			throw new UsiDaoException("Usuario no encontrado");
		}
		return users;
	}

}
