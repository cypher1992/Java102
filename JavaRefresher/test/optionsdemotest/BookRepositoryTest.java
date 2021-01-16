package optionsdemotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import optionsdemo.Book;
import optionsdemo.BookRepository;

class BookRepositoryTest {
	
	@Test
	void testBookRepository() {
		BookRepository br = new BookRepository();
		assertTrue(br instanceof BookRepository);
	}
	
	@Test
	void testGetAllBooks() {
		BookRepository br = new BookRepository();
		Book harrypotter = new Book("123A","Harry Potter");
		Book eye = new Book("123A","The Series of Unfortunate Events");
		br.add(harrypotter);
		br.add(eye);
		List<Book> actual = br.getAllBooks();
		List<Book> expected = new ArrayList<Book>();
		expected.add(harrypotter);
		expected.add(eye);
		assertEquals(actual,expected);
	}

	@Test
	void testAdd() {
		BookRepository br = new BookRepository();
		Book harrypotter = new Book("123A","Harry Potter");
		br.add(harrypotter);
		Integer actual = br.getAllBooks().size();
		Integer expected = 1;
		assertEquals(actual,expected);
	}

	@Test
	void testGetNA() {
		BookRepository br = new BookRepository();
		Book harrypotter = new Book("123A","Harry Potter");
		Book eye = new Book("123B","The Series of Unfortunate Events");
		br.add(harrypotter);
		br.add(eye);
		String actual = br.get("123C").getIsbn();
		String expect = "NA";
		assertEquals(actual,expect);
	}
	
	@Test
	void testGet123B() {
		BookRepository br = new BookRepository();
		Book harrypotter = new Book("123A","Harry Potter");
		Book eye = new Book("123B","The Series of Unfortunate Events");
		br.add(harrypotter);
		br.add(eye);
		String actual = br.get("123B").getIsbn();
		String expect = "123B";
		assertEquals(actual,expect);
	}
	
	@Test
	void testGetOptional123BIsPresentReturnsTrue() {
		//https://www.baeldung.com/java-optional
		BookRepository br = new BookRepository();
		Book harrypotter = new Book("123A","Harry Potter");
		Book eye = new Book("123B","The Series of Unfortunate Events");
		br.add(harrypotter);
		br.add(eye);
		Optional<Book> actual = br.getOptional("123B");
		Optional<Book> expect = Optional.ofNullable(eye);
		assertTrue(actual.isPresent());
	}
	
	@Test
	void testGetOptional123BIfPresentReturnsTrue() {
		//https://www.baeldung.com/java-optional
		BookRepository br = new BookRepository();
		Book harrypotter = new Book("123A","Harry Potter");
		Book eye = new Book("123B","The Series of Unfortunate Events");
		br.add(harrypotter);
		br.add(eye);
		Optional<Book> book = br.getOptional("123B");
		Book actual = book.orElse(new Book("NA","NA"));
		Book expect = Optional.ofNullable(eye).orElse(new Book("NA","NA"));
		assertEquals(actual,expect);
	}
	
}
