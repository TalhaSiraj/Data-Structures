import java.util.*;
public class Main_Page {
	public static void main(String[] args) {
	Vector<String> v1 = new Vector<>();
	Vector<Integer> v2 = new Vector<>(5);
	System.out.println("Initial cpacity of V1 : "+v1.capacity());
	System.out.println("Add 'S' in v1 "+v1.add("S"));
	v1.addElement("P");
	v1.addElement("Q");
	System.out.println("Add Element Water at 3 position in v1");
	v1.add(3,"Water");
	System.out.println("Value at 3 is : "+v1.get(3));
	System.out.println("V1 contain 'P' : "+v1.contains("P"));
	System.out.println("Index of 'P' is : "+v1.indexOf("P"));
	System.out.println("Remove 'P' : "+v1.remove("P"));
	System.out.println("V1 contain 'P' : "+v1.contains("P"));
	System.out.println("Values stores are : "+v1);
	System.out.println("Size of v1 is : "+v1.size());
	System.out.println("Apply Trim size of V1 ");
	v1.trimToSize();
	System.out.println("Clearing V1");
	v1.clear();
	System.out.println("Size of v1 is : "+v1.size());
	System.out.println("Apply toArray[] method : ");

	Object[] arr = v1.toArray();
	for(int a= 0 ; a<arr.length ; a++) {
        System.out.println(arr[a]); }
	System.out.println("\n\nInitial size of V2 is : "+v2.size());
	System.out.println("Initial cpacity of V2 : "+v2.capacity());
	System.out.println("Add 2 in v2 "+v2.add(2));
	v2.addElement(45);
	v2.addElement(32);
	System.out.println("Add Element 5 at 3 position in v2");
	v2.add(3,5);
	System.out.println("Value at 3 is : "+v2.get(3));
	System.out.println("V2 contain 32 : "+v2.contains(32));
	System.out.println("Index of 32 is : "+v2.indexOf(32));
	System.out.println("Remove 32 : "+v2.remove(2));
	System.out.println("V2 contain 32 : "+v2.contains(32));
	System.out.println("Values stores are : "+v2);
	System.out.println("Size of v2 is : "+v2.size());
	System.out.println("Trim size of V2 : ");
	v2.trimToSize();
	System.out.println("Clearing V2");
	v2.clear();
	System.out.println("Size of v2 is : "+v2.size());
	System.out.println("Apply toArray[] method : "+v2.toArray()); }
}
