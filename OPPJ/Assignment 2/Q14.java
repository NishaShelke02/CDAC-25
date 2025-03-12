public class Q14 {
	public static void main(String args[]){
		int num = 13;
		int count = 0;
		
		while(num > 0){
			num = num & (num-1);
			count++;
		}
		
		System.out.println(" Number of 1s in binary representation of " + num +count );
	}
}
//output
/*

C:\Nisha OOPJ\Assignment 2>java Q14
 Number of 1s in binary representation of 04
 
 */