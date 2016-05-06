package com.hireme.dao;

import java.util.Collection;

public interface DAOinterface<T> {

	public T add(T obj);
	public int delete(T obj);
	public Collection <T> find(T obj);
}
