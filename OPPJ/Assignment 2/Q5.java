public class Q5 {
	public static void main(String[] args){
		int a = 23, b = 56;
		System.out.println("Befor swaping : " + a + b);
		a += b;
		b -= a;
		b =- b;
		a -= b;
		
			
		System.out.println("After swaping :a= " + a +",b= " + b);
	}
}
