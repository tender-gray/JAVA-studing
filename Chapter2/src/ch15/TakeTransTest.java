package ch15;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personE = new Person("Edward", 20000);
		
		Taxi taxiyellow = new Taxi("�� ���� ����ý� ");
		
		personE.takeTaxi(taxiyellow);
		
		personE.showInfo();
		taxiyellow.showInfo();
		
	}

}
