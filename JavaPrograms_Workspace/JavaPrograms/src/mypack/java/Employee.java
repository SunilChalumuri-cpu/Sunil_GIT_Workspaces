package mypack.java;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String department;
	private int salary;
	private List<Employee> subordinates;

	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public void addEmployee(Employee e) {
		subordinates.add(e);
	}

	public void removeEmployee(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return "Employee: {Name:" + name + ", Department:" + department + ", Salary:" + salary + "}";
	}
}
