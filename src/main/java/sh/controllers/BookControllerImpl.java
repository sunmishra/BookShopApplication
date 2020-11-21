package sh.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sh.entities.Book;
import sh.models.SelectedBook;
import sh.models.Subject;
import sh.services.BookServiceImpl;

@Controller
public class BookControllerImpl {
	
	@Autowired
	private BookServiceImpl bookService;
	
	
	@RequestMapping("/getsubjects")
	public String subjects(Model model) {
		List<String> subList = bookService.findSubjects();
		model.addAttribute("subjectList", subList);
		
		Subject selectSubject = new Subject();//here subject model is required in order to send the default data to view
		if(subList.size() > 0)
			selectSubject.setSubject(subList.get(0));
		model.addAttribute("command", selectSubject);
		return "subjects";
	}//since we r sending list of sub if we r using spring tags then we need to give the default selected data otherwise we get binding error
	 //so we have to send one default selected subject
	
	
	@RequestMapping("/books")
	public String books(Subject selectedSubject, Model model) {
		String subject = selectedSubject.getSubject();// we need to collect the data which was selected in subjects.jsp hence Subject model is needed
		List<Book> bookList = bookService.findBooksBySubject(subject);
		model.addAttribute("books", bookList);
		model.addAttribute("command", new SelectedBook());//for default selection of book in book.jsp
		return "books";
	}
	
	@RequestMapping("/addCart")
	public String addToCart(SelectedBook selectedBooks, HttpSession session) {
		List<Integer> cart = (List<Integer>) session.getAttribute("cart");//we have already added cart into session while login 
		for(String bookId : selectedBooks.getBook()) {
			int id = Integer.parseInt(bookId);//now to add id into cart we need a cart, that's why empty cart is provided to user after login but we need add it to session
			cart.add(id);
		}
		return "forward:getsubjects";//we cannot directly go back to subject.jsp other wise we loose selected data
	}

	
	@RequestMapping("/showcart")
	public String showCart(Model model, HttpSession session) {
		List<Book> bookList = new ArrayList<Book>();
		List<Integer> cart = (List<Integer>) session.getAttribute("cart");
		for(int id : cart) {
			Book b = bookService.findBook(id);
			bookList.add(b);
		}
		model.addAttribute("bookList", bookList);
		return "cart";
	}//take out list of book from session and add it into list of Books then send it through Model


	@RequestMapping("/details")
	public String details(@RequestParam("id") int id, Model model) {
		Book b = bookService.findBook(id);
		model.addAttribute("book", b);
		return "details";
	}
}



//Model(provided by Spring) is used to send the data
//models created by user(Login, Subject, SelectedBook) is used to collect the the data



