public class Q19 {
    public static void main(String[] args) {
		char ch = 'a';
		char ch1 = 'A';
		
		String res =(ch >= 'A' && ch <= 'Z') ? "Uppercase" : 
                       (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a Letter";
					   
					   
		String res1 =(ch1 >= 'A' && ch1 <= 'Z') ? "Uppercase" : 
                     (ch1 >= 'a' && ch1 <= 'z') ? "Lowercase" : "Not a Letter";
					   
		System.out.println("Character is: " + res);
		System.out.println("Character is: " + res1);
	}
}
//Output
/*

C:\Nisha OOPJ\Assignment 2>java Q19
Charactera is: Lowercase
CharacterA is: Uppercase
*/