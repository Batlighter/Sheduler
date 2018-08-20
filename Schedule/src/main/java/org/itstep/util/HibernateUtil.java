package org.itstep.util;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.itstep.model.Task;
import org.itstep.model.User;
import org.springframework.stereotype.Component;

@Component
public class HibernateUtil {

	private final SessionFactory sessionFactory = configureSessionFactory();

	/**
	 * Create SessionFactory
	 * 
	 * @return {@link SessionFactory}
	 * @throws HibernateException
	 */
	private SessionFactory configureSessionFactory() throws HibernateException {

		Configuration configuration = new Configuration();
		
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Task.class);


		return configuration.buildSessionFactory();

	}

	/**
	 * Get SessionFactory
	 * 
	 * @return {@link SessionFactory}
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}