package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.Lession_Type;
import com.vn.tdk.learnenglish.sevices.LessionTypeServices;

@RestController
public class LessionTypeController {
	@Autowired
	private LessionTypeServices LessionType;

	@RequestMapping(value = "lession/type/{id_lession}", method = RequestMethod.GET)
	private List<Lession_Type> getListFeedBack(@PathVariable int id_lession) {
		return LessionType.getListLesionTypeByIdLessin(id_lession);
	}
}
