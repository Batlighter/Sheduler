package org.itstep.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.itstep.model.Task;
import org.itstep.util.HibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDAO {
	
	@Autowired
	HibernateUtil hiber;
	
	public Task save(Task task) {
		
		Session session = hiber.getSessionFactory().openSession();

		session.getTransaction().begin();

		session.saveOrUpdate(task);

		session.getTransaction().commit();

		session.close();

		if(getOne(task.getId()) != null) {
			return task;
		}
		
		return null;
	}
	
	public Task getOne(int id) {
		
		Session session = hiber.getSessionFactory().openSession();

		session.getTransaction().begin();

		Task task = session.get(Task.class, id);

		session.getTransaction().commit();

		session.close();

		return task;
	}
	
	public void delete(Task task) {
		
		Session session = hiber.getSessionFactory().openSession();

		session.getTransaction().begin();

		session.delete(task);

		session.getTransaction().commit();

		session.close();
	}
	
	public List<Task> findAllByDay(Date day){
		
		Session session = hiber.getSessionFactory().openSession();

		session.getTransaction().begin();

		Query query = session.createNativeQuery("SELECT * FROM TASKS WHERE TASK_DAY =:requested", Task.class);
		
		query.setParameter("requested", day);
		
		List<Task> tasks = query.getResultList();
		
		session.getTransaction().commit();

		session.close();
		
		return tasks;
		
	}
}
