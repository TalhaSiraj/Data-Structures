package dts_class;
import java.util.Scanner;


public class DTS_Class {
    public static void main(String[] args) {
    double arr[] = {10,20,30,24,78,56,98};
        
    Scanner input = new Scanner(System.in);
    double num = input.nextDouble();
    
    Search(arr,num);
    }
    
    public static void Search(double b[] ,double target)
    {
        for(int a = 0 ; a<b.length ; a++)
        {
            
            if(b[a] == target)
            {
                System.out.println("Target found");
                break;
            }
            
        }
               
    }
    
}
