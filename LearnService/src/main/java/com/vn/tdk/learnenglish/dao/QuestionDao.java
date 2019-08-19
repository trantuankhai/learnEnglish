package com.vn.tdk.learnenglish.dao;

import java.util.List;

import com.vn.tdk.learnenglish.entity.Question;

public interface QuestionDao extends TempleteDao<Question> {
	List<Question> getListQuestionByIdLession(int id_lession);
	Question getListQuestionByIdLessionAndType(int id_lession,int id_type,int order);
	Question getListQuestionByIdLessionAndTypeAndIdQuestion(int id_lession,int id_type,int id_question,int order);

}
