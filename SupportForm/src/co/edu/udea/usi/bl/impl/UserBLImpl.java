package co.edu.udea.usi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.usi.bl.UserBL;
import co.edu.udea.usi.dao.TypeUserDAO;
import co.edu.udea.usi.dao.UserDAO;
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
	
	private final String MENSAJE_AUTENTICA = "Usuario y/o contraseña inválida";

	@Override
	public User createUser(String email, String typeUser, String name, String office, String mainFrame,
			String phoneNumber, String password) throws UsiDaoException {
		User user = null;
		return null;
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
		// TODO Auto-generated method stub
		return null;
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
		return userDAO.findByEmail(email);
	}

	@Override
	public List<User> findByType(String typeUser) throws UsiDaoException {
		TypeUser typeUser1 = null;
		typeUser1 = typeUserDAO.findByName(typeUser);
		if(typeUser1 == null){
			throw new UsiDaoException("Tipo de usuario inválido");
		}
		return userDAO.findByType(typeUser1);
	}

	@Override
	public User findByMainFrame(String mainFrame) throws UsiDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByName(String name) throws UsiDaoException {
		return userDAO.findByName(name);
	}

	@Override
	public List<User> findByOffice(String office) throws UsiDaoException {
		return userDAO.findByOffice(office);
	}

}
