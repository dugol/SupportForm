package co.edu.udea.usi.bl;

import java.util.List;

import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.dto.TypeUser;
import co.edu.udea.usi.dto.User;
import co.edu.udea.usi.exception.UsiDaoException;

public interface UserBL {
	public User createUser(String email,String typeUser,String name, String office, String mainFrame, String phoneNumber, String password) throws UsiDaoException;
	public User login(String email,String password)throws UsiDaoException;
	public User modificateUser(String email,String typeUser,String name, String office, String mainFrame, String phoneNumber, String password) throws UsiDaoException;
	public User modificateUserPass(String email,String oldPassword, String newPassword,String newPassword2)throws UsiDaoException;
	public List<User> findAllUser() throws UsiDaoException;
	public User findByEmail(String email) throws UsiDaoException;
	public List<User> findByType(String typeUser) throws UsiDaoException;
	public User findByMainFrame(String mainFrame) throws UsiDaoException;
	public User findByName(String name) throws UsiDaoException;
	public List<User> findByOffice(String office) throws UsiDaoException;
}
