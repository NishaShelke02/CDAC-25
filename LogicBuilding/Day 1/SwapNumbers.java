public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }
}
