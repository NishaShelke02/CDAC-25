/* Error Statement

public class Main1 {
 	public void main(String[] args) {
 		System.out.println("Hello, World!");
 	}
}

C:\Nishajava\Day 2\Ass 2>javac Main1.java
Main1.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error
*/
-----------------------------------------------------------------------------------------

//Correct Statement:
public class Main1 {
	public static void main(String[] args) {     //Missing Static Keyword in main Method
		System.out.println("Hello,World!");
	}
}

C:\Nishajava\Day 2\Ass 2>javac Main1.java

C:\Nishajava\Day 2\Ass 2>java Main1
Hello,World!