public class Q21 {
    public static void main(String[] args) {
        int num = 5; 
        int inc = -(~num); 

        System.out.println("Original Number: " + num);
        System.out.println("Incremented Number: " + inc);
    }
}

/*
5  = 0000 0101  (Binary)
~5 = 1111 1010  (Bitwise NOT of 5)
-(~5) = -(1111 1010) = 0000 0110 (Decimal 6)
*/

//OUTPUT
//Original Number: 5
//Incremented Number: 6