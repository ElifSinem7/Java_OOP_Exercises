package Exercise3;

public class Rectangle {
	private int height;
	private int width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int calculateArea() {
		return height * width;
	}
	public int calculatePerimeter() {
		return 2 * (height + width);
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(15, 18);
		
		System.out.println("Rectangle's Height: " + rectangle.getHeight() + "\nWidth: " + rectangle.getWidth() + "\nArea: " + rectangle.calculateArea() + "\nPerimeter: " + rectangle.calculatePerimeter());
		
		rectangle.setHeight(17);
		rectangle.setWidth(23);
		
		System.out.println("\nRectangle's new height: " + rectangle.getHeight() + "\nNew width: " + rectangle.getWidth()  +"\nNew area: " + rectangle.calculateArea() + "\nNew perimeter: " + rectangle.calculatePerimeter());

	}

}
