package ch08;

public class Review1 {

	public int personHeight;
	public int personWeight;
	public String personGender;
	public String personName;
	public int personAge;
	
	public Review1() {}
	
	public Review1(int personHeight, int personWeight, String personGender, String personName, int personAge) {
		this.personHeight = personHeight;
		this.personWeight = personWeight;
		this.personGender = personGender;
		this.personName = personName;
		this.personAge = personAge;
		
	}
		
	
	public String showPersonInfo() {
		
		return "Ű�� " + personHeight + "�̰�, �����԰� " + personWeight + "ų���� " + personGender + "�� �ֽ��ϴ�." + "�̸��� " + personName + "�̰�, ���̴� " + personAge + "�� �Դϴ�.";
	}
	
}
