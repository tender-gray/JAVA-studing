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
				
				// i = 50;      ���� ���ο��� �ٲٷ��� ������ ���� ������ getRunnable �޼��尡 ȣ��Ǵ� �ñ�� run() Ŭ������ ���� �ֱⰡ �ٸ���.
				// num = 20;    getRunnable() �޼���� ���� �޸𸮿� �����µ�, �޼��尡 ȣ�� �ǰ� ���� ��������. (���ú���, �Ű����� ������). ex)�ȵ���̵� ���α׷���
				//              num ���������� ����� �ٲ�.  i �Ű� ���� ���� ��������ó�� ����� �ٲ�.
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(�ܺ� Ŭ���� ���� ����)");
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
