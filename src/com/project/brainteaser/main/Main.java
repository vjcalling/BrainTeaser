package com.project.brainteaser.main;

import java.util.HashSet;
import java.util.Set;

import com.project.brainteaser.entities.Language;
import com.project.brainteaser.entities.Quiz;
import com.project.brainteaser.entities.User;
import com.project.brainteaser.test.Utilities;

public class Main {

	public static void main(String[] args) {


//				Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//				session.beginTransaction();

//				User user = new User("Vibhor","Jain",4.5);
//				Language language = new Language("Java");
//				Question question = new Question();
//				question.setLevel("Easy");
//				question.setLanguage(language);
//				question.setQuestionDescription("Which one of these lists contains only Java programming language keywords?");
//				Answer answer = new Answer(question, "class, if, void, long, Int, continue", "goto, instanceof, native, finally, default, throws", "try, virtual, throw, final, volatile, transient", "strictfp, constant, super, implements, do", "goto, instanceof, native, finally, default, throws");
//				
//				session.save(language);
//				session.save(question);
//				session.save(answer);
				
//				Quiz quiz = new Quiz(user, new Date());
//				Scorecard scorecard = new Scorecard(quiz, user, 75, "Good job!");
//
//				session.save(user);
//				session.save(language);
//				session.save(question);
//				session.save(answer);
//				session.save(quiz);
//				session.save(scorecard);
//
//				Language language1 = new Language("C++");
//				Question question1 = new Question();
//				question1.setLevel("Moderate");
//				question1.setLanguage(language1);
//				question1.setQuestionDescription("Which of the following type of class allows only one object of it to be created?");
//				Answer answer1 = new Answer(question1, "Virtual class", "Abstract class", "Singleton class", "Friend class", "Singleton class");
//				
//				session.save(language1);
//				session.save(question1);
//				session.save(answer1);
//
//
//		//		session.getTransaction().commit();
//		//		HibernateUtil.getSessionFactory().close();
//
//
//		Set<Question> questionSet = new HashSet<Question>();
//
////		Criteria cr = session.createCriteria(Question.class,"ques")
////			    .createAlias("ques.language","language")
////			    .add(Restrictions.eq("ques.level", "Moderate"))
////			    .add(Restrictions.eq("language.name", "Python"));
//
//		Criteria cr = session.createCriteria(Question.class,"quesCriteria");
//		cr.add(Restrictions.eq("level", "Easy"));
//		List questions = cr.list();		
//		
//		java.util.Iterator it = questions.iterator();
//		while(it.hasNext()){
//			Question a = (Question)it.next();
//			questionSet.add(a);
//		}
//
//		quiz.setQuestions(questionSet);
//		session.save(quiz);
		
				
//		Criteria cr = session.createCriteria(Quiz.class);
//		List quiz = cr.list();
//		Iterator it = quiz.iterator();
//		while(it.hasNext()){
//			Quiz q = (Quiz)it.next();
//			Set<Question> ques = q.getQuestions();
//			Iterator<Question> it1 = ques.iterator();
//			while(it1.hasNext()){
//				System.out.println(((Question)it1.next()).getQuestionDescription());
//			}
//		}
				
//		session.getTransaction().commit();
//		HibernateUtil.getSessionFactory().close();

		
		//-------------------------------------------------------------------------------------
		
		Utilities util = new Utilities();
		User user = new User("Manoj", "Kumar", 2.5);
		Set<Language> languages = new HashSet<Language>();
		languages.add(new Language("Java"));
		
		Quiz quiz = util.generateQuiz(user, languages);
		util.displayQuizContent(quiz);
		
		
	}

}
