package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이상용");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeYoon = new Employee();
		employeeYoon.setEmployeeName("윤이나");
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		System.out.println(employeeYoon.getEmployeeName() + "님의 사번은 " + employeeYoon.getEmployeeId());

		
	}

}
