package ch02;

public class VIPCustomer extends Customer{
	
	double saleRatio;
	String agentId;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";
	}

	public String getAgentId() {
		return agentId;
	}	
	
	
}
