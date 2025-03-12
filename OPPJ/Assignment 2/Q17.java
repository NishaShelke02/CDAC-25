public class Q17 {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 75, d = 15;

        
        int min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : (c < d ? c : d)) 
                          : ((b < c) ? ((b < d) ? b : d) : (c < d ? c : d));

        
        System.out.println("Minimum number: " + min);
    }
}
//OUTPUT
/*
C:\Nisha OOPJ\Assignment 2>java Q17
Minimum number: 10
*/