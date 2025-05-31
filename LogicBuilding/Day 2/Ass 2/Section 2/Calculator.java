public class Calculator {
    public static void main(String[] args) {
        double num1 = 24, num2 = 0; 
        char operator = '/'; 
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operator! Use +, -, *, or /.");
        }
    }
}

/*
INPUT 10,5,+

C:\Nishajava\Day 2\Ass 2\Section 2> javac Calculator.java

C:\Nishajava\Day 2\Ass 2\Section 2> java Calculator
Result: 2.0

*/

//INPUT  24,3,/

/*
C:\Nishajava\Day 2\Ass 2\Section 2> javac Calculator.java

C:\Nishajava\Day 2\Ass 2\Section 2> java Calculator
Result: 8.0

*/

//INPUT 24,0,/




