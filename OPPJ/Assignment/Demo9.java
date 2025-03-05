//Write a program to check if a number is positive and even using logical operators (&&, ||, !).
public class Demo9 {
	public static void main(String[] args){
		int num1 = 24;
		if (num1 > 0 && num1 % 2 == 0){
			 System.out.println(num1 + " is a positive and even number.");
        } else {
            System.out.println(num1 + " is not both positive and even.");
        }
    }
}

C:\Nisha OOPJ\Assignment>javac Demo9.java

C:\Nisha OOPJ\Assignment>java Demo9
24 is a positive and even number.	