package mypack.java;

public class CompositeDesignPaternDemo {
	public static void main(String args[]) {
		Employee ceo = new Employee("Ambhani", "CEO", 250000);
		Employee headSales = new Employee("Ravi", "Head Sales", 50000);
		Employee headMarketing = new Employee("Shivani", "Head Marketing", 70000);
		Employee salesExecutive1 = new Employee("Pramod", "Sales", 5000);
		Employee salesExecutive2 = new Employee("Eswar", "Sales", 6000);
		Employee clerk1 = new Employee("Shakti", "Marketing", 10000);
		Employee clerk2 = new Employee("Smrithi", "Marketing", 15000);
		// adding employees as per the department
		ceo.addEmployee(headSales);
		ceo.addEmployee(headMarketing);
		headSales.addEmployee(salesExecutive1);
		headSales.addEmployee(salesExecutive2);
		headMarketing.addEmployee(clerk1);
		headMarketing.addEmployee(clerk2);
		// printing out the hierarchical structure of employee
		System.out.println(ceo);
		for (Employee headEmployee : ceo.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates())
				System.out.println(employee);
		}
	}
}
