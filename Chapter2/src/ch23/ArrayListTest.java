package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("ȭ���ȯ1", "��"));
		library.add(new Book("ȭ���ȯ2", "��"));
		library.add(new Book("ȭ���ȯ3", "��"));
		library.add(new Book("ȭ���ȯ4", "��"));
		library.add(new Book("ȭ���ȯ5", "��"));
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
		
	}

}
