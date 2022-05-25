package ch15;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personE = new Person("Edward", 20000);
		
		Taxi taxiyellow = new Taxi("잘 간다 운수택시 ");
		
		personE.takeTaxi(taxiyellow);
		
		personE.showInfo();
		taxiyellow.showInfo();
		
	}

}
