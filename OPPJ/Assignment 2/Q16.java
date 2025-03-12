public class Q16 {
	public static void main(String args[]){
		int num = 3;
		String res = (num > 0)? "Positive" : (num < 0)? "Negative" : "Zero";
		
		System.out.println("The number "+ num + " is : " + res);
	}
}
//OUTPUT
/*
	C:\Nisha OOPJ\Assignment 2>java Q16
The number -3 is : Negative

C:\Nisha OOPJ\Assignment 2>javac Q16.java

C:\Nisha OOPJ\Assignment 2>java Q16
The number 3 is : Positive
	
*/