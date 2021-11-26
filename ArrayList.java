import java.util.*;
public class Main_Page {
	public static void main(String[] args) {
		ArrayList<Integer> lst=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>(5);
	   System.out.println("Non parameterize Constructor");
	   System.out.println("Initial Size list is " + lst.size());
	   System.out.println("Add 25 in list : "+lst.add(25));
	   System.out.println("Add 35 in list : "+lst.add(35));
	   System.out.println("Add 45 at 2 position in list.");
	   lst.add(2, 45);
	   System.out.println("Value at 2 is : "+lst.get(2));
	   System.out.println("List contain 35 ? : "+lst.contains(35));
	   System.out.println("Index of 35 is : "+lst.indexOf(35));
	   System.out.println("Removing 25");
	   lst.remove(0);
	   System.out.println("Remove all elements from list");
	   lst.clear();
	   System.out.println("List is empty ? "+lst.isEmpty());
	   System.out.println("Apply Triming");
	   lst.trimToSize();
           System.out.println("\n\nParameterize Constructor");
           System.out.println("Initial Size list is " + list.size());
           System.out.println("Add 25 in list : "+list.add(25));
           System.out.println("Add 35 in list : "+list.add(35));
           System.out.println("Add 45 at 2 position in list.");
           list.add(2, 45);
           System.out.println("Value at 2 is : "+list.get(2));
           System.out.println("List contain 35 ? : "+list.contains(35));
           System.out.println("Index of 35 is : "+list.indexOf(35));
           System.out.println("Removing 25");
           list.remove(0);
           System.out.println("Remove all elements from list");
           list.clear();
           System.out.println("List is empty ? "+list.isEmpty());
           System.out.println("Apply Triming");
	   list.trimToSize(); }

