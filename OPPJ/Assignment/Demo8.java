//Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.
public class Demo8 {
	public static void main(String[] args){
		int num1 = 74;
		int num2 = 87;
		
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2)); // Equal to
        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2)); // Not equal to
        System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));   // Greater than
        System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));   // Less than
        System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2)); // Greater than or equal to
        System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
		
	}
}

OUTPUT
C:\Nisha OOPJ\Assignment>javac Demo8.java

C:\Nisha OOPJ\Assignment>java Demo8
74 == 87 : false
74 != 87 : true
74 > 87 : false
74 < 87 : true
74 >= 87 : false
74 <= 87 : true