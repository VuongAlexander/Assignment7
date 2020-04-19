

public class Rectangle extends Shapes{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9042360969701386195L;
	String name;
	double length;
	double height;
	
	public Rectangle() {}
	
	public Rectangle(String name, double length, double height) {
		this.name = name;
		this.length = length;
		this.height = height;
	}

	
	public String getName() {
		return name;
	}


	public double getLength() {
		return length;
	}
	
	public double getHeight() {
		return height;
	}

	public double computeArea() {
		return length * height;
	}
	
	public String toString() {
		return "Shape name: " + name + "\n" + "Length: " + length + "\n" + "Height: " + height + "\n"
				+ "Area: " + computeArea() + "\n";
	}

}
