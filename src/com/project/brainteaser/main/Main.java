package com.project.brainteaser.main;

import org.hibernate.Session;

import com.project.brainteaser.entities.User;
import com.project.brainteaser.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		User user = new User("Vibhor","Jain",4.5);
	
		session.save(user);
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();

	}

}
