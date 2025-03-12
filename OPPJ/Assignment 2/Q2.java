public class Q2 {
	public static void main(String[] args){
		int n = 8;
		int m = 7;
		
		
		if((m & 1)== 0){
			System.out.println(n + "is an even number");
		}else{
			System.out.println(m + "is an odd number");
		}
		if((n & 1)== 0){
			System.out.println(n + "is an even number");
		}else{
			System.out.println(m + "is an odd number");
		}
	}
}

//OUTPUT
/*C:\Nisha OOPJ\Assignment 2>java Q2
7is an odd number
8is an even number
*/