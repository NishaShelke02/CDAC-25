public class PowerCalculator {
    public static void main(String[] args) {
        int base = 3;      // Hardcoded base number
        int exponent = 4;  // Hardcoded exponent number

        // Calculating power using Math.pow()
        int result = (int) Math.pow(base, exponent);

        // Displaying the result
        System.out.println(base + " raised to the power " + exponent + " is " + result);
    }
}
