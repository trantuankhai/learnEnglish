package com.vn.tdk.learnenglish.sevices;

import java.util.List;

import com.vn.tdk.learnenglish.entity.BasicGrammarDetail;


public interface BasicGrammarDetailService extends services<com.vn.tdk.learnenglish.entity.BasicGrammarDetail> {
	List<BasicGrammarDetail> getListBasicGramarDetailByIdGramar(int id);


}
