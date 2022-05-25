package ch03;

public class VIPCustomer extends Customer{
	
	double saleRatio;
	String agentId;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}

	public String getAgentId() {
		return agentId;
	}	
	
	
}
