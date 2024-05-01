package Exercise6;

public class Employee {
	private String name;
	private String jobTitle;
	private double salary;
	
	public Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void raiseSalary(double percentage) {
		salary += salary * percentage / 100;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
		Employee emp2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);
		System.out.println("***** Employee Details *****");
		System.out.println("Name: " + emp1.getName() + "\nJob: " + emp1.getJobTitle() + "\nSalary: " + emp1.getSalary());
		System.out.println("\nName: " + emp2.getName() + "\nJob: " + emp2.getJobTitle() + "\nSalary: " + emp2.getSalary());
		
		emp1.raiseSalary(16);
		emp2.raiseSalary(27);
		System.out.println("\nAfter the raising first employee's salary %16 and second employee's salary %27: ");
		System.out.println("***** New Salaries *****");
		System.out.println("First employee's new salary: " + emp1.getSalary() + "\nSecond employee'S new salary: " + emp2.getSalary());

	}

}
