
package javaapplication21;
import java .util.*;

public class JavaApplication21 {

    
    public static void main(String[] args) {
    
        System.out.println("Enter any string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Stack<Character> st = new Stack<Character>();
        
        
        for(int i =0; i<str.length(); i++)
        {   char ch = str.charAt(i);
                st.push(ch);
        }
        String output = "";
        for(int i=0;i<str.length();i++)
        {
            output +=st.pop();
        }
        System.out.println("Output is "+output);
    }
    
    
}
