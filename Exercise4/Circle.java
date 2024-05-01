package Exercise4;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {
		Circle circle = new Circle(6.3);
		
		System.out.println("Circle's radius: " + circle.getRadius() + "\nArea: " + circle.calculateArea() + "\nCircumference: " + circle.calculateCircumference());
		
		circle.setRadius(7.6);
		System.out.println("\nCircle's new radius: " + circle.getRadius() + "\nNew area: " + circle.calculateArea() + "\nNew circumference: " + circle.calculateCircumference());

	}

}
