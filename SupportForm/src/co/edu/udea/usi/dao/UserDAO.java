package co.edu.udea.usi.dao;

import java.util.List;

import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

public interface UserDAO {

	public User createUser(User user) throws UsiDaoException;
	public User modificateUser(User user) throws UsiDaoException;
	public List<User> findAllUser() throws UsiDaoException;
	public User findByEmail(String email)throws UsiDaoException;
	public List<User> findByType(TypeUser typeUser)throws UsiDaoException;
	public User findByMainFrame(MainFrame mainFrame)throws UsiDaoException;
	public User findByName(String name)throws UsiDaoException;
	public List<User> findByOffice(String office)throws UsiDaoException;
}
