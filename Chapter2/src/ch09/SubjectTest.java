package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student Lee = new Student(100, "Lee");
		Lee.setKoreaSuject("국어", 100);
		Lee.setMathSubject("수학", 98);
		
		Student Yoon = new Student(200, "Yoon");
		Yoon.setKoreaSuject("국어", 80);
		Yoon.setMathSubject("수학", 50);
		
		Lee.showScoreInfo();
		Yoon.showScoreInfo();
		
	}
}
