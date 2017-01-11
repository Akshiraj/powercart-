package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.userDAO;
import com.niit.model.User;

@Repository("userdao")
public class userDAOImpl implements userDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public userDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * @Transactional public List<User> list() { // TODO Auto-generated method
	 * stub System.out.println("the list method is started"); return null; }
	 * 
	 * @Transactional public User get(String id) { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * @Transactional public User validate(String id, String password) { // TODO
	 * Auto-generated method stub String a="from user where id="+"" +id+ "" +
	 * "and" + "password=" + ""+ password +"";
	 * 
	 * return null; }
	 */

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void save(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		System.out.println("the save method is started and session is opened");
		Transaction tx = (Transaction) session.beginTransaction();
		session.saveOrUpdate(user);
		tx.commit();
		session.close();

	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void update(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		System.out.println("the update method is started and session is opened");
		Transaction tx = (Transaction) session.beginTransaction();
		session.update(user);
		tx.commit();
		session.close();
	}

}
