public class Q1 {
	public static void main(String[] args){
		int a = 4;
		int b = 8;
	
		int result = a^b;
		System.out.println("Befor Swaping : " +result);
	
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("Afer Swaping : " + "a: " + a + " b: " +b);
	}
}

//OUTPUT

/*
C:\Nisha OOPJ\Assignment 2>javac Q1.java

C:\Nisha OOPJ\Assignment 2>java Q1
Befor Swaping : 12
Afer Swaping : a: 8 b: 4
*/