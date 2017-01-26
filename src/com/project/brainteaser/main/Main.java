package com.project.brainteaser.main;

import org.hibernate.Session;

import com.project.brainteaser.entities.Language;
import com.project.brainteaser.entities.Question;
import com.project.brainteaser.entities.User;
import com.project.brainteaser.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		User user = new User("Vibhor","Jain",4.5);
		Language language = new Language("Java");
		Question question = new Question();
		question.setLevel("Easy");
		question.setLanguage(language);
		
	
		session.save(user);
		session.save(language);
		session.save(question);
		
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();

	}

}
