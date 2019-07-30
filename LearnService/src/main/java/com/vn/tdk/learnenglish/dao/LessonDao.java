package com.vn.tdk.learnenglish.dao;

import java.util.List;

import com.vn.tdk.learnenglish.entity.Lesson;

public interface LessonDao extends TempleteDao<Lesson> {
	public List<Lesson> getListLessonById(int id);
}
