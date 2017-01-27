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
//		User user = new User("Vibhor","Jain",4.5);
		
		Language language = new Language("Java");
		Question question = new Question();
		question.setLevel("Easy");
		question.setLanguage(language);
		question.setQuestionDescription("Which one of these lists contains only Java programming language keywords?");
		Answer answer = new Answer(question, "class, if, void, long, Int, continue", "goto, instanceof, native, finally, default, throws", "try, virtual, throw, final, volatile, transient", "strictfp, constant, super, implements, do", "goto, instanceof, native, finally, default, throws");
		
//		Quiz quiz = new Quiz(user, new Date());
//		Scorecard scorecard = new Scorecard(quiz, user, 75, "Good job!");
	
//		session.save(user);
		session.save(language);
		session.save(question);
		session.save(answer);
//		session.save(quiz);
//		session.save(scorecard);
		
		
		
		Language language1 = new Language("Python");
		Question question1 = new Question();
		question1.setLevel("Moderate");
		question1.setLanguage(language1);
		question1.setQuestionDescription("What is the output of the following? print('for'.isidentifier())");
		Answer answer1 = new Answer(question1, "True", "False", "None", "Error", "True");
		
		session.save(language1);
		session.save(question1);
		session.save(answer1);
		
		
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
