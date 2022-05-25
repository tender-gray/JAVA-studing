package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student sL = new Student("Lee", 5000);
		Student sY = new Student("Yoon", 10000);
		
		Bus bus151 = new Bus(151);
		Bus bus142 = new Bus(142);
		
		sL.takeBus(bus151);
		
		Subway greenSubway = new Subway(2);
		
		sY.takeSubway(greenSubway);
		
		sL.showInfo();
		sY.showInfo();
		
		bus151.showInfo();
		greenSubway.showInfo();
		
		bus142.showInfo();
		
	}

}
