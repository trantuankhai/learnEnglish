package com.vn.tdk.learnenglish.sevices;

import java.util.List;

import com.vn.tdk.learnenglish.entity.Question;

public interface QuestionService extends services<Question>{
	List<Question> getListQuestionByIdLession(int id_lession);
}
