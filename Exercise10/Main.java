package Exercise10;

public class Main {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(17, 21);
		Shape circle = new Circle(9);
		Shape triangle = new Triangle(12, 18, 11, 12, 15);
		
		System.out.println("Area and Perimeter of Various Shapes:  ");
		System.out.println("***** Recatngle *****");
		System.out.println("Area: " + rectangle.getArea() + "\nPerimeter: " + rectangle.getPerimeter());
		System.out.println("\n***** Circle *****");
		System.out.println("Area: " + circle.getArea() + "\nPerimeter: " + circle.getPerimeter());
		System.out.println("\n***** Triangle *****");
		System.out.println("Area: " + triangle.getArea() + "\nPerimeter: " + triangle.getPerimeter());
	}

}
