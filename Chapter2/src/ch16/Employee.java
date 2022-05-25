package ch16;

public class Employee {

	private static int serialNum = 1000;
	
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
	}
	
	
	public static int getSerialNum() {
//		int i = 0;      지역(일반) 변수
		
//		employeeName = "Lee";  인스턴스 변수  . static 안에서 인스턴스 변수를 사용할 수 없다. 인스턴스를 만들지 않아도 바로 불러서 사용할 수 있기 때문이다.
		
		return serialNum;  // 스태틱 변수
	}


	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
