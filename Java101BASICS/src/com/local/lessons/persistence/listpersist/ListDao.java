package com.local.lessons.persistence.listpersist;

import java.util.List;

import com.local.lessons.persistence.DAO;

public class ListDao<T> implements DAO<T> {
	
	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	@Override
	public void add(T object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T Object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T Object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read(T Object) {
		// TODO Auto-generated method stub
		
	}

}
