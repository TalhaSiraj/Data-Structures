import java.util.*;
public class BS {
	    public static void main(String[] args) {
	    	int St_No = 0,Courses = 0,Marks = 1;

	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Enter no of students : ");
	    	St_No = input.nextInt();
	    	
	    	System.out.println("No of Courses : ");
	    	Courses = input.nextInt();
	    	array obj = new array(St_No,Courses,Marks);
	    	
	    	obj.set_array();
	    	obj.Display();
	    	}
	    	}
	    	
	    	
	    	
	    	
	    	

	    	class array{
	    	
	    		int arr [][][] ;
	    		int A =0,B=0,C=0;
	    		Scanner input = new Scanner(System.in);
	    		array(int St_No,int Courses , int Marks)
	    		{
	    			A = St_No;
	    			B= Courses;
	    			C= Marks;
	    			arr= new int [St_No][Courses][Marks];
	    		}
	    		
	    		public void set_array()
	    		{
	    			for(int k = 0 ; k<A; k++)
	    	    	{
	    				System.out.println("Enter Student ID : ");
	    		
	    	    		System.out.println("Student : "+(k+1));
	    	    		for(int l = 0 ; l<B;l++)
	    	    		{
	    	    			System.out.println("Course no : "+(l+1));
	    	    			for(int m=0; m<1;m++)
	    	    			{
	    	    			System.out.println("Enter marks : ");
	    	    			arr[k][l][m] = input.nextInt();
	    	    			}
	    	    		}
	    	    	}
	    	    	
	    		}
	    		public void Display()
	    		{
	    			for(int k = 0 ; k<A; k++)
	    	    	{
	    				System.out.println("\nStudent : "+(k+1));
	    	    		for(int l = 0 ; l<B;l++)
	    	    		{
	    	    			System.out.println("\n\tCourse : "+(l+1));
	    	    			for(int m=0; m<C;m++)
	    	    			{
	    	    				System.out.print("\t\tMarks : "+arr[k][l][m]);
	    	    			}
	    	    		}
	    	    	}
	    			
	    		}
	    		
	    	}
	    	
	   