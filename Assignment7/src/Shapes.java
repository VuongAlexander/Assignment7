import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shapes implements Serializable, Shape{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -697638351259475938L;
	private ArrayList<Shape> shapeList;
	
	public Shapes() {
		shapeList = new ArrayList<Shape>();
	}
	
	public List<Shape> getList(){
		return shapeList;
	}
	
	public void add(Shape s)
    {
		shapeList.add(s);
    }
	
	public void remove(Shape s) {
		shapeList.remove(s);
	}

	public void compute() {
		for(Shape s : shapeList){
			System.out.println(s.computeArea());
		}
	}
	
	public Shape max() {
		return Collections.max(shapeList, Comparator.comparing(s -> s.computeArea()));
	}
	
	public Shape min() {
		return Collections.min(shapeList, Comparator.comparing(s -> s.computeArea()));
	}
	

	@Override
	public double computeArea() {
		return 0;
	}

	/*@Override
	public void run() {
		try{ 
			// Displaying the thread that is running 
			System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
			compute();
			max();
			min();
			
			System.out.println();
			
			System.out.println("Max is:\n" + max().toString());
			System.out.println("Min is:\n" + min().toString());
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getId() + " is done");
			
	    } 
		catch (Exception e) { 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	}
	
	public void start() {
		System.out.println ("Starting " + Thread.currentThread().getId()); 
		run();
	}*/
}
