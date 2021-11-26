package Assignment_Lab4;
import java.util.*;
public class Stack_Assignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Task 1");

		Stack<Integer> ST1= new Stack<>();
		
		ST1.push(5);
		ST1.push(6);
		ST1.push(7);
		ST1.push(4);
		
		System.out.println("Size is : "+ST1.size());
		System.out.println("Peek value is : "+ST1.peek());
		System.out.println("Pop value is : "+ST1.pop());
		System.out.println("Is stack empty ? "+ST1.empty());
		System.out.println("Push 10 into Stack "+ST1.push(10));
		System.out.println("Searching 10 in Stack");
		System.out.println("10 available ? : "+ST1.search(10));
		
	}

}
