// /*
// Q6: Write a program to find the largest of three numbers using only the ternary operator
// (? :).
// */
public class Q6 {
	public static void main(String args[]){
		int a = 45;
		int b = 67;
		int c = 90;
		
		int largest = (a > b)?((a > c) ? a : c) : ((b > c) ? b : c);
		
		System.out.println("The largest number is: " + largest);
		
	}
}
/*
OUTPUT
C:\Nisha OOPJ\Assignment 2>java Q6
The largest number is: 90
*/
