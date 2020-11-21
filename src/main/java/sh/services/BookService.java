package sh.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import sh.entities.Book;

public interface BookService {

	void addBook(Book b);

	void updateBook(Book b);

	void delBookById(int id);

	void delBook(Book b);

	Book findBook(int id);

	List<String> findSubjects();

	List<Book> findBooksBySubject(String subject);

}