//Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.
public class Demo10 {
	public static void main(String[] args){
		int num = 20;
		int v = 4;
		System.out.println("Initial num: " + num);
		
		num += v;
		System.out.println(" Equal :" + num);
		
		num -= v;
		System.out.println(" add Equal :" + num);
		
		num *= v;
		System.out.println(" sub Equal :" + num);
		
		num /= v;
		System.out.println(" multi Equal :" + num);
		
		num %= v;
		System.out.println(" div Equal :" + num);
		
		
		
		
		
		
	}
}

Output
C:\Nisha OOPJ\Assignment>javac Demo10.java

C:\Nisha OOPJ\Assignment>java Demo10
Initial num: 20
 Equal :24
 add Equal :20
 sub Equal :80
 multi Equal :20
 div Equal :0