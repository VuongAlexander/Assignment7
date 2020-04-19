

public class Hexagon extends Shapes{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4527164297386143189L;
	String name;
	double length;
	
	public Hexagon() {}
	
	public Hexagon(String name, double length) {
		this.name = name;
		this.length = length;
	}
	

	public double computeArea() {
		return ((3 * Math.sqrt(3))/2) * Math.pow(length, 2);
	}
	
	
	public String getName() {
		return name;
	}
	
	public double getLength() {
		return length;
	}
	
	public String toString() {
		return "Shape name: " + name + "\n" + "Length: " + length + "\n" + "Area: " + computeArea() + "\n";
	}
}
