package com.vn.tdk.learnenglish.dao;

import java.util.List;

import com.vn.tdk.learnenglish.entity.QuestionQuiz;

public interface QuestionQuizDao extends TempleteDao<QuestionQuiz>  {
	List<QuestionQuiz> getQuestionQuizByIdLession(int id_lession);
	Integer checkAnswerCorrect(int id_question_quiz);

}
