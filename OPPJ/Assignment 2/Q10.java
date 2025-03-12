public class Q10 {
	public static void main(String[] args){
		char x = 'a';
		check(x);
		x = 'q';
		check(x);
		x = 'A';
		check(x);
		x = 'R';
		check(x);
	}
	
	public static void check(char a){
		char ch = Character.toLowerCase(a);
		String str = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u')? a + " is a vowel." : a + " is a consonant";  
		System.out.println(str);
	} 
}
//Output
/*
C:\Nisha OOPJ\Assignment 2>java Q10
a is a vowel.
q is a consonant
A is a vowel.
R is a consonant
*/
