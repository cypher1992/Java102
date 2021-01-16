package optionsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import optionsdemo.Book;

public class BookRepository {
	
	private List<Book> allBooks = new ArrayList<Book>();
	
	public List<Book> getAllBooks(){
		return this.allBooks;
	}

	public void add(Book book) {
		this.getAllBooks().add(book);
	}
	
	public Book get(String isbn){
		for(Book book: this.getAllBooks()) {
			if(book.getIsbn().equals(isbn)) {
				return book;
			}
		}
		return new Book("NA","NA");
		
	}
	
	public Optional<Book> getOptional(String isbn){
		for(Book book: this.getAllBooks()) {
			if(book.getIsbn().equals(isbn)) {
				return Optional.of(book);
			}
		}
		return Optional.empty();
		
	}
	
}
