package co.edu.udea.usi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.usi.dao.MainFrameDAO;
import co.edu.udea.usi.dto.MainFrame;
import co.edu.udea.usi.exception.UsiDaoException;

public class MainFrameDAOImpl extends HibernateDaoSupport implements MainFrameDAO {

	public MainFrameDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public MainFrame createMainFrame(MainFrame mainFrame) throws UsiDaoException {
		Session session = null;
		try {
			session = this.getSessionFactory().getCurrentSession();
			session.save(mainFrame);
		} catch (HibernateException e) {
			throw new UsiDaoException(e);
		}

		return mainFrame;
	}

	@Override
	public MainFrame modificateMainFrame(MainFrame mainFrame) throws UsiDaoException {
		Session session = null;
		try {
			session = this.getSessionFactory().getCurrentSession();
			session.update(mainFrame);
		} catch (HibernateException e) {
			throw new UsiDaoException(e);
		}

		return mainFrame;
	}

	@Override
	public List<MainFrame> findAllMainFrame() throws UsiDaoException {
		Session session=null;
		List<MainFrame> mainFrames=null;
		try {
			session=this.getSessionFactory().getCurrentSession();
			mainFrames=new ArrayList<MainFrame>();
			Criteria criteria=session.createCriteria(MainFrame.class);
			mainFrames=criteria.list();
			
		}catch(HibernateException e){
			throw new UsiDaoException(e);
		}
		return mainFrames;
	}

	@Override
	public MainFrame findBySerial(String serialNumber) throws UsiDaoException {
		MainFrame mainFrame = null;
		Session session = null;
		try{
			session = this.getSessionFactory().getCurrentSession();
			mainFrame = (MainFrame) session.get(MainFrame.class,serialNumber);
			}catch(HibernateException e){
				throw new UsiDaoException(e);
			}
		return mainFrame;
	}

}
