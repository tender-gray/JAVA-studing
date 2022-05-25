package ch21;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library = new Book[5];
		
		library[0] = new Book("화산귀환1", "비가");
		library[1] = new Book("화산귀환2", "비가");
		library[2] = new Book("화산귀환3", "비가");
		library[3] = new Book("화산귀환4", "비가");
		library[4] = new Book("화산귀환5", "비가");
		
		for(Book book : library) {
			
			System.out.println(book);
			book.showInfo();	
		}
		
		
//		for(int i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}
		
	}

}
