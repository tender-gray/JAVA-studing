package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̻��");
		customerLee.setCustomerId(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer customerYoon = new VIPCustomer();
		customerYoon.setCustomerName("���̳�");
		customerYoon.setCustomerId(10011);
		customerYoon.bonusPoint = 10000;
		System.out.println(customerYoon.showCustomerInfo());
		
	}

}
