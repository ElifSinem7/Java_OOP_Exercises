package Exercise9;
import java.util.ArrayList;

public class Student {
	private String name;
	private int grade;
	private ArrayList < String > courses;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		this.courses = new ArrayList < String > ();
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public ArrayList < String > getCourses(){
		return courses;
	}
	public void addCourse(String course) {
		courses.add(course);
	}
	public void removeCourse(String course) {
		courses.remove(course);
	}

	public static void main(String[] args) {
		Student student1 = new Student("Carolus Vitali", 11);
		Student student2 = new Student("Nakeisha Uhuru", 10);
		Student student3 = new Student("Gabriella Cherice", 10);
		
		System.out.println("***** Student Details *****");
		System.out.println("First Student Name: " + student1.getName() + "\nGrade: " + student1.getGrade());
		System.out.println("\nSecond Student Name: " + student2.getName() + "\nGrade: " + student2.getGrade());
		System.out.println("\nThird Student Name: " + student3.getName() + "\nGrade: " + student3.getGrade());
		
		System.out.println("\nAdding courses for students: ");
		student1.addCourse("Math");
		student1.addCourse("History");
		student1.addCourse("English");
		System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
		student2.addCourse("Science");
		student2.addCourse("Math");
		student2.addCourse("History");
		System.out.println(student2.getName() + "'s courses: " + student2.getCourses());
		student3.addCourse("Sport");
		student3.addCourse("Geography");
		System.out.println(student3.getName() + "'s courses: " + student3.getCourses());
		
		System.out.println("\nRemoving some courses: ");
		student1.removeCourse("English");
		System.out.println(student1.getName() + "'s courses now: " + student1.getCourses());
		student2.removeCourse("History");
		System.out.println(student2.getName() + "'s courses now: " + student2.getCourses());
		System.out.println(student3.getName() + "'s courses now: " + student3.getCourses());
		

	}

}
