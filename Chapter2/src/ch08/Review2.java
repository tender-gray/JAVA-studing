package ch08;

public class Review2 {
	
	public long oderNum;
	public String oderPhoneNum;
	public String oderAddress;
	public int oderDate;
	public int oderTime;
	public int oderPrice;
	public String oderMenuNum;
	
	public Review2() {}
	
	public Review2(long oderNum, String oderPhoneNum, String oderAddress, int oderDate, int oderTime, int oderPrice, String oderMenuNum) {
		this.oderNum = oderNum;
		this.oderPhoneNum = oderPhoneNum;
		this.oderAddress = oderAddress;
		this.oderDate = oderDate;
		this.oderTime = oderTime;
		this.oderPrice = oderPrice;
		this.oderMenuNum = oderMenuNum;
	}
	
	public String showOderInfo() {
		return "�ֹ� ���� ��ȣ : " + oderNum + "\n�ֹ� �ڵ��� ��ȣ : " + oderPhoneNum + "\n�ֹ� �� �ּ� : " + oderAddress + "\n�ֹ� ��¥ : " + oderDate + "\n�ֹ� �ð� : " + oderTime + "\n�ֹ� ���� : " + oderPrice + "\n�޴� ��ȣ : " + oderMenuNum;
	}
}
