package com.vn.tdk.learnenglish.dao;

import java.util.List;

import com.vn.tdk.learnenglish.entity.Lession_Type;

public interface LessionTypeDao extends TempleteDao<Lession_Type> {
	List<Lession_Type> getListLesionTypeByIdLessin(int id_lession);

}
