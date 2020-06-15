package com.local.lessons.jdbc;

public interface DAO<T> {

	public void add(T object);
	public void update(T Object);
	public void delete(String column ,String condition);
	public void read(String column, String condition);
}
