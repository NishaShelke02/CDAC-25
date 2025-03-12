public class Q25 {
    public static void main(String[] args) {
        int num = 12345; 
        int rev= 0;

        while (num != 0) {
            rev = rev * 10 + num % 10; 
            num /= 10; 
        }

        System.out.println("Reversed Number: " + rev);
    }
}
//OUTPUT
/*
C:\Nisha OOPJ\Assignment 2>java Q25
Reversed Number: 54321
*/