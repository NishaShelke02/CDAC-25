// Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results
public class Demo7 {
	public static void main(String[] args){
		int a = 74;
		int b =54;
		int sum = a+b;
		int sub = a - b;
		int multi = a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println("Addition :" + sum);
		System.out.println("Subtraction :" + sub);
		System.out.println("Multipication :" + multi);
		System.out.println("Division :" + div);
		System.out.println("Modulus :" + mod);
	}
}

/*

Output
C:\Nisha OOPJ\Assignment>javac Demo7.java

C:\Nisha OOPJ\Assignment>java Demo7
Addition :128
Subtraction :20
Multipication :3996
Division :1
Modulus :20
*/