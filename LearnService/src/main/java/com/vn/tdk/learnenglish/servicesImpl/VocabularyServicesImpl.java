package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.VocabularyDao;
import com.vn.tdk.learnenglish.sevices.VocabularyServices;
import com.vn.tdk.learnenglish.entity.Vocabulary;
@Service
public class VocabularyServicesImpl implements VocabularyServices {
	@Autowired
	private VocabularyDao vocabularyDao;

	@Override
	public Integer insert(Vocabulary vocabulary) {
		// TODO Auto-generated method stub
		return vocabularyDao.insert(vocabulary);
	}

	@Override
	public String edit( Vocabulary vocabulary) {
		// TODO Auto-generated method stub
		return vocabularyDao.edit(vocabulary);
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return vocabularyDao.delete(id);
	}

	@Override
	public List<Vocabulary> getAll() {
		// TODO Auto-generated method stub
		return vocabularyDao.getAll();
	}

	@Override
	public Vocabulary getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}


}
