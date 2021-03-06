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
	void testAddNotNullreturnList() {
		ListDao actual = new ListDao<String>();
		List expected = new ArrayList<String>();
		String Blackstone = "Blackstone";
		actual.add(Blackstone);
		expected.add(Blackstone);
		assertEquals(expected,actual.getList());
	}
	
	@Test
	void testAddMultiObjreturnList() {
		ListDao actual = new ListDao<String>();
		List expected = new ArrayList<String>();
		String Blackstone = "Blackstone";
		String WellsFargo = "Wells Fargo";
		actual.add(Blackstone);
		actual.add(WellsFargo);
		expected.add(Blackstone);
		expected.add(WellsFargo);
		assertEquals(expected,actual.getList());
	}

	@Test
	void testUpdateNullStringreturnsList() {
		ListDao actual = new ListDao<String>();
		List expected = new ArrayList<String>();
		String blackstone = "Blackstone";
		actual.add(null);
		actual.update(null, blackstone);
		expected.add(blackstone);
		assertEquals(expected,actual.getList());
	}
	
	@Test
	void testUpdateObjStrStrreturnsList() {
		ListDao actual = new ListDao<String>();
		List expected = new ArrayList<String>();
		String blackstone = "Blackstone";
		String wellsfargo = "WellsFargo";
		actual.add(blackstone);
		actual.update(blackstone, wellsfargo);
		expected.add(wellsfargo);
		assertEquals(expected,actual.getList());
	}
	
	@Test
	void testUpdateMultiplyInstancesObjStrStrReturnsList() {
		ListDao actual = new ListDao<String>();
		List expected = new ArrayList<String>();
		String blackstone = "Blackstone";
		String wellsfargo = "WellsFargo";
		actual.add(blackstone);
		actual.add(blackstone);
		actual.update(blackstone, wellsfargo);
		expected.add(wellsfargo);
		expected.add(wellsfargo);
		assertEquals(expected,actual.getList());
	}

	@Test
	void testDeleteSingleInstancereturnsEmptyList() {
		ListDao actual = new ListDao<String>();
		List expected = new ArrayList<String>();
		String blackstone = "Blackstone";
		actual.add(blackstone);
		actual.delete(blackstone);
		expected.add(blackstone);
		expected.remove(blackstone);
		assertEquals(expected,actual.getList());
	}
	
	@Test
	void testDeleteNoneInstancereturnsEmptyList() {
		ListDao actual = new ListDao<String>();
		List expected = new ArrayList<String>();
		String blackstone = "Blackstone";
		actual.delete(blackstone);
		expected.remove(blackstone);
		assertEquals(expected,actual.getList());
	}
	
	@Test
	void testDeleteMultipleInstancereturnsList() {
		ListDao actual = new ListDao<String>();
		List expected = new ArrayList<String>();
		String blackstone = "Blackstone";
		actual.add(blackstone);
		actual.add(blackstone);
		actual.delete(blackstone);
		expected.add(blackstone);
		assertEquals(expected,actual.getList());
	}
	
	@Test
	void testDeleteMultipleDiffInstancereturnsList() {
		ListDao actual = new ListDao<String>();
		List expected = new ArrayList<String>();
		String blackstone = "Blackstone";
		String wellsfargo = "WellsFargo";
		actual.add(blackstone);
		actual.add(wellsfargo);
		actual.delete(blackstone);
		expected.add(wellsfargo);
		assertEquals(expected,actual.getList());
	}
	
	@Test
	void testDeleteOrderMultipleDiffInstancereturnsList() {
		ListDao actual = new ListDao<String>();
		List expected = new ArrayList<String>();
		String blackstone = "Blackstone";
		String wellsfargo = "WellsFargo";
		String bofa = "BankOfAmerica";
		actual.add(blackstone);
		actual.add(wellsfargo);
		actual.add(bofa);
		actual.delete(blackstone);
		expected.add(wellsfargo);
		expected.add(bofa);
		assertEquals(expected,actual.getList());
	}

	@Test
	void testReadExistentObjectReturnsObject() {
		ListDao list = new ListDao<String>();
		String expected = "Blackstone";
		list.add(expected);
		String actual = (String) list.read(expected);
		assertEquals(expected,actual);
	}

	@Test
	void testReadNonExistentObjectReturnsNull() {
		ListDao list = new ListDao<String>();
		String nonExistentObj = "Blackstone";
		String actual = (String) list.read(nonExistentObj);
		String expected = null;
		assertEquals(expected,actual);
	}
}
