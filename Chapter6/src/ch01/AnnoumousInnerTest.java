package ch01;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunuable(final int i) {
		
		final int num = 10;
		
		class MyRunnable implements Runnable{

			int localNum = 1000;
			
			@Override
			public void run() {
				
				// i = 50;      값을 내부에서 바꾸려면 오류가 나는 이유는 getRunnable 메서드가 호출되는 시기와 run() 클래스의 생성 주기가 다르다.
				// num = 20;    getRunnable() 메서드는 스택 메모리에 잡히는데, 메서드가 호출 되고 나면 없어진다. (로컬변수, 매개변수 없어짐). ex)안드로이드 프로그래밍
				//              num 지역변수는 상수로 바뀜.  i 매개 변수 역시 지역변수처럼 상수로 바뀜.
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			}
			
		}
		return new MyRunnable();
	}
}


public class AnnoumousInnerTest {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		Runnable runner = out.getRunuable(100);
		
		runner.run();
	}

}
