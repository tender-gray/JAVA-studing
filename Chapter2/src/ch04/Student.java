package ch04;

public class Student {
	
	public int studentId;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println( studentId + "�й��� �̸��� " + studentName + "�̰�, �ּҴ� " + address + "�Դϴ�.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
