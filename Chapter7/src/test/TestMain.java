package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {

	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {

		TestMain test = new TestMain();
		
		test.creatSubject();
		test.creatStudent();
		
		String report = test.gradeReport.getReport();  // 성적 결과 생성
		System.out.println(report);
		
	}
	
	public void creatSubject() {
		
		korean = new Subject("국어", Define.KOREAN);
		math = new Subject("수학", Define.MATH);
		dance = new Subject("방송댄스", Define.DANCE);
		
		dance.setGradeType(Define.PF_TYPE);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addSubject(dance);
	}

	public void creatStudent() {
		
		Student std1 = new Student(211213, "강감찬", korean);
		Student std2 = new Student(212330, "김유신", math);
		Student std3 = new Student(201518, "신사임당", korean);
		Student std4 = new Student(202360, "이순신", korean);
		Student std5 = new Student(201290, "홍길동", math);
		
		goodSchool.addStudent(std1);
		goodSchool.addStudent(std2);
		goodSchool.addStudent(std3);
		goodSchool.addStudent(std4);
		goodSchool.addStudent(std5);
		
		korean.register(std1);
		korean.register(std2);
		korean.register(std3);
		korean.register(std4);
		korean.register(std5);
		
		math.register(std1);
		math.register(std2);
		math.register(std3);
		math.register(std4);
		math.register(std5);
		
		dance.register(std1);
		dance.register(std2);
		dance.register(std3);
		
		addScoreForStudent( std1, korean, 95);      
		addScoreForStudent( std1, math, 56);
		addScoreForStudent( std1, dance, 95);
		
		addScoreForStudent( std2, korean, 95);
		addScoreForStudent( std2, math, 95);
		addScoreForStudent( std2, dance, 85);
		
		addScoreForStudent( std3, korean, 100);
		addScoreForStudent( std3, math, 88);
		addScoreForStudent( std3, dance, 55);
		
		addScoreForStudent( std4, korean, 89);
		addScoreForStudent( std4, math, 95);
		
		addScoreForStudent( std5, korean, 85);
		addScoreForStudent( std5, math, 56);
		
	}
	
	public void addScoreForStudent(Student student, Subject subject, int point) {
		
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}
	
}
