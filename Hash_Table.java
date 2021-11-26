package Assignment_Lab4;

import java.util.Hashtable;

public class Hash_Table {

	public static void main(String[] args) {

		System.out.println("Task 2\n");
		
		Hashtable<Integer,Integer> H_tab = new Hashtable<>();
		Hashtable<Integer,Integer> H_t_Clne = new Hashtable<>();
		
		System.out.println("œnitial size of Default Hashtable Constructor : "+H_tab.size());
		H_tab.put(000, 1000);
		H_tab.put(001, 1100);
		H_tab.put(002, 1200);
		H_tab.put(003, 1300);
		H_tab.put(004, 1400);
		System.out.println("Size of Default Hashtable Constructor after put some values : "+H_tab.size());
		System.out.println("H_tab contains 1000 : "+H_tab.contains(1000));
		System.out.println("H_tab contains key 001 : "+H_tab.containsKey(001));
		System.out.println("H_tab containsValue 1400 : "+H_tab.containsValue(1400));
		System.out.println("H_tab get(003) : "+H_tab.get(003));
		System.out.println("H_tab is empty? : "+H_tab.isEmpty());
		System.out.println("H_tab remove(001) "+H_tab.remove(001));
		System.out.println("H_tab contain key 001 ? : "+H_tab.containsKey(001));
		System.out.println("H_tab put(001,500)");
		H_tab.put(001, 500);
		System.out.println("H_tab contain key 001 ? : "+H_tab.containsKey(001));
		System.out.println("Creating Clone of H_tab");
		H_t_Clne = (Hashtable) H_tab.clone();
		System.out.println("Clone result is : "+H_t_Clne);
		System.out.println("Clear data from H_tab");
		H_tab.clear();
		System.out.println("H_tab is empty ? : "+H_tab.isEmpty());
		
		
		Hashtable<Integer,Integer> H_tab1 = new Hashtable<>(5);
		Hashtable<Integer,Integer> H_t1_Clne = new Hashtable<>(5);
	
		System.out.println("\n\nœnitial size of Parameterize Hashtable Constructor : "+H_tab1.size());
		H_tab1.put(000, 1210);
		H_tab1.put(001, 1220);
		H_tab1.put(002, 1230);
		H_tab1.put(003, 1240);
		H_tab1.put(004, 1250);
		H_tab1.put(005, 1260);
		System.out.println("Size of Parameterize Hashtable Constructor after put some values : "+H_tab1.size());
		System.out.println("H_tab1 contains 1000 : "+H_tab1.contains(1000));
		System.out.println("H_tab1 contains key 001 : "+H_tab1.containsKey(001));
		System.out.println("H_tab1 containsValue 1230 : "+H_tab1.containsValue(1230));
		System.out.println("H_tab1 get(003) : "+H_tab1.get(003));
		System.out.println("H_tab1 is empty? : "+H_tab1.isEmpty());
		System.out.println("H_tab1 remove(001) "+H_tab1.remove(001));
		System.out.println("H_tab1 contain key 001 ? : "+H_tab1.containsKey(001));
		System.out.println("H_tab1 put(001,500)");
		H_tab1.put(001, 500);
		System.out.println("H_tab1 contain key 001 ? : "+H_tab1.containsKey(001));
		System.out.println("Creating Clone of H_tab1");
		H_t1_Clne = (Hashtable) H_tab1.clone();
		System.out.println("Clone result is : "+H_t1_Clne);
		System.out.println("Clear data from H_tab1");
		H_tab1.clear();
		System.out.println("H_tab1 is empty ? : "+H_tab1.isEmpty());
	
		
	}

}
