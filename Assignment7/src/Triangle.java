
public class Triangle extends Shapes{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6580466235302424198L;
	String name;
	double base;
	double height;
	
	public Triangle() {}
	
	public Triangle(String name, double base, double height) {
		this.name = name;
		this.base = base;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeArea() {
		return (base * height) / 2;
	}
	
	public String toString() {
		return "Shape name: " + name + "\n" + "Base: " + base + "\n" + "Height: " + height + "\n"
				+ "Area: " + computeArea() + "\n";
	}

}
