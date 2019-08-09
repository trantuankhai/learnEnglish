package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.LessonDao;
import com.vn.tdk.learnenglish.entity.Lesson;
import com.vn.tdk.learnenglish.sevices.LessonService;

@Service
public class LessonServiceImpl implements LessonService {
	@Autowired
	LessonDao lessonDao;

	@Override
	public Integer insert(Lesson object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(Lesson object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lesson> getAll() {
		// TODO Auto-generated method stub
		return lessonDao.getAll();
	}

	@Override
	public Lesson getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lesson> getListLessonById(int id) {
		// TODO Auto-generated method stub
		return lessonDao.getListLessonById(id);
	}
}
