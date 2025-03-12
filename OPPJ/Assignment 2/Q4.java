public class Q4 {
	public static void main(String[] args){
		int n = 10;
		
		if(n<0){
			n = -n;
		}
		while(n>3){
			n =(n&3) + (n >> 2);
		}
		if(n==0 || n==3)
			System.out.println("Division by 3");
		else
			System.out.println("Not Division by 3");
	}
}
//OUTPUT
/*

C:\Nisha OOPJ\Assignment 2>java Q4
Division by 3
*/
C:\Nisha OOPJ\Assignment 2>javac Q4.java

C:\Nisha OOPJ\Assignment 2>java Q4
Not Division by 3
