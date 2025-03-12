/* Implement a program that calculates the sum of digits of an integer using modulus
(%) and division (/) operators.
*/
public class Q3 {
	public static void main(String[] args){
		int n = 4985;
		int v = 0;
		
		
		while(n >0) {
			v =  v +(n%10);
			n = n/10;
		}
		System.out.println("Sum: " + v);
	}
}
//OUTPUT
/*

C:\Nisha OOPJ\Assignment 2>java Q3
Sum: 26
*/