package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentId = 123456;
		studentLee.setStudentName("이상용");
		studentLee.address = "서울시 동작구";
		
		studentLee.showStudentInfo();
		
		
		Student studentYun = new Student();
		
		studentYun.studentId = 223456;
		studentYun.setStudentName("윤이나");
		studentYun.address = "서울시 동작구";
		
		studentYun.showStudentInfo();

	}

}
