package com.project.brainteaser.main;

import java.util.Date;

import org.hibernate.Session;

import com.project.brainteaser.entities.Answer;
import com.project.brainteaser.entities.Language;
import com.project.brainteaser.entities.Question;
import com.project.brainteaser.entities.Quiz;
import com.project.brainteaser.entities.Scorecard;
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
		question.setQuestionDescription("Can constructors be static?");
		
		Answer answer = new Answer(question, "A", "B", "C", "D", "B");
		
		Quiz quiz = new Quiz(user, new Date());
		Scorecard scorecard = new Scorecard(quiz, user, 75, "Good job!");
	
		session.save(user);
		session.save(language);
		session.save(question);
		session.save(answer);
		session.save(quiz);
		session.save(scorecard);
		
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
		
		
		
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//		session.beginTransaction();
//		List result = session.createQuery("from Quiz").list();
//		
//		
//		java.util.Iterator it = result.iterator();
//		while(it.hasNext()){
//		
//			Quiz a = (Quiz)it.next();
//			System.out.println(a.getUser().getFirstname());
//		}
//		
//		//session.getTransaction().commit();
//		HibernateUtil.getSessionFactory().close();

	}

}
