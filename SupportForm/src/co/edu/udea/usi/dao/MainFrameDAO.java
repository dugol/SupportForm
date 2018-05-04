package co.edu.udea.usi.dao;

import java.util.List;

import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.exception.UsiDaoException;

public interface MainFrameDAO {
	public MainFrame createMainFrame(MainFrame mainFrame) throws UsiDaoException;
	public MainFrame modificateMainFrame(MainFrame mainFrame) throws UsiDaoException;
	public List<MainFrame> findAllMainFrame() throws UsiDaoException;
	public MainFrame findBySerial(String serialNumber) throws UsiDaoException;
}
