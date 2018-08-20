package org.itstep.dao;

import org.hibernate.Session;
import org.itstep.model.User;
import org.itstep.util.HibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	@Autowired
	HibernateUtil hiber;
	
	public User save(User user) {
		
		Session session = hiber.getSessionFactory().openSession();

		session.getTransaction().begin();

		session.saveOrUpdate(user);
		
		session.getTransaction().commit();

		session.close();
		
		if(getOne(user.getLogin())!= null) {
			return user;
		}
		
		return null;
	}
	
	public User getOne(String login) {
		
		Session session = hiber.getSessionFactory().openSession();

		session.getTransaction().begin();

		User user = session.get(User.class, login);
		
		session.getTransaction().commit();

		session.close();
		
		return user;
	}

	public void delete(User user) {
		
		Session session = hiber.getSessionFactory().openSession();

		session.getTransaction().begin();

		session.delete(user);

		session.getTransaction().commit();

		session.close();
	}

	
}
