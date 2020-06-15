package com.local.lessons.jdbc;

public interface DAO<T> {

	public void add(T object);
	public void update(T Object);
	public void delete(T Object);
	public void read(T Object);
}
