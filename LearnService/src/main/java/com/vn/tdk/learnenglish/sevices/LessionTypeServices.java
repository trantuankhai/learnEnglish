package com.vn.tdk.learnenglish.sevices;

import java.util.List;

import com.vn.tdk.learnenglish.entity.Lession_Type;

public interface LessionTypeServices extends services<Lession_Type> {
	List<Lession_Type> getListLesionTypeByIdLessin(int id_lession);


}
