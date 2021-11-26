package dts_class;
import java.util.Scanner;


public class DTS_Class_2 {
    public static void main(String[] args) {
    double arr[] = {10,20,30,24,78,89,99};
      double a =Search(arr,78);
   if(a == -1 )
   {
       System.out.println("Not Found");
   }
   else
   {
       System.out.println("Found");   
   }
        
    }
  
    private static int Search(double[] arr, int target) {
     int start, end, middle;
         start = 0;
        end =arr.length;
        while(start<=end){
            middle=(start+end)/2;
            if (target == arr[middle])
                return middle;
            if(target<arr[middle])
                end=middle;
            if(target >arr[middle])
                start=middle;
            
        }
        return -1;
        
          
    }
    
}
