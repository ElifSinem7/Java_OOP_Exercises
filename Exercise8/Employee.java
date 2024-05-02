package Exercise8;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public Employee(String name, double salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate){
		this.hireDate = hireDate;
	}
	public int getYearsOfService() {
		return Period.between(hireDate, LocalDate.now()).getYears();
	}
	

	public static void main(String[] args) {
		Employee employee1 = new Employee("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
		Employee employee2 = new Employee("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
		Employee employee3 = new Employee("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));
		
		System.out.println("*****Employee Details*****");
		System.out.println("First Employee: \nName: " + employee1.getName() + "\nSalary: " + employee1.getSalary() + "\nHire Date: " + employee1.getHireDate() + "\nYears of Service: " + employee1.getYearsOfService());
		System.out.println("\nSecond Employee: \nName: " + employee2.getName() + "\nSalary: " + employee2.getSalary() + "\nHire Date: " + employee2.getHireDate() + "\nYears of Service: " + employee2.getYearsOfService());
		System.out.println("\nThird Employee: \nName: " + employee3.getName() + "\nSalary: " + employee3.getSalary() + "\nHire Date: " + employee3.getHireDate() + "\nYears of Service: " + employee3.getYearsOfService());

	}

}
