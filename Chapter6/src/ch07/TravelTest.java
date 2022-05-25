package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("이상용", 34, 100);
		TravelCustomer customerYoon = new TravelCustomer("윤이나", 37, 100);
		TravelCustomer customerLee2 = new TravelCustomer("이서온", 1, 50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(customerLee);
		customerList.add(customerYoon);
		customerList.add(customerLee2);
		
		System.out.println("=====고객 명단 출력=====");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("=====여행 비용=====");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		
		System.out.println("=====20세 이상 고객 이름 정렬=====");
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s-> System.out.println(s));
		
	}

}
