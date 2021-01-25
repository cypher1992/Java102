package arraylisttest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import collectiondemoList.ClassArrayList;


class ArrayListTest {

	@Test
	void testClassArrayList() {
		ClassArrayList arrayListCls = new ClassArrayList();
		assertTrue(arrayListCls instanceof ClassArrayList);
	}

	@Test
	void testGetArrayList() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		ArrayList<Integer> actual = arrayListCls.getArrayList();
		ArrayList<Integer>  expected = new ArrayList<Integer>();
		assertEquals(actual,expected);
	}

	@Test
	void testSetArrayList() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ClassArrayList arrayListCls = new ClassArrayList();
		ArrayList<Integer>  expected = new ArrayList<Integer>();
		expected.add(1);
		arrayListCls.setArrayList(expected);
		ArrayList<Integer> actual = arrayListCls.getArrayList();
		assertEquals(actual,expected);
	}

	@Test
	void testAdd() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		ArrayList<Integer>  expected = new ArrayList<Integer>();
		Integer num = 1;
		expected.add(1);
		arrayListCls.add(num);
		ArrayList<Integer> actual = arrayListCls.getArrayList();
		assertEquals(actual,expected);
	}

	@Test
	void testRemove() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1000);
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		ArrayList<Integer>  expected = new ArrayList<Integer>();
		arrayListCls.remove(0);
		ArrayList<Integer> actual = arrayListCls.getArrayList();
		assertEquals(expected,actual);
	}

	@Test
	void testGet0Return1000() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1000);
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		Integer  expected = 1000;
		Integer actual = arrayListCls.get(0);
		assertEquals(expected,actual);
	}
	
	@Test
	void testGet1Return2000() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1000);
		arraylist.add(2000);
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		Integer  expected = 2000;
		Integer actual = arrayListCls.get(1);
		assertEquals(expected,actual);
	}
	
	@Test
	void testSizeReturn0() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		Integer  expected = 0;
		Integer actual = arrayListCls.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void testSizeReturn1() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		arrayListCls.add(1);
		Integer  expected = 1;
		Integer actual = arrayListCls.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void testisEmptyReturnTrue() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		Boolean  expected = true;
		Boolean actual = arrayListCls.isEmpty();
		assertEquals(expected,actual);
	}
	
	@Test
	void testisEmptyReturnFalse() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		arrayListCls.add(1);
		Boolean  expected = false;
		Boolean actual = arrayListCls.isEmpty();
		assertEquals(expected,actual);
	}
	
	@Test
	void testClearReturn0() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		arrayListCls.add(1);
		arrayListCls.clear();
		Integer  expected = 0;
		Integer actual = arrayListCls.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void testRemoveAllReturnsizeof1() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ArrayList<Integer> removeList = new ArrayList<Integer>();
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		arrayListCls.add(1);
		arrayListCls.removeAll(removeList);
		Integer  expected = 1;
		Integer actual = arrayListCls.size();
		assertEquals(expected,actual);
	}
	
	
	@Test
	void testRemoveAllReturnsizeof0() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ArrayList<Integer> removeList = new ArrayList<Integer>();
		removeList.add(1);
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		arrayListCls.add(1);
		arrayListCls.removeAll(removeList);
		Integer  expected = 0;
		Integer actual = arrayListCls.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void testRemoveAll1Returnsizeof1() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ArrayList<Integer> removeList = new ArrayList<Integer>();
		removeList.add(1);
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		arrayListCls.add(1);
		arrayListCls.add(2);
		arrayListCls.removeAll(removeList);
		Integer  expected = 1;
		Integer actual = arrayListCls.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void testRemoveAll12Returnsizeof0() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ArrayList<Integer> removeList = new ArrayList<Integer>();
		removeList.add(1);
		removeList.add(2);
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		arrayListCls.add(1);
		arrayListCls.add(2);
		arrayListCls.removeAll(removeList);
		Integer  expected =0;
		Integer actual = arrayListCls.size();
		assertEquals(expected,actual);
	}
	
	@Test
	void testEmptyArrayListStreamReturnList() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ArrayList<Integer> streamList = new ArrayList<Integer>();
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		List expected = streamList.stream().collect(Collectors.toList());
		List actual = arrayListCls.stream().collect(Collectors.toList());
		assertEquals(expected,actual);
	}
	
	@Test
	void testArrayList1StreamReturnList() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		ArrayList<Integer> streamList = new ArrayList<Integer>();
		streamList.add(1);
		ClassArrayList arrayListCls = new ClassArrayList(arraylist);
		List expected = streamList.stream().collect(Collectors.toList());
		List actual = arrayListCls.stream().collect(Collectors.toList());
		assertEquals(actual,expected);
	}
	
	@Test
	void testEmptyArrayListRemoveIfEvenReturnEmptyList() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ClassArrayList arraycls = new ClassArrayList(arraylist);
		Predicate<Integer> condition = index -> index%2==0;
		arraycls.removeIf(condition);
		ArrayList<Integer> actual = arraycls.getArrayList();
		assertEquals(actual,expected);
	}
	
	@Test
	void testArrayList1RemoveIfEvenReturnList1() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		ClassArrayList arraycls = new ClassArrayList(arraylist);
		Predicate<Integer> condition = index -> index%2==0;
		arraycls.removeIf(condition);
		ArrayList<Integer> actual = arraycls.getArrayList();
		assertEquals(actual,expected);
	}
	
	@Test
	void testArrayList2RemoveIfEvenReturnEmptyArrayList() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(2);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ClassArrayList arraycls = new ClassArrayList(arraylist);
		Predicate<Integer> condition = index -> index%2==0;
		arraycls.removeIf(condition);
		ArrayList<Integer> actual = arraycls.getArrayList();
		assertEquals(actual,expected);
	}
	
	@Test
	void testArrayList21RemoveIfEvenReturnArrayList1() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(2);
		arraylist.add(1);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ClassArrayList arraycls = new ClassArrayList(arraylist);
		Predicate<Integer> condition = index -> index%2==0;
		arraycls.removeIf(condition);
		ArrayList<Integer> actual = arraycls.getArrayList();
		expected.add(1);
		assertEquals(actual,expected);
	}
}
