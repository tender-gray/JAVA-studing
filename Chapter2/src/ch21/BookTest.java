package ch21;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library = new Book[5];
		
		library[0] = new Book("ȭ���ȯ1", "��");
		library[1] = new Book("ȭ���ȯ2", "��");
		library[2] = new Book("ȭ���ȯ3", "��");
		library[3] = new Book("ȭ���ȯ4", "��");
		library[4] = new Book("ȭ���ȯ5", "��");
		
		for(Book book : library) {
			
			System.out.println(book);
			book.showInfo();	
		}
		
		
//		for(int i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}
		
	}

}
