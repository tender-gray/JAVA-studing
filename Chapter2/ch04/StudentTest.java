package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentId = 123456;
		studentLee.setStudentName("�̻��");
		studentLee.address = "����� ���۱�";
		
		studentLee.showStudentInfo();
		
		
		Student studentYun = new Student();
		
		studentYun.studentId = 223456;
		studentYun.setStudentName("���̳�");
		studentYun.address = "����� ���۱�";
		
		studentYun.showStudentInfo();

	}

}
