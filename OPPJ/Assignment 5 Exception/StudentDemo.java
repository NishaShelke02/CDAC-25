import java.util.Scanner;
import java.util.*;

class Student {
	private String name;
	private int rollNo;
	private double[] marks =new double[5];
	private double average;
	private char grade;
	
	public Student(String name,int rollNo,double[] marks){
		this.name = name;
		this.rollNo=rollNo;
		
		for(int i=0;i<5;i++){
			if(marks[i]<0 || marks[i]>100){
				throw new IllegalArgumentException("Error: Marks must be in between 1 to 100");
			}
		}
		this.marks=marks;
	}
	public void calculateAverage(){
		double total = 0;
		
		//sum
		for(double m1 : marks){
			total += m1;
		}
		average=total/marks.length;
		
		if(average >= 90){
			grade='A';
		}else if(average >=80){
			grade='B';
		}else if(70 <=average){
			grade ='C';
		}else if (60 <= average){
			grade='D';
		}else{
			grade ='F';
		}
	}
	
	public void displayStudentInfo(){
		System.out.println(" Result ");
		System.out.println(" Name: "+name);
		System.out.println(" RollNo: "+rollNo);
		System.out.println(" Marks: "+Arrays.toString(marks));
		System.out.println(" Average: "+average);
		System.out.println(" Grade: "+grade);
	}
}
public class StudentDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter Student Name: ");
			String name=sc.nextLine();
			
			System.out.println("Enter Rollno: ");
			int rollNo = sc.nextInt();
			
			double[] marks=new double[5];
			
			
			System.out.println("Enter Marks for 5 Sub:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = sc.nextDouble();
			}
			
			Student st1 =new Student(name,rollNo,marks);
			st1.calculateAverage();
			st1.displayStudentInfo();
		}
		catch(InputMismatchException e){
			System.out.println("Error: valid numeric value");
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}

//OUTPUT
/*
C:\Nisha OOPJ\Assignment 5 Exception>java StudentDemo
Enter Student Name:
nisha
Enter Rollno:
0052
Enter Marks for 5 Sub:
Subject 1: 98
Subject 2: 78
Subject 3: 67
Subject 4: 98
Subject 5: 89
 Result
 Name: nisha
 RollNo: 52
 Marks: [98.0, 78.0, 67.0, 98.0, 89.0]
 Average: 86.0
 Grade: B
 
 //OUTPUT 2
 
C:\Nisha OOPJ\Assignment 5 Exception>java StudentDemo
Enter Student Name:
NISHA
Enter Rollno:
56
Enter Marks for 5 Sub:
Subject 1: 89
Subject 2: 56
Subject 3: 233
Subject 4: 78
Subject 5: 87
Error: Marks must be in between 1 to 100

//OUTPUT3
C:\Nisha OOPJ\Assignment 5 Exception>java StudentDemo
Enter Student Name:
vaibhav
Enter Rollno:
rtyt
Error: valid numeric value
*/


	
				
	
