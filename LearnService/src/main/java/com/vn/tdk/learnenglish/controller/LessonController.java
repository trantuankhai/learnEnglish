package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.Lesson;
import com.vn.tdk.learnenglish.sevices.LessonService;

@RestController
public class LessonController {
	@Autowired
	private LessonService lessonService;

	@RequestMapping(value = "lesson", method = RequestMethod.GET)
	private List<Lesson> getAllLession() {
		return lessonService.getAll();
	}

}
