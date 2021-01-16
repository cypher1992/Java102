package optionsdemotest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import optionsdemo.Book;

class BookTest {

	@Test
	void testBook() {
		Book book = new Book("123A","Harry Potter");
		assertTrue(book instanceof Book);
	}

	@Test
	void testGetTitle() {
		Book book = new Book("123A","Harry Potter");
		String actual = book.getTitle();
		String expected = "Harry Potter";
		assertEquals(actual,expected);
	}

	@Test
	void testSetTitle() {
		Book book = new Book("123A","Harry Potter");
		book.setTitle("Courage the Cowardly Dog");
		String actual = book.getTitle();
		String expected = "Courage the Cowardly Dog";
		assertEquals(actual,expected);
	}

	@Test
	void testGetIsbn() {
		Book book = new Book("123A","Harry Potter");
		String actual = book.getIsbn();
		String expected = "123A";
		assertEquals(actual,expected);
	}

	@Test
	void testSetIsbn() {
		Book book = new Book("123A","Harry Potter");
		book.setIsbn("123B");
		String actual = book.getIsbn();
		String expected = "123B";
		assertEquals(actual,expected);
	}

}
