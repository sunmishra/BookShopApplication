package sh.models;

import java.util.Arrays;

public class SelectedBook {
	private String[] book; // book ids
	public SelectedBook() {
		this.book = new String[0];//this will show the default selected data
	}
	public String[] getBook() {
		return book;
	}
	public void setBook(String[] book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "SelectedBook [book=" + Arrays.toString(book) + "]";
	}
}
