package com.vn.tdk.learnenglish.sevices;

import java.util.List;


public interface services<T> {
	public Integer insert(T object);

	public String edit(Integer id, T object);

	public String delete(Integer id);

	public List<T> getAll();
}
