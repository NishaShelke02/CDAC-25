public class Q23{
    public static void main(String[] args) {
        int num = 7; // Change this number to test
        
        
        String result = (num & 1) == 0 ? "Even" : "Odd";

        
        System.out.println(num + " is " + result);
    }
}
/*

C:\Nisha OOPJ\Assignment 2>java Q23
7 is Odd
*/
/*
7  = 0111 (Binary)  -  7 & 1 = 1  (Odd)
8  = 1000 (Binary)  -  8 & 1 = 0  (Even)
*/