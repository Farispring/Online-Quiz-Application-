package com.example.quizserver.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.quizserver.entity.quiz.Question;
import com.example.quizserver.entity.quiz.Quiz;


@Service
public interface QuestionService {
	
	public Question addQuestion(Question question);
	
	public Question updateQuestion(Question question);
	
	public Set<Question> getQuestions();
	
	public Set<Question> questionsOfQuiz(Quiz quiz);
	
	public void deletequestion(Long quesId) throws Exception;
	
	public Question getQuestionById(Long quesId) throws Exception;
}