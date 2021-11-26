package ClassAssignment;
import java.util.*;
public class StackTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Stack<Integer> S1 = new Stack<>();
		Stack<Integer> S2 = new Stack<>();
		
		for(int i=1 ; i<4 ; i++)
		{
			System.out.print("Enter Value No "+i+ ": ");
			int value = input.nextInt();
			S1.push(value);	
		}
		
		S1.sort(null);
		int value1 = S1.pop();
		int value2 = S1.pop();
		S2.push(value1*value2);
		S2.push(S1.pop()+S2.pop());
		
		System.out.println("\nAnswer Of Value No.1 + No.2 x No.3 = "+S2.pop());
	
	}

}
