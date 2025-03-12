public class Q13 {
    public static void main(String[] args) {
		int num = -26;
		int mask = num >> 31;
		int abs = (num + mask)^ mask;
		
		System.out.println  ("Absolute value of " + num + " is: " + abs);
	}
}

	//OUTPUT
/*

C:\Nisha OOPJ\Assignment 2>java Q13
Absolute value of -26 is: 26
*/
	