public class Q15 {
	public static void main(String[] args) {
        int num = 56; // Example: Binary = 10111
        int swapped = num1(num);
		
		 System.out.println("Original number: " + num);
        System.out.println("Swapped number: " + swapped);
    }
		
		
    public static int num1(int x) {
        int evenBits = (x & 0xAAAAAAAA) >> 1; // shift even bits right
        int oddBits = (x & 0x55555555) << 1;  // shift odd bits left
        return evenBits | oddBits; // Combine swapped bits
    }     
       
}
//output
/*
C:\Nisha OOPJ\Assignment 2>java Q15
Original number: 56
Swapped number: 52
*/
