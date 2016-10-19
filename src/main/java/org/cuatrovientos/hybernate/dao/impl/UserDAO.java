package org.cuatrovientos.hybernate.dao.impl;

import java.util.List;

import org.cuatrovientos.hybernate.manyToMany.HibernateSession;
import org.cuatrovientos.hybernate.manyToMany.dao.UserDAOInterface;
import org.cuatrovientos.hybernate.manyToMany.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDAO implements UserDAOInterface{

	public User selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    User user = (User) session.get(User.class, id);
	    
	    session.close();
	    return user;
	}

	public List<User> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<User> users = session.createQuery("from User").list();
	    
	    session.close();
	    return users;
	}

	public void insert(User user) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(user);
	         
	    session.getTransaction().commit();
	    session.close();
	}

	public void update(User user) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	 
	    session.beginTransaction();
	 
	    session.merge(user);
	 
	    session.getTransaction().commit();
	    session.close();
	}

	public void delete(User user) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(user);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
