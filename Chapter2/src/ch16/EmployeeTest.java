package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̻��");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeYoon = new Employee();
		employeeYoon.setEmployeeName("���̳�");
		
		System.out.println(employeeLee.getEmployeeName() + "���� ����� " + employeeLee.getEmployeeId());
		System.out.println(employeeYoon.getEmployeeName() + "���� ����� " + employeeYoon.getEmployeeId());

		
	}

}
