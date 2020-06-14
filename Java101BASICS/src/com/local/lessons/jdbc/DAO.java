package com.local.lessons.jdbc;

public interface DAO {

	public void add(String column ,String value);
	public void update(String column ,String value,String condition); 
}
