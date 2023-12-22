package Users;
import java.util.Date;

import SystemParts.*;
import Enums.*;

public abstract class Employee extends User{
	private EmployeePost post;
	private int salary;
	private Date hireDate;
	private EmployeeOrder employeeOrder;
	
	public Employee(String login, String password, String name, String surname, String id, EmployeePost post, int salary, Date hireDate) {
		super(login, password, name, surname, id);
		this.post = post;
		this.salary = salary;
		this.hireDate = hireDate;
		this.employeeOrder = null;
	}

	public EmployeeOrder makeRequest(String title, String content, OrderType orderType) {
		this.employeeOrder = new EmployeeOrder(title, content, this.getId(), orderType);
		return employeeOrder;
	}
	@Override
	public String toString() {
		return "Employee{" +
				"post=" + post +
				", salary=" + salary +
				", hireDate=" + hireDate +
				", employeeOrder=" + employeeOrder +
				'}';
	}

	public EmployeePost getPost() {
		return post;
	}

	public void setPost(EmployeePost post) {
		this.post = post;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public EmployeeOrder getEmployeeOrder() {
		return employeeOrder;
	}

	public void setEmployeeOrder(EmployeeOrder employeeOrder) {
		this.employeeOrder = employeeOrder;
	}
}
