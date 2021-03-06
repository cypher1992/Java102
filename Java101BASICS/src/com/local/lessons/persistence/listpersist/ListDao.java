package com.local.lessons.persistence.listpersist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.local.lessons.persistence.template.DAO;

public class ListDao<T> implements DAO<T> {
	
	private List<T> list = new ArrayList<T>();

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
			int numberOfInstancesOfObject = Collections.frequency(this.list,object);
			for(int i=0; i<numberOfInstancesOfObject; i++) {
				this.list.remove(object);
				this.list.add(newObject);
			}
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
			if(item.equals(object)){
				temp = object;
			}
		}
		return temp;
	}

}
