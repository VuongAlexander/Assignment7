

public class Circle extends Shapes{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8737415691950117239L;
	String name;
	double radius;
	
	public Circle() {}
	
	public Circle(String name, double radius) {
		this.name = name;
		this.radius = radius;
	}
	
	public String getName() {
		return name;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		return "Shape name: " + name + "\n" + "Radius: " + radius + "\n" + "Area: " + computeArea() + "\n";
	}
}
