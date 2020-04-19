import java.util.ArrayList;

public class MethodTest {
	private static <T> int count(ArrayList<T> list){
		return list.size();
		}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Double> list3 = new ArrayList<Double>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("F");
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		list3.add(1.0);
		list3.add(2.0);
		list3.add(3.0);
		list3.add(4.0);
		list3.add(5.0);
		list3.add(6.0);
		list3.add(7.0);
		list3.add(8.0);
		
		System.out.println(count(list));
		System.out.println(count(list2));
		System.out.println(count(list3));


	}
}
