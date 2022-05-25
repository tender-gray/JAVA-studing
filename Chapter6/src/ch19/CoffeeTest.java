package ch19;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		
		System.out.println();
		
		Coffee etiopiaLatte = new Latte(etiopiaCoffee);
		etiopiaLatte.brewing();
		
		Coffee mochaEtiopia = new Mocha(new Latte(new EtiopiaAmericano()));
		mochaEtiopia.brewing();
		
		Coffee kenyaCoffee = new WhippingCream(new Mocha(new Latte(new KenyaAmericano())));
		kenyaCoffee.brewing();
		
		
		
	}

}
 