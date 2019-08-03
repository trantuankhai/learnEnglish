package com.vn.tdk.learnenglish.dao;

import java.util.List;

import com.vn.tdk.learnenglish.entity.VocabularyDetail;

public interface VocabularyDetailDao extends TempleteDao<VocabularyDetail> {

	public List<VocabularyDetail> getListVocabularyDetailById(int id);

}
