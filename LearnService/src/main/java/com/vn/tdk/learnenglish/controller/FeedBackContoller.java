package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.FeedBack;
import com.vn.tdk.learnenglish.sevices.FeedBackService;
@CrossOrigin
@RestController
public class FeedBackContoller {
	@Autowired
	private FeedBackService feedBackService;

	@RequestMapping(value = "feedBack", method = RequestMethod.GET)
	private List<FeedBack> getListFeedBack() {
		return feedBackService.getAll();
	}
}
