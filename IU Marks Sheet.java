package LAB-1Task;
import java.util.*;
public class Main_Page {
                public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
		String Student = "Talha Ahmed", RegistrationNumber= "112255";
		String [] Subject_name = new String[5];
		double [] Max_Marks = new double[5];
		double [] Scored_Marks = new double[5];
		IU_Mark_Sheet  IMS = new IU_Mark_Sheet(Student, RegistrationNumber);
		for(int a = 0 ; a<Subject_name.length ; a++) {
			System.out.println("Enter subject name : ");
			Subject_name[a] = input.next();
			System.out.println("Enter Scored Marks : ");
			Scored_Marks[a] = input.nextDouble();
			System.out.println("Enter Max Marks : ");
			Max_Marks[a] = input.nextDouble();
			IMS.Subject_Name(Subject_name);
			IMS.Subject_Scored_Marks(Scored_Marks);
			IMS.Subject_Max_Marks(Max_Marks); }
		System.out.println("Student GPA is : "+IMS.StudentGPA()); } }
                class IU_Mark_Sheet{
	                String Student,RegistrationNumber;
	                String [] Subject_name = new String[5];
	                double [] Max_Marks = new double[5];
	                double [] Scored_Marks = new double[5];
	                double [] GPA_Each_Course = new double[5];
	                int assume_Total_Credit_hour = 15;
	                int assume_Credit_hour_each_course = 3;
	                int a = 0;	
                IU_Mark_Sheet(String student, String registrationNumber) {
	                this.Student = student;
	                this.RegistrationNumber = registrationNumber; }
                public void Subject_Name(String [] subject_name) {
	                if(a == Subject_name.length) {
		        System.out.println("Array is Full"); }
	                else {
		        Subject_name [a] = subject_name[a]; } }
                public void Subject_Scored_Marks(double [] subject_scored_marks) {
	                Scored_Marks [a] = subject_scored_marks[a]; }
                public void Subject_Max_Marks(double [] subject_max_marks) {
	                Max_Marks [a] = subject_max_marks[a];
	                a++; }
                public double StudentGPA() {
	                int sum_Grade = 0;
	        for(int loop = 0 ; loop<a ; loop++) {
		        if(Scored_Marks [loop] >= 85) {
			GPA_Each_Course [loop] = 4; }
		        if(Scored_Marks [loop] >= 80 && Scored_Marks [loop] < 85) {
			GPA_Each_Course [loop] = 3.5; }
		        if(Scored_Marks [loop] >= 75 && Scored_Marks [loop] < 80) {
			GPA_Each_Course [loop] = 3; }
		        if(Scored_Marks [loop] >= 70 && Scored_Marks [loop] < 75) {
			GPA_Each_Course [loop] = 2.5; }
		        if(Scored_Marks [loop] >= 65 && Scored_Marks [loop] < 70) {
			GPA_Each_Course [loop] = 2; }
		        if(Scored_Marks [loop] < 65) {
			GPA_Each_Course [loop] = 0; } }
	        for(int loop = 0 ; loop<a ; loop++) {
		        sum_Grade += GPA_Each_Course [loop]; }
	                return ((assume_Credit_hour_each_course*sum_Grade)/assume_Total_Credit_hour); }
                }
