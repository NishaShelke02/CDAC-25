public class Student {
	public static void main(String[] args){
		int score = 85;

		if(score >= 90){
			System.out.println("Grade: A");
		}else if (score >= 80){
			System.out.println("Grade: B");
		}else if (score >= 70){
			System.out.println("Grade: C");
		}else if (score >= 60){
			System.out.println("Grade: D");
		}else {
			System.out.println("Grade: F");

		}
	}
}


C:\Nishajava\Day 2\Ass 2\Section 2> javac Student.java

C:\Nishajava\Day 2\Ass 2\Section 2>java Student
Grade: B

