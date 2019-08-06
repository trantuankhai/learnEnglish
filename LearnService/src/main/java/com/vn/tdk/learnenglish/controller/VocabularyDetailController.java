package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.VocabularyDetail;
import com.vn.tdk.learnenglish.sevices.VocabularyDetailServices;

@RestController
public class VocabularyDetailController {
	@Autowired
	private VocabularyDetailServices detailServices;

	@RequestMapping(value = "vocabularyDetail/{idvocabulary}", method = RequestMethod.GET)
	public List<VocabularyDetail> getListVocabularyDetail(@PathVariable int idvocabulary) {
		return detailServices.getListVocabularyDetailById(idvocabulary);

	}
}
