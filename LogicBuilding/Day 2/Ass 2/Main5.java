//Snippet 16:

/*
public class Main5 {
 public static void main(String[] args) {
 	int num = 10;
 	double result = num / 4;
 		System.out.println(result);
 }
} 


C:\Nishajava\Day 2\Ass 2> javac Main5.java

C:\Nishajava\Day 2\Ass 2> java Main5
2.0

*/
//-----------------------------------------------------------------------------------------

//Snippet 17:
/*
public class Main5 {
 public static void main(String[] args) {
  	int a = 10;
 	int b = 5;
 	int result = a ** b;
 	System.out.println(result);
 }
}

C:\Nishajava\Day 2\Ass 2> javac Main5.java
Main5.java:27: error: illegal start of expression
        int result = a ** b;
                        ^
1 error

ANS--  Invalid operator

*/

/*
public class Main5 {
 public static void main(String[] args) {
  	int a = 10;
 	int b = 5;
 	int result = a * b;
 	System.out.println(result);
 }
}


C:\Nishajava\Day 2\Ass 2> java Main5
50
*/
//-----------------------------------------------------------------------------------------

//Snippet 18:

/*
public class Main5 {
 public static void main(String[] args) {
 	int a = 10;
 	int b = 5;
 	int result = a + b * 2;
 	System.out.println(result);
 }
}


C:\Nishajava\Day 2\Ass 2> java Main5
20

*/

//-----------------------------------------------------------------------------------------

//Snippet 19:
/*
public class Main5 {
 public static void main(String[] args) {
 	int a = 10;
 	int b = 0;
 	int result = a / b;
 	System.out.println(result);
 }
}

C:\Nishajava\Day 2\Ass 2> java Main5
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main5.main(Main5.java:84)
 
Ans -- Division by Zero is Undefined
*/
//----------------------------------------------------------------------------------------

//Snippet 20:
/*
public class Main5 {
 public static void main(String[] args) {
 	System.out.println("Hello, World")
 }
} 


C:\Nishajava\Day 2\Ass 2> javac Main5.java
Main5.java:101: error: ';' expected
        System.out.println("Hello, World")
                                          ^
1 error


// CORRECT CODE- 

public class Main5 {
 public static void main(String[] args) {
 	System.out.println("Hello, World");
 }
} 
 

C:\Nishajava\Day 2\Ass 2> java Main5
Hello, World
*/

//-----------------------------------------------------------------------------------------

//Snippet 21:
/*

public class Main5 {
 public static void main(String[] args) {
 	System.out.println("Hello, World!");
 // Missing closing brace here
}

C:\Nishajava\Day 2\Ass 2> javac Main5.java
Main5.java:135: error: reached end of file while parsing
}
 ^
1 error
*/
//-----------------------------------------------------------------------------------------

//Snippet 22:

/*
public class Main5 {
 public static void main(String[] args) {
 	static void displayMessage() {
 		System.out.println("Message");
  }
 }
} 


C:\Nishajava\Day 2\Ass 2> javac Main5.java
Main5.java:150: error: illegal start of expression
        static void displayMessage() {
        ^
Main5.java:154: error: class, interface, or enum expected
}
^
2 errors



Ans--Cannot Declare a Method (static void displayMessage()) Inside Another Method 
*/

//----------------------------------------------------------------------------------------

//Snippet 23:

/*
public class Main5 {
    public static void main(String[] args) {
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("Value is 1");
            case 2:
                System.out.println("Value is 2"); 
            case 3:
                System.out.println("Value is 3"); 
            default:
                System.out.println("Default case");         }
    }
}


C:\Nishajava\Day 2\Ass 2> javac Main5.java

C:\Nishajava\Day 2\Ass 2> java Main5
Value is 2
Value is 3
Default case

Ans -- there are no break statements, execution does not stop after printing "Value is 2".
*/	


//CORRECT CODE--


/*
public class Main5 {
    public static void main(String[] args) {
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break; 

            case 2:
                System.out.println("Value is 2");
                break; 

            case 3:
                System.out.println("Value is 3");
                break; 

            default:
                System.out.println("Default case");
                break; 
        }
    }
}


C:\Nishajava\Day 2\Ass 2> java Main5
Value is 2
*/
//-------------------------------------------------------------------------------------------

//Snippet 24:

/*
public class Main5 {
 public static void main(String[] args) {
 	int level = 1;
 	switch(level) {
 		case 1:
 		System.out.println("Level 1");
		 case 2:
 		System.out.println("Level 2");
 		case 3:
 		System.out.println("Level 3");
 		default:
 		System.out.println("Unknown level");
 	}
 }
}


C:\Nishajava\Day 2\Ass 2> javac Main5.java

C:\Nishajava\Day 2\Ass 2> java Main5
Level 1
Level 2
Level 3
Unknown level

ANS -- Using Break for stops execution here
*/

//Correct Code--


/*
public class Main5 {
    public static void main(String[] args) {
        int level = 1;
        switch (level) {
            case 1:
                System.out.println("Level 1");
                break; 

            case 2:
                System.out.println("Level 2");
                break;

            case 3:
                System.out.println("Level 3");
                break; 

            default:
                System.out.println("Unknown level");
                break; 
        }
    }
}

OUTPUT--

C:\Nishajava\Day 2\Ass 2> javac Main5.java

C:\Nishajava\Day 2\Ass 2> java Main5
Level 1

*/
//---------------------------------------------------------------------------------------


//Snippet 25:

/*

public class Main5 {
 public static void main(String[] args) {
 	double score = 85.0;
 	switch(score) {
 		case 100:
 		System.out.println("Perfect score!");
 		break;
 		case 85:
 		System.out.println("Great job!");
 		break;
 		default:
 		System.out.println("Keep trying!");
 	}
 }
} 


C:\Nishajava\Day 2\Ass 2> javac Main5.java
Main5.java:311: error: incompatible types: possible lossy conversion from double to int
        switch(score) {
              ^
1 error


ANS -- switch statement only works with specific types:

	Allowed types: byte, short, char, int, String, and enum
	Not allowed: double, float, long, boolean
	Since score is likely a double, the compiler throws an "incompatible types" error 	because a double cannot be used as a switch expression.
*/

//-----------------------------------------------------------------------------------------

//Snippet 26:

public class Main5 {
    public static void main(String[] args) {
        int number = 5;
        switch (number) {
            case 5:
                System.out.println("Number is 5");
                break;
            case 5: 
                System.out.println("This is another case 5");
                break;
            default:
                System.out.println("This is the default case");
        }
    }
}

C:\Nishajava\Day 2\Ass 2> javac Main5.java
Main5.java:351: error: duplicate case label
            case 5:
            ^
1 error




