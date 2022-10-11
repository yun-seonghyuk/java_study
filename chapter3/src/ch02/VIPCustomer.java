package ch02;

public class VIPCustomer extends Customer{
	double saleRatio;//세일 비율
	private String agentId;//담당 상담원
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	
}
