package ch21;

public class ThreadJoinTest extends Thread {
	
	int start;
	int end;
	int total;
	
	public ThreadJoinTest (int start, int end) {
		this.start = start;
		this.end = end;	
	}
	
	public void run() {
		int i;
		for ( i = start; i<=end; i++ ) {
			total += i;
		}
	}
	
	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + "strat");
		
		ThreadJoinTest tjt1 = new ThreadJoinTest(1, 50);
		ThreadJoinTest tjt2 = new ThreadJoinTest(51, 100);
		
		tjt1.start();
		tjt2.start();
		
		try {
			tjt1.join();
			tjt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int lastTotal = tjt1.total + tjt2.total;
		
		System.out.println("tjt1.total =" + tjt1.total);
		System.out.println("tjt2.total =" + tjt2.total);
		System.out.println("lastTotal =" + lastTotal);
		
		System.out.println(Thread.currentThread() + "end");
		
	}

}
