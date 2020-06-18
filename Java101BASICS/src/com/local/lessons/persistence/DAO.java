package com.local.lessons.persistence;

public interface DAO<T> {

	public void add(T object);
	public void update(T Object, T newObject);
	public void delete(T Object);
	public T read(T Object);
}
