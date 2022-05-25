package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("화산귀환1", "비가"));
		library.add(new Book("화산귀환2", "비가"));
		library.add(new Book("화산귀환3", "비가"));
		library.add(new Book("화산귀환4", "비가"));
		library.add(new Book("화산귀환5", "비가"));
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
		
	}

}
