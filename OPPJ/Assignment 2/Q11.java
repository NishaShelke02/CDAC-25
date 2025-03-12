public class Q11 {
	public static void main(String[] args){
		check(16);
		check(7);
	}
	
	public static void check(int a){
		if(a<0) a = -a;
		if((a & (a-1))==0)
			System.out.println(a + " is a power of two");
		else
			System.out.println(a + " is not a power of two");
	}
}
/*
OUTPUT
C:\Nisha OOPJ\Assignment 2>java Q11
16 is a power of two
7 is not a power of two

*/