package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.Vocabulary;
import com.vn.tdk.learnenglish.sevices.VocabularyServices;

@RestController
public class VocabularyController {
	@Autowired
	private VocabularyServices vocabulary;
	@RequestMapping(value = "vocabulary",method = RequestMethod.GET)
	public List<Vocabulary> getListVocabulary(){
		return vocabulary.getAll();
		
	}
}
