package org.cuatrovientos.hybernate.dao.impl;

import java.util.List;

import org.cuatrovientos.hybernate.manyToMany.HibernateSession;
import org.cuatrovientos.hybernate.manyToMany.dao.RoleDAOInterface;
import org.cuatrovientos.hybernate.manyToMany.models.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RoleDAO implements RoleDAOInterface{

	public Role selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Role role = (Role) session.get(Role.class, id);
	    
	    session.close();
	    return role;
	}

	public List<Role> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Role> roles = session.createQuery("from Role").list();
	    
	    session.close();
	    return roles;
	}

	public void insert(Role role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(role);
	         
	    session.getTransaction().commit();
	    session.close();
		
	}

	public void update(Role role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	 
	    session.beginTransaction();
	 
	    session.merge(role);
	 
	    session.getTransaction().commit();
	    session.close();
	}

	public void delete(Role role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(role);
	 
	    session.getTransaction().commit();
	    session.close();
	}
	
}
