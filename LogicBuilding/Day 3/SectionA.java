//Snippet 1:

/*

public class SectionA {
 public static void main(String[] args) {
 	for (int i = 0; i < 10; i--) {
 		System.out.println(i);
 	}
 }
}

Ans -- The condition i < 10 is always true after the first iteration, causing an infinite     	loop. 

	This means i will become -1, -2, -3, and so on.
*/
//SOLUTION 

/*
public class SectionA {
 public static void main(String[] args) {

	for (int i = 0; i < 10; i++) {
    		System.out.println(i);
	}
 }

}

OUTPUT -- 

C:\Nishajava\Day 3>java SectionA
0
1
2
3
4
5
6
7
8
9
*/

//---------------------------------------------------------------------------------------

//Snippet 2:

 /*
public class SectionA {
 public static void main(String[] args) {
 	int count = 5;
 	while (count = 0) {
 		System.out.println(count);
 		count--;
 	}
 }
}


C:\Nishajava\Day 3>javac SectionA.java
SectionA.java:52: error: incompatible types: int cannot be converted to boolean
        while (count = 0) {
                     ^
1 error
*/

/* ANS-	assignment (=) does not return a boolean, so this results in a compilation error.
	Once count becomes 0, the condition count > 0 becomes false, and the loop stops.
*/

/*

public class SectionA {
 public static void main(String[] args) {
 	int count = 5;
 	while (count > 0) {
 		System.out.println(count);
 		count--;
 	}
 }
}

OUTPUT --
	
C:\Nishajava\Day 3>javac SectionA.java

C:\Nishajava\Day 3>java SectionA
5
4
3
2
1

*/
//--------------------------------------------------------------------------------------

//Snippet 3:
/*
public class SectionA {
 public static void main(String[] args) {
 	int num = 0;
 	do {
 		System.out.println(num);
 		num++;
 	 } while (num > 0);
 }
}
*/
/*
Ans -- The loop starts with num = 0.
       num is incremented (num++) inside the loop.
	Since num > 0 is always true after the first iteration, the loop never  	terminates, causing an infinite loop.

*/

/*
public class SectionA {
 public static void main(String[] args) {
 	int num = 0;
 	do {
 		System.out.println(num);
 		num++;
 	 } while (num < 7);
 }
}


C:\Nishajava\Day 3>javac SectionA.java

C:\Nishajava\Day 3>java SectionA
0
1
2
3
4
5
6

*/
//------------------------------------------------------------------------------------

//Snippet 4:
 /*
public class SectionA {
 public static void main(String[] args) {
 	for (int i = 1; i <= 10; i++) {
 	System.out.println(i);
 	}
 // Expected: 10 iterations with numbers 1 to 10
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
 }
}



C:\Nishajava\Day 3>javac SectionA.java

C:\Nishajava\Day 3>java SectionA
1
2
3
4
5
6
7
8
9
10

ANS -- IF Changed i <= to i < 10,  the loop executes exactly 9 times, as expected

*/
//--------------------------------------------------------------------------------


//Snippet 5:

public class SectionA {
 public static void main(String[] args) {
 	for (int i = 10; i >= 0; i++) {
 	System.out.println(i);
 	}
 }
}


ANS -- Infinite loop












