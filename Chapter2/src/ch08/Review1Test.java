package ch08;

public class Review1Test {

	public static void main(String[] args) {
	
		Review1 r1 = new Review1();
		
		r1.personHeight = 180;
		r1.personWeight = 78;
		r1.personGender = "³²¼º";
		r1.personName = "Tomas";
		r1.personAge = 37;
		
		System.out.println(r1.showPersonInfo());
		
		
	}

}
