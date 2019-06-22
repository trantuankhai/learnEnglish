package com.vn.tdk.learnenglish.dao;

import java.util.List;

public interface TempleteDao<T> {
	public Integer insert(T object);

	public String edit(T object);

	public String delete(T object);

	public List<T> getAll();

}
