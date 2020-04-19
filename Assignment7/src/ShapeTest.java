import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ShapeTest{
	
	public static void main(String[] args) {
		Shapes list = new Shapes();
		
		Rectangle r1 = new Rectangle("Rectangle 1", 10.0, 10.0);
		Rectangle r2 = new Rectangle("Rectangle 2", 10.0, 5.0);
		Triangle t1 = new Triangle("Triangle 1", 8.0, 4.0);
		Triangle t2 = new Triangle("Triangle 2", 12.0, 3.0);
		Circle c1 = new Circle("Circle 1", 100.0);
		Circle c2 = new Circle("Circle 2", 8.0);
		Hexagon h1 = new Hexagon("Hexgon 1", 4.0);
		Hexagon h2 = new Hexagon("Hexagon 2", 12.0);
		
		list.add(r1);
		list.add(r2);
		list.add(t1);
		list.add(t2);
		list.add(c1);
		list.add(c2);
		list.add(h1);
		list.add(h2);
		
		new Thread() {
			public void run() {
				list.compute();
			}
		}.start();
		
		new Thread() {
			public void run() {
				list.compute();
			}
		}.start();
		
		
		try {
			
			FileOutputStream streamOut = new FileOutputStream("./obj1.ser");
			ObjectOutputStream objectOutput = new ObjectOutputStream(streamOut);
			objectOutput.writeObject(r1);
			objectOutput.close();
			streamOut.close();
			System.out.println("\nSerialized data is saved in obj1.ser");
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		try {
			
			FileOutputStream streamOut = new FileOutputStream("./obj2.ser");
			ObjectOutputStream objectOutput = new ObjectOutputStream(streamOut);
			objectOutput.writeObject(r2);
			objectOutput.close();
			streamOut.close();
			System.out.println("\nSerialized data is saved in obj2.ser");
		}
		catch(IOException e){
			System.out.println(e);
		}

		try {
	
			FileOutputStream streamOut = new FileOutputStream("./obj3.ser");
			ObjectOutputStream objectOutput = new ObjectOutputStream(streamOut);
			objectOutput.writeObject(t1);
			objectOutput.close();
			streamOut.close();
			System.out.println("\nSerialized data is saved in obj3.ser");
		}
		catch(IOException e){
			System.out.println(e);
		}

		try {
	
			FileOutputStream streamOut = new FileOutputStream("./obj4.ser");
			ObjectOutputStream objectOutput = new ObjectOutputStream(streamOut);
			objectOutput.writeObject(t2);
			objectOutput.close();
			streamOut.close();
			System.out.println("\nSerialized data is saved in obj4.ser");
		}
		catch(IOException e){
			System.out.println(e);
		}

		try {
	
			FileOutputStream streamOut = new FileOutputStream("./obj5.ser");
			ObjectOutputStream objectOutput = new ObjectOutputStream(streamOut);
			objectOutput.writeObject(c1);
			objectOutput.close();
			streamOut.close();
			System.out.println("\nSerialized data is saved in obj5.ser");
		}
		catch(IOException e){
			System.out.println(e);
		}

		try {
	
			FileOutputStream streamOut = new FileOutputStream("./obj6.ser");
			ObjectOutputStream objectOutput = new ObjectOutputStream(streamOut);
			objectOutput.writeObject(c2);
			objectOutput.close();
			streamOut.close();
			System.out.println("\nSerialized data is saved in obj6.ser");
		}
		catch(IOException e){
			System.out.println(e);
		}

		try {
	
			FileOutputStream streamOut = new FileOutputStream("./obj7.ser");
			ObjectOutputStream objectOutput = new ObjectOutputStream(streamOut);
			objectOutput.writeObject(h1);
			objectOutput.close();
			streamOut.close();
			System.out.println("\nSerialized data is saved in obj7.ser");
		}
		catch(IOException e){
			System.out.println(e);
		}

		try {
	
			FileOutputStream streamOut = new FileOutputStream("./obj8.ser");
			ObjectOutputStream objectOutput = new ObjectOutputStream(streamOut);
			objectOutput.writeObject(h2);
			objectOutput.close();
			streamOut.close();
			System.out.println("\nSerialized data is saved in obj8.ser");
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		list.max();
		list.min();
		
		System.out.println();
		
		System.out.println("Max is:\n" + list.max().toString());
		System.out.println("Min is:\n" + list.min().toString());
	}
}
