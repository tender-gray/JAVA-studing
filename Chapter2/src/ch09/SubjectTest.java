package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student Lee = new Student(100, "Lee");
		Lee.setKoreaSuject("����", 100);
		Lee.setMathSubject("����", 98);
		
		Student Yoon = new Student(200, "Yoon");
		Yoon.setKoreaSuject("����", 80);
		Yoon.setMathSubject("����", 50);
		
		Lee.showScoreInfo();
		Yoon.showScoreInfo();
		
	}
}
