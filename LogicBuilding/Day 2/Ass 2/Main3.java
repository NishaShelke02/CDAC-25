/* Error Statement
public class Main3 {
 public static int main(String[] args) {
   System.out.println("Hello, World!");
   return 0;
  }
}
 

C:\Nishajava\Day 2\Ass 2>java Main3
Error: Main method must return a value of type void in class Main3, please
define the main method as:
   public static void main(String[] args)
*/
Explaination
int
Here, Main methode must have a datatype of void , not return a value.
return 0 -
Main can not return value.
-------------------------------------------------------------------------------------------
//Correct Statement
public class Main3 {
	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
	}
}

C:\Nishajava\Day 2\Ass 2>javac Main3.java

C:\Nishajava\Day 2\Ass 2>java Main3
Hello, World!