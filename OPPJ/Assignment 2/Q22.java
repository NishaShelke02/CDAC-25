public class Q22 {
    public static void main(String[] args) {
        
        double num1 = 90, num2 = 75;
        char operator = '+'; // Change this to '+', '-', '*', '/'

        double res;

        
        switch (operator) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    res = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return; 
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                return; 
        }

        
        System.out.println("Result: " + res);
    }
}
/*

C:\Nisha OOPJ\Assignment 2>java Q22
Result: 6750.0

C:\Nisha OOPJ\Assignment 2>javac Q22.java

C:\Nisha OOPJ\Assignment 2>java Q22
Result: 165.0
*/