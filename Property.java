package Assignment_Lab4;

import java.util.Properties;

public class Prop {

	public static void main(String[] args) {

		System.out.println("Task 3\n");
		Properties p1 = new Properties();
		
		p1.setProperty("key1","A");
		p1.setProperty("key2","B");
		p1.setProperty("key3","C");
		p1.setProperty("key4","D");
		
		System.out.println("get(Key1) : "+p1.getProperty("key1"));
		System.out.println("get(Key1) and defaultproperty : "+p1.getProperty("key1","defaultProperty"));
		System.out.println("get(Key5) : "+p1.getProperty("key5"));
		System.out.println("setProperty('key5','E') : ");
		p1.setProperty("key5","E");
		System.out.println("get(Key5) : "+p1.getProperty("key5"));
		System.out.println("Property Name : "+p1.propertyNames());
	}

}
