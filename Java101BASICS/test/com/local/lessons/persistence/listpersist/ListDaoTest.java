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
	void testSetList() {
		fail("Not yet implemented");
	}

	@Test
	void testAdd() {
		fail("Not yet implemented");
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
