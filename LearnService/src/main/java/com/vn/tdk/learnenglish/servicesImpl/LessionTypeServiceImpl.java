package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.LessionTypeDao;
import com.vn.tdk.learnenglish.entity.Lession_Type;
import com.vn.tdk.learnenglish.sevices.LessionTypeServices;

@Service
public class LessionTypeServiceImpl implements LessionTypeServices {
	@Autowired
	LessionTypeDao lessionType;

	@Override
	public Integer insert(Lession_Type object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(Lession_Type object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lession_Type> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lession_Type getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lession_Type> getListLesionTypeByIdLessin(int id_lession) {
		// TODO Auto-generated method stub
		return lessionType.getListLesionTypeByIdLessin(id_lession);
	}

}
