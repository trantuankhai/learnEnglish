package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.dao.VocabularyDao;
import com.vn.tdk.learnenglish.entity.Vocabulary;
import com.vn.tdk.learnenglish.sevices.VocabularyServices;

@RestController
public class VocabularyController {
	@Autowired
	private VocabularyServices vocabularyServices;
	@Autowired
	private VocabularyDao vocabularyDao;
	@RequestMapping(value = "vocabulary",method = RequestMethod.GET)
	public List<Vocabulary> getListVocabulary(){
		return vocabularyServices.getAll();
		
	}
	@RequestMapping(value = "vocabulary",method = RequestMethod.POST)
	public Integer addVovabulary(@RequestBody  Vocabulary vocabulary){
		return vocabularyServices.insert(vocabulary);
	}
	@RequestMapping(value = "vocabulary/{id}",method = RequestMethod.DELETE)
	public String deleteVovabulary(@PathVariable  int  id){
		return vocabularyServices.delete(id);
	}
	@RequestMapping(value = "vocabulary",method = RequestMethod.PUT)
	public String updateVovabulary(@RequestBody  Vocabulary vocabulary){
		return vocabularyDao.edit(vocabulary);
	}
}
