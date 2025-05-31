public class PrimeChecker {
    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = number > 1;
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
    }
}
