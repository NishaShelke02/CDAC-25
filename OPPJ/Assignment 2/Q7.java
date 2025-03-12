import java.util.Scanner;
public class Q7 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		
	
		if(year%400 ==0 || (year %4 == 0 && year%100!=0))
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");		
		
	}
}
//Output
/*
C:\Nisha OOPJ\Assignment 2>java Q7
2026
2026is not a leap year

C:\Nisha OOPJ\Assignment 2>javac Q7.java

C:\Nisha OOPJ\Assignment 2>java Q7
2027
2027 is not a leap year

*/