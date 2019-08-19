package com.vn.tdk.learnenglish.dao;

import java.util.List;

import com.vn.tdk.learnenglish.entity.BasicGrammarDetail;

public interface BasicGrammarDetailDao extends TempleteDao<BasicGrammarDetail> {
	List<BasicGrammarDetail> getListBasicGramarDetailByIdGramar(int id);

}
