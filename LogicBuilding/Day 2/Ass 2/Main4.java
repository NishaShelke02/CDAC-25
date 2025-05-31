/*
//Snippet 4:

public class Main4 {
 public static void main() {
	 System.out.println("Hello, World!");
 }
} 


C:\Nishajava\Day 2\Ass 2>java Main4
Error: Main method not found in class Main4, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/


//Corrected Code

/*public class Main4 {
 public static void main(String[] args) {
	 System.out.println("Hello, World!");
 }
} 

C:\Nishajava\Day 2\Ass 2>javac Main4.java

C:\Nishajava\Day 2\Ass 2>java Main4
Hello, World!
*/

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Snippet 5:

/*public class Main4 {
 public static void main(String[] args) {
 	System.out.println("Main method with String[] args");
 }
 public static void main(int[] args) {
 	System.out.println("Overloaded main method with int[] args");
 }
} 

C:\Nishajava\Day 2\Ass 2>javac Main4.java

C:\Nishajava\Day 2\Ass 2>java Main4
Main method with String[] args

explaination: 
yes, Have A multiple main methods in java
String[] args -Standard Main method
(int[] args - Overloaded main method 
different parameter type (int[] instead of String[]).

-----------------------------------------------------------------------------------------
Snippet 6:
*/
/*public class Main4 {
 public static void main(String[] args) {
 	int x = y + 10;
 		System.out.println(x);
 }
}

C:\Nishajava\Day 2\Ass 2>javac Main4.java
Main4.java:57: error: cannot find symbol
        int x = y + 10;
                ^
  symbol:   variable y
  location: class Main4
1 error

Ans:- Variable y is not declared.
 Every variable must have a define data type. Not assume default values for local variables
*/


//Corrected Code
/*

 public class Main4 {
    public static void main(String[] args) {
        int y = 5;   // Declare y 
        int x = y + 10;    //here y is define
        System.out.println(x); 
    }
}

*/
//-----------------------------------------------------------------------------------

//Snippet 7:
/*

public class Main4 {
 public static void main(String[] args) {
 	int x = "Hello";
 		System.out.println(x);
 }
}



C:\Nishajava\Day 2\Ass 2>javac Main4.java
Main4.java:89: error: incompatible types: String cannot be converted to int
        int x = "Hello";
                ^
1 error

ANS:- incompatible types: String cannot be converted to int
      Hello is string,but x is declared as int
  
Why Does Java Enforce Type Safety?
-->  Every variable must have a declared type (int, double, String, etc)

*/
 //Correcte Statement-
/*
public class Main4 {
 public static void main(String[] args) {
 	int x = 45;
	String y =  "Hello";
 		System.out.println("x: " + x + ", y: " + y);

 }
}
  
C:\Nishajava\Day 2\Ass 2>java Main4
x: 45, y: Hello 
*/
//--------------------------------------------------------------------------------

//Snippet 8:

/*
public class Main4 {
 public static void main(String[] args) {
 	System.out.println("Hello, World!"
 }
}

C:\Nishajava\Day 2\Ass 2>javac Main4.java
Main4.java:132: error: ')' expected
        System.out.println("Hello, World!"
                                          ^
1 error

Ans--> ')'  missing closing parenthesis and semicolon ';'
*/

//Corrected Code-
/*
public class Main4 {
 public static void main(String[] args) {
 	System.out.println("Hello, World!");
 }
}
*/
//--------------------------------------------------------------------------------------

// Snippet 9:

/*
public class Main4 {
 public static void main(String[] args) {
 int class = 10;
 System.out.println(class);
 }
} 


C:\Nishajava\Day 2\Ass 2>javac Main4.java
Main4.java:167: error: not a statement
 int class = 10;
 ^
Main4.java:167: error: ';' expected
 int class = 10;
    ^
Main4.java:167: error: <identifier> expected
 int class = 10;
          ^
Main4.java:168: error: <identifier> expected
 System.out.println(class);
                   ^
Main4.java:168: error: illegal start of type
 System.out.println(class);
                    ^
Main4.java:168: error: <identifier> expected
 System.out.println(class);
                         ^
Main4.java:170: error: reached end of file while parsing
}
 ^
7 errors


//Ans--> Class is a reserved keyword.
	

*/


/*

public class Main4 {
 public static void main(String[] args) {
 int c = 10;
 System.out.println(c);
 }
} 

*/
//---------------------------------------------------------------------------------------

//Snippet 10:

/*
public class Main4 {
 public void display() {
 	System.out.println("No parameters");
 }
 public void display(int num) {
 	System.out.println("With parameter: " + num);
 }
 public static void main(String[] args) {
 display();
 display(5);
 }
} 


C:\Nishajava\Day 2\Ass 2>javac Main4.java
Main4.java:227: error: non-static method display() cannot be referenced from a static context
 display();
 ^
Main4.java:228: error: non-static method display(int) cannot be referenced from a static context
 display(5);
 ^
2 errors


Ans--> Non static method

*/
//-----------------------------------------------------------------------------------------

//Snippet 11:

/*
public class Main4 {
 public static void main(String[] args) {
 	int[] arr = {1, 2, 3};
 		System.out.println(arr[5]);
 }
} 

C:\Nishajava\Day 2\Ass 2>javac Main4.java

C:\Nishajava\Day 2\Ass 2>java Main4
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main4.main(Main4.java:253)
  

ANS--> Arrays in Java fixed sizes
	Indexing starts at 0
*/

/*
public class Main4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[2]); 
    }
}

C:\Nishajava\Day 2\Ass 2> java Main4
3


*/


//-----------------------------------------------------------------------------------------


//Snippet 12:

/*
public class Main4 {
  public static void main(String[] args) {
 	while (true) {
 		System.out.println("Infinite Loop");
 	}
  }
} 




Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop

C:\Nishajava\Day 2\Ass 2>

ANS - program enters an infinite loop and continuously prints "Infinite Loop" to the console.
	Ctrl + C (Terminal)
	Use a valid exit condition (while (i < limit) avoid infinite loops
	Use a break statement inside while (true)
*/

//-----------------------------------------------------------------------------------------

//Snippet 13:

/*
public class Main4 {
   public static void main(String[] args) {
 	String str = null;
 		System.out.println(str.length());
 	}
} 

C:\Nishajava\Day 2\Ass 2> javac Main4.java

C:\Nishajava\Day 2\Ass 2> java Main4
Exception in thread "main" java.lang.NullPointerException
        at Main4.main(Main4.java:332)


Ans - str is not pointing to any object
	null means no object is assigned to the variable
*/

//Correcte Code-	

/*
public class Main4 {
    public static void main(String[] args) {
        String str = "Nisha"; 
       	      System.out.println(str.length()); // No error
    }
}

C:\Nishajava\Day 2\Ass 2> javac Main4.java

C:\Nishajava\Day 2\Ass 2> java Main4
5

*/


//-------------------------------------------------------------------------------------------
//Snippet 14:
/*
public class Main4 {
 public static void main(String[] args) {
 	double num = "Hello";
 		System.out.println(num);
 }
}


C:\Nishajava\Day 2\Ass 2> javac Main4.java
Main4.java:371: error: incompatible types: String cannot be converted to double
        double num = "Hello";
                     ^
1 error

ANS-  INCOMPATIABLE DATA TYPE
	'Hello' is a String
	double is a numeric (floating-point) type.
*/

//Correct Code

/*
public class Main4 {
    public static void main(String[] args) {
        double num = 10.5; // 
        System.out.println(num);
    }
}

C:\Nishajava\Day 2\Ass 2> javac Main4.java

C:\Nishajava\Day 2\Ass 2> java Main4
10.5
*/

//-------------------------------------------------------------------------------

//Snippet 15:

public class Main4 {
 public static void main(String[] args) {
 	int num1 = 10;
 	double num2 = 5.5;
 	int result = num1 + num2;
 		System.out.println(result);
 }
}
