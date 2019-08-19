package com.vn.tdk.learnenglish.sevices;

import java.util.List;

import com.vn.tdk.learnenglish.entity.QuestionQuiz;

public interface QuestionQuizServices extends services<QuestionQuiz> {
	List<QuestionQuiz> getQuestionQuizByIdLession(int id_lession);

}
