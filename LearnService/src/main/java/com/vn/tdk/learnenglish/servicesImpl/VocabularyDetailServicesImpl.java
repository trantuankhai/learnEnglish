package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.VocabularyDetailDao;
import com.vn.tdk.learnenglish.entity.Vocabulary;
import com.vn.tdk.learnenglish.entity.VocabularyDetail;
import com.vn.tdk.learnenglish.sevices.VocabularyDetailServices;
@Service
public class VocabularyDetailServicesImpl implements VocabularyDetailServices {
	@Autowired
	private VocabularyDetailDao VocabularyDetailDao;

	@Override
	public Integer insert(VocabularyDetail object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(VocabularyDetail object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VocabularyDetail> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VocabularyDetail getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VocabularyDetail> getListVocabularyDetailById(int id) {
		// TODO Auto-generated method stub
		return VocabularyDetailDao.getListVocabularyDetailById(id);
	}

}
