package com.vn.tdk.learnenglish.sevices;

import java.util.List;

import com.vn.tdk.learnenglish.entity.Lesson;

public interface LessonService extends services<Lesson> {
	public List<Lesson> getListLessonById(int id);

}
