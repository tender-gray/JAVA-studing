package ch08;

public class Review2Test {

	public static void main(String[] args) {
		
		Review2 r2 = new Review2();
		
		r2.oderNum = 20220314001L;
		r2.oderPhoneNum = "01031126778";
		r2.oderAddress = "서울시 동작구 상도동 159-38";
		r2.oderDate = 20220314;
		r2.oderTime = 144324;
		r2.oderPrice = 52000;
		r2.oderMenuNum = "0001";
		
		System.out.println(r2.showOderInfo());
		
		
		
	}

}
