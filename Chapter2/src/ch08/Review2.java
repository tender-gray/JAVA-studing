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
		return "주문 접수 번호 : " + oderNum + "\n주문 핸드폰 번호 : " + oderPhoneNum + "\n주문 집 주소 : " + oderAddress + "\n주문 날짜 : " + oderDate + "\n주문 시간 : " + oderTime + "\n주문 가격 : " + oderPrice + "\n메뉴 번호 : " + oderMenuNum;
	}
}
