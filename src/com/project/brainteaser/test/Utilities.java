package com.project.brainteaser.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.project.brainteaser.entities.Answer;
import com.project.brainteaser.entities.Language;
import com.project.brainteaser.entities.Question;
import com.project.brainteaser.entities.Quiz;
import com.project.brainteaser.entities.User;

public class Utilities {

	//----------------------------------------------------------------------------------------------------------------

	public Quiz generateQuiz(User user, Set<Language> languages, String questionLevel, Session session){

		Quiz quiz = new Quiz(user, new Date());

		Criteria cr = session.createCriteria(Question.class,"ques")
				.createAlias("ques.language","language")
				.add(Restrictions.eq("ques.level", questionLevel));

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

	public void addDummyData(Session session){

		this.addDummyUsers(session);
		this.addDummyQuestionAnswers(session);
	}

	//----------------------------------------------------------------------------------------------------------------

	public void addDummyUsers(Session session){

		User user1 = new User("Vibhor","Jain",4.5, "vibhjain");
		User user2 = new User("Shalini","Jain",4, "shaljain");
		User user3 = new User("Manoj","Kumar",2.5, "manokumar");
		User user4 = new User("Rakesh","Gupta",1.5, "rakgupta");
		User user5 = new User("Rahul","Mehta",8.5, "rahmehta");
		User user6 = new User("Kamal","Jain",14.5, "kamajain");
		User user7 = new User("Manoj","Singh",2.5, "manosingh");
		User user8 = new User("Ajay","Shukla",4.5, "ajayshuk");
		User user9 = new User("Anshuk","Garg",6.5, "anshukg");
		User user10 = new User("Neeraj","Kumar",5.5, "neerkumar");

		session.save(user1);
		session.save(user2);
		session.save(user3);
		session.save(user4);
		session.save(user5);
		session.save(user6);
		session.save(user7);
		session.save(user8);
		session.save(user9);
		session.save(user10);

	}

	//----------------------------------------------------------------------------------------------------------------

	public void addDummyLanguages(Session session){

		Language language1 = new Language("Java");
		Language language2 = new Language("Python");
		Language language3 = new Language("C");
		Language language4 = new Language("Javascript");
		Language language5 = new Language("SQL");

		session.save(language1);
		session.save(language2);
		session.save(language3);
		session.save(language4);
		session.save(language5);

	}

	//----------------------------------------------------------------------------------------------------------------


	public void addDummyQuestionAnswers(Session session){

		Language language1 = new Language("Java");
		Language language2 = new Language("Python");
		Language language3 = new Language("C");
		Language language4 = new Language("Javascript");
		Language language5 = new Language("SQL");
		
		Question question1 = new Question();
		question1.setLevel("Easy");
		question1.setLanguage(language1);
		question1.setQuestionDescription("Which one of these lists contains only Java programming language keywords?");
		Answer answer1 = new Answer(question1, "class, if, void, long, Int, continue", "goto, instanceof, native, finally, default, throws", "try, virtual, throw, final, volatile, transient", "strictfp, constant, super, implements, do", "goto, instanceof, native, finally, default, throws");
		
		
		Question question2 = new Question();
		question2.setLevel("Medium");
		question2.setLanguage(language2);
		question2.setQuestionDescription("What is the output of the following? print('for'.isidentifier())");
		Answer answer2 = new Answer(question2, "True", "False", "None", "Error", "True");
		
		
		Question question3 = new Question();
		question3.setLevel("Hard");
		question3.setLanguage(language3);
		question3.setQuestionDescription("Specify the 2 library functions to dynamically allocate memory?");
		Answer answer3 = new Answer(question3, "malloc() and memalloc()", "alloc() and memalloc()", "malloc() and calloc()", "memalloc() and faralloc()", "malloc() and calloc()");
		
		Question question4 = new Question();
		question4.setLevel("Medium");
		question4.setLanguage(language4);
		question4.setQuestionDescription(" Which of the following can't be done with client-side JavaScript?");
		Answer answer4 = new Answer(question4, "Validating a form", "Sending a form's contents by email", "Storing the form's contents to a database file on the server", "None of the above", "Storing the form's contents to a database file on the server");
		
		Question question5 = new Question();
		question5.setLevel("Easy");
		question5.setLanguage(language5);
		question5.setQuestionDescription("You can add a row using SQL in a database with which of the following?");
		Answer answer5 = new Answer(question5, "ADD", "CREATE", "INSERT", "MAKE", "INSERT");
		
		session.save(language1);
		session.save(language2);
		session.save(language3);
		session.save(language4);
		session.save(language5);
		
		session.save(question1);
		session.save(answer1);
		session.save(question2);
		session.save(answer2);
		session.save(question3);
		session.save(answer3);
		session.save(question4);
		session.save(answer4);
		session.save(question5);
		session.save(answer5);
		

	}

//----------------------------------------------------------------------------------------------------------------

	public User getUser(String username, Session session){
		
		Criteria cr = session.createCriteria(User.class);
		cr.add(Restrictions.eq("username", username));
		List questions = cr.list();		
		User user = (User)questions.iterator().next();
		return user;
	}
	
//----------------------------------------------------------------------------------------------------------------

}
