package com.vn.tdk.learnenglish.sevices;

import java.util.List;

import com.vn.tdk.learnenglish.entity.Vocabulary;
import com.vn.tdk.learnenglish.entity.VocabularyDetail;

public interface VocabularyDetailServices extends services<Vocabulary> {
	public List<VocabularyDetail> getListVocabularyDetailById(int id);
}
