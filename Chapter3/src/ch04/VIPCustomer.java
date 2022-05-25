package ch04;

public class VIPCustomer extends Customer{
	
	double saleRatio;
	String agentId;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";
		
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * saleRatio);
		return price;
	}



	public String getAgentId() {
		return agentId;
	}	
	
	
}
