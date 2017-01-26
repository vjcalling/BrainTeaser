package com.project.brainteaser.main;

import java.util.List;

import org.hibernate.Session;

import com.project.brainteaser.entities.Answer;
import com.project.brainteaser.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
		
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//		session.beginTransaction();
//		User user = new User("Vibhor","Jain",4.5);
//		Language language = new Language("Java");
//		Question question = new Question();
//		question.setLevel("Easy");
//		question.setLanguage(language);
//		question.setQuestionDescription("Can constructors be static?");
//		
//		Answer answer = new Answer(question, "A", "B", "C", "D", "B");
//	
//		session.save(user);
//		session.save(language);
//		session.save(question);
//		session.save(answer);
//		
//		session.getTransaction().commit();
//		HibernateUtil.getSessionFactory().close();
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List result = session.createQuery("from Answer").list();
		
		
		java.util.Iterator it = result.iterator();
		while(it.hasNext()){
		
			Answer a = (Answer)it.next();
			System.out.println(a.getQuestion().getLanguage().getName());
		}
		
		//session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();

	}

}
