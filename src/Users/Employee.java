package Users;
import java.util.Date;

import Enums.EmployeePost;

public abstract class Employee extends User{
	private EmployeePost post;
	private int salary;
	private Date hireDate;
	
	public Employee(String login, String password, String name, String surname, String id, EmployeePost post, int salary, Date hireDate) {
		super(login, password, name, surname, id);
		this.post = post;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public String toString() {
		return super.toString() + "Post: " + getPost() + "\n" + "Salary: " + getSalary() + "\n" + "Hire Date: " + getHireDate() + "\n";
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
}
