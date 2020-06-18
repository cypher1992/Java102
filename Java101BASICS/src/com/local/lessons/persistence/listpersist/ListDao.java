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
		this.list.add(object);
	}

	@Override
	public void update(T object, T newObject) {
		if(this.list.contains(object)){
			this.list.remove(object);
			this.add(newObject);
		}
	}

	@Override
	public void delete(T object) {
		this.list.remove(object);
	}

	@Override
	public T read(T object) {
		T temp = null;
		for(T item : this.getList()){
			if(temp.equals(object)){
				temp = object;
			}
		}
		return temp;
	}

}
