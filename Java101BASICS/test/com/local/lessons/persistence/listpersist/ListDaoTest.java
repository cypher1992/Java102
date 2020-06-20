package com.local.lessons.persistence.listpersist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import com.local.lessons.persistence.listpersist.*;
import org.junit.jupiter.api.Test;

class ListDaoTest<Double> {
	
	@Test
	void testGetListreturnsEmptyDoubleArrayList() {
		ListDao ld = new ListDao<Double>();
		List actual = ld.getList();
		List expected = new ArrayList<Double>();
		assertEquals(expected,actual);
	}

	@Test
	void testSetListreturnsOneValueDoubleArrayList() {
		ListDao ld = new ListDao<Double>();
		List newList = new ArrayList<Double>();
		newList.add(55.00);
		ld.setList(newList);
		List actual = ld.getList();
		List expected = new ArrayList<Double>();
		expected.add(55.00);
		assertEquals(expected,actual);
	}

	@Test
	void testAddNullreturnList() {
		ListDao actual = new ListDao<Double>();
		List expected = new ArrayList<Double>();
		actual.add(null);
		expected.add(null);
		assertEquals(expected,actual.getList());
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testRead() {
		fail("Not yet implemented");
	}

}
