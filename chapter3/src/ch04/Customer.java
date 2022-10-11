package ch04;

public class Customer {// costomer 손님
	protected int customerId;// 손님id
	protected String customerName;// 손님이름
	protected String customerGrade;// 등급
	int bonusPoint;
	double bonusRatio;// 보너스 비율
	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() call");
//	}
	
	public Customer(int customerId , String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) call");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {// 고객의 정보를 보여주는 메서드
		return customerName + "님의 등급은 " + customerGrade+" 이며 , 보너스 포인트는 "+ bonusPoint+"입니다";
	}
}
