package com.project.brainteaser.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.project.brainteaser.entities.Language;
import com.project.brainteaser.entities.Question;
import com.project.brainteaser.entities.Quiz;
import com.project.brainteaser.entities.User;
import com.project.brainteaser.util.HibernateUtil;

public class Utilities {

//----------------------------------------------------------------------------------------------------------------
	
	public Quiz generateQuiz(User user, Set<Language> languages){

		Quiz quiz = new Quiz(user, new Date());
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Criteria cr = session.createCriteria(Question.class,"ques")
				.createAlias("ques.language","language")
				.add(Restrictions.eq("ques.level", user.getLevel()));
		
		Iterator<Language> it = languages.iterator();
		while(it.hasNext()){
				Language lang = (Language)it.next();
				cr.add(Restrictions.eq("language.name", lang.getName()));
		}
		
		
		List<Question> questions = cr.list();		
		
		Set<Question> questionSet = new HashSet<Question>();
		java.util.Iterator it1 = questions.iterator();
		while(it1.hasNext()){
			Question a = (Question)it1.next();
			questionSet.add(a);
		}
		
		quiz.setQuestions(questionSet);
		
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
		
		return quiz;
		
	}

//----------------------------------------------------------------------------------------------------------------

	public void displayQuizContent(Quiz quiz){
		
		System.out.println("Username: "+quiz.getUser().getFirstname()+" "+quiz.getUser().getLastname());
		System.out.println("Experience: "+quiz.getUser().getExperience()+" years ("+quiz.getUser().getLevel()+")");
		
		System.out.println("===========================================");
		
		Set<Question> questionsSet = quiz.getQuestions();
		Iterator it = questionsSet.iterator();
		
		while(it.hasNext()){
			Question q = (Question)it.next();
			
			System.out.println(q.getQuestionDescription());
			System.out.println();
			System.out.println("A) "+q.getAnswer().getOptionA());
			System.out.println("B) "+q.getAnswer().getOptionB());
			System.out.println("C) "+q.getAnswer().getOptionC());
			System.out.println("D) "+q.getAnswer().getOptionD());
			System.out.println("---------------------------------------");
		}
		
	}
	
//----------------------------------------------------------------------------------------------------------------

	
//----------------------------------------------------------------------------------------------------------------

}
