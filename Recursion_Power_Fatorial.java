package lab_assignment;
import java.util.Scanner;
public class LAB_Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of Factorial : ");
        int a = input.nextInt();
        System.out.println("Factorial is : "+Factorial(a));
        System.out.println("Enter base : ");
        int b = input.nextInt();
        System.out.println("Enter power : ");
        int c = input.nextInt();
        System.out.println("Power is : "+power(b,c));
        
        
    }
    public static int Factorial(int value)
    {
        if(value == 0)
        {
        return 1;    
        }
        else
        {
            return  (value * Factorial(value -1));
        }
    }
    
    public static int power(int base , int pow)
    {
        if(pow == 1)
        {
            return base;
        }
        else
        {
            return (base* power(base , pow-1));
        }
        
    }
    
}
