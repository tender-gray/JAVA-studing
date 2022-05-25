package ch05;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.sql.rowset.serial.SQLOutputImpl;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("이상용");
		sList.add("윤이나");
		sList.add("이서온");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.println(s));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
		System.out.println();
		sList.stream().filter(s->s.length() >= 3 ).forEach(s-> System.out.println(s));
		
		
	}

}
